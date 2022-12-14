package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.*;
import util.BaseTest;
import util.Browser;

public class CadastroStep extends Browser {

    LoginPage loginPage = new LoginPage();
    CadastroPage cadastroPage = new CadastroPage();
    LoginStep loginStep = new LoginStep();
    AdmPage admPage = new AdmPage();
    LoggedPage loggedPage = new LoggedPage();

    @Test
    public void cadastroComFotoComSucesso() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmailFaker();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.procurarAnexo();
        cadastroPage.clicarNoCadastrarBtn();

        BaseTest.esperar(LoggedPage.nomeUsuario, "Gustavo");
        Assert.assertEquals("Gustavo", loggedPage.nomeUsuario());
    }

    @Test
    public void cadastroSemFotoComSucesso() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmailFaker();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.clicarNoCadastrarBtn();
        BaseTest.esperar(LoggedPage.nomeUsuario, "Gustavo");
        Assert.assertEquals("Gustavo", loggedPage.nomeUsuario());
    }

    @Test
    public void cadastroSemPassarNome() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherEmail();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(cadastroPage.campoNomeErro(), "Nome obrigatorio!");
    }

    @Test
    public void cadastroComEmailExistente() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmail();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(cadastroPage.emailJaPossuiCadastro(), "Email j?? cadastrado");
    }

    @Test
    public void cadastroSemPassarEmail() {

        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(cadastroPage.campoEmailErro(), "Email inv??lido!");
    }

    @Test
    public void cadastroSemConfirmarSenha() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmail();
        cadastroPage.preencherSenha();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(cadastroPage.campoConfirmarSenhaErro(), "Confirme a senha!");
    }

    @Test
    public void cadastroComEmailInvalido() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmailInvalido();
        cadastroPage.preencherSenha();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(cadastroPage.campoEmailErro(), "Email inv??lido!");
    }

    @Test
    public void cadastroComSenhaInvalida() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmailFaker();
        cadastroPage.preencherSenhaInvalida();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.procurarAnexo();
        cadastroPage.clicarNoCadastrarBtn();
        Assert.assertEquals(cadastroPage.campoSenhaErro(), "Obrigat??rio conter: 8 caracteres, uma letra mai??scula, uma letra min??scula, um n??mero e um caracter especial.");
    }
    @Test
    public void cadastroSemPassarSenhas() {

        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmail();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(cadastroPage.campoSenhaErro(), "Obrigat??rio conter: 8 caracteres, uma letra mai??scula, uma letra min??scula, um n??mero e um caracter especial.");
        Assert.assertEquals(cadastroPage.campoConfirmarSenhaErro(), "Confirme a senha!");
    }

    @Test
    public void cadastroComSenhaDiferentes() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmail();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenhaComSenhaDiferente();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(cadastroPage.campoConfirmarSenhaErro(), "Senhas diferentes!");
    }

    @Test
    public void CadastroSemPreencherNenhumCampo() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(cadastroPage.campoNomeErro(), "Nome obrigatorio!");
        Assert.assertEquals(cadastroPage.campoEmailErro(), "Email inv??lido!");
        Assert.assertEquals(cadastroPage.campoSenhaErro(), "Obrigat??rio conter: 8 caracteres, uma letra mai??scula, uma letra min??scula, um n??mero e um caracter especial.");
        Assert.assertEquals(cadastroPage.campoConfirmarSenhaErro(), "Confirme a senha!");
    }

    @Test
    public void cadastrarColaboradorComoAdmComSucesso() {
        loginStep.fazerLoginComoAdm();
        admPage.clicarNoCadastrarUsuarioBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmailFaker();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.clicarNoTipoDoUsuarioColaborador();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(admPage.verificarSeFoiCadastrado(), "Cadastrar usu??rio");
        Assert.assertEquals(admPage.toasMsg(), "Usuario cadastrado");
    }

    @Test
    public void cadastrarGestorComoAdmComSucesso() {
        loginStep.fazerLoginComoAdm();
        admPage.clicarNoCadastrarUsuarioBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmailFaker();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.clicarNoTipoDoUsuarioGestor();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(admPage.verificarSeFoiCadastrado(), "Cadastrar usu??rio");
        Assert.assertEquals(admPage.toasMsg(), "Usuario cadastrado");
    }

    @Test
    public void cadastrarFinanceiroComoAdmComSucesso() {
        loginStep.fazerLoginComoAdm();
        admPage.clicarNoCadastrarUsuarioBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmailFaker();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.clicarNoTipoDoUsuarioFinanceiro();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(admPage.verificarSeFoiCadastrado(), "Cadastrar usu??rio");
        Assert.assertEquals(admPage.toasMsg(), "Usuario cadastrado");
    }

    @Test
    public void cadastrarAdmComoAdmComSucesso() {
        loginStep.fazerLoginComoAdm();
        admPage.clicarNoCadastrarUsuarioBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmailFaker();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.clicarNoTipoDoUsuarioAdm();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(admPage.verificarSeFoiCadastrado(), "Cadastrar usu??rio");
        Assert.assertEquals(admPage.toasMsg(), "Usuario cadastrado");
    }

    @Test
    public void voltarParaTelaDeLoginComSucesso() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.clicarNoVoltarParaTelaDeLoginBtn();

        Assert.assertEquals(loginPage.fazerLoginMsg(), "Fazer login");
    }
}
