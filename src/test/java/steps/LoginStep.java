package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.GestorPage;
import pages.LoggedPage;
import pages.LoginPage;
import util.Browser;

public class LoginStep extends Browser {

    LoginPage loginPage = new LoginPage();

    LoggedPage loggedPage = new LoggedPage();
    GestorPage gestorPage = new GestorPage();

    @Test
    public void clicarNoNaoPossuiCadastro() {
        loginPage.clicarNoNaoPossuiCadastroBtn();

    }

    @Test
    public void fazerLoginComSucesso() {
        loginPage.preencherEmail();
        loginPage.preencherSenha();
        loginPage.clicarNoEntrarBtn();

        Assert.assertEquals(loggedPage.bemVindoMsg(), "Bem vindo!");
    }

    @Test
    public void fazerLoginComoGestorComsucesso() {
        loginPage.preencherEmailGestor();
        loginPage.preencherSenhaGestor();
        loginPage.clicarNoEntrarBtn();

        Assert.assertEquals(loggedPage.bemVindoMsg(), "Bem vindo!");
    }

    public void fazerLoginComoGestor() {
        loginPage.preencherEmailGestor();
        loginPage.preencherSenhaGestor();
        loginPage.clicarNoEntrarBtn();
    }

    @Test
    public void fazerLoginComoFinanceiroComSucesso() {
        loginPage.preencherEmailFinanceiro();
        loginPage.preencherSenhaFinanceiro();
        loginPage.clicarNoEntrarBtn();
        Assert.assertEquals(loggedPage.bemVindoMsg(), "Bem vindo!");
    }
    @Test
    public void fazerLoginComoFinanceiro() {
        loginPage.preencherEmailFinanceiro();
        loginPage.preencherSenhaFinanceiro();
        loginPage.clicarNoEntrarBtn();
    }

    @Test
    public void fazerLoginComoAdmComSucesso() {
        loginPage.preencherEmailAdmin();
        loginPage.preencherSenhaAdmin();
        loginPage.clicarNoEntrarBtn();
        Assert.assertEquals(loggedPage.bemVindoMsg(), "Bem vindo!");
    }
    @Test
    public void fazerLoginComoAdm() {
        loginPage.preencherEmailAdmin();
        loginPage.preencherSenhaAdmin();
        loginPage.clicarNoEntrarBtn();
    }

    @Test
    public void fazerLoginSemPassarEmail() {
        loginPage.preencherSenha();
        loginPage.clicarNoEntrarBtn();

        Assert.assertEquals(loginPage.emailErro(), "Email obrigatório!");
    }

    @Test
    public void fazerLoginSemPassarSenha() {
        loginPage.preencherEmail();
        loginPage.clicarNoEntrarBtn();

        Assert.assertEquals(loginPage.senhaErro(), "Senha obrigatória!");
    }

    @Test
    public void fazerLoginSemPreencherCampos() {
        loginPage.clicarNoEntrarBtn();

        Assert.assertEquals(loginPage.emailErro(), "Email obrigatório!");
        Assert.assertEquals(loginPage.senhaErro(), "Senha obrigatória!");
    }

    @Test
    public void fazerLoginComEmailInvalido() {
        loginPage.preencherEmailInvalido();
        loginPage.preencherSenha();
        loginPage.clicarNoEntrarBtn();

        Assert.assertEquals(loginPage.campoInvalido(), "Email ou Senha inválidos");
    }

    @Test
    public void fazerLoginComSenhaInvalida() {
        loginPage.preencherEmail();
        loginPage.preencherSenhaInvalida();
        loginPage.clicarNoEntrarBtn();

        Assert.assertEquals(loginPage.campoInvalido(), "Email ou Senha inválidos");
    }
}
