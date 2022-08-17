package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import util.Browser;

public class LoginStep extends Browser {

    LoginPage loginPage = new LoginPage();

    @Test
    public void clicarNoNaoPossuiCadastro() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
    }

    @Test
    public void fazerLoginComSucesso() {
        loginPage.preencherEmail();
        loginPage.preencherSenha();
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

        Assert.assertEquals(loginPage.campoInvalido(), "Login ou Senha Inválidos");
    }

    @Test
    public void fazerLoginComSenhaInvalida() {
        loginPage.preencherEmail();
        loginPage.preencherSenhaInvalida();
        loginPage.clicarNoEntrarBtn();

        Assert.assertEquals(loginPage.campoInvalido(), "Login ou Senha Inválidos");
    }

}