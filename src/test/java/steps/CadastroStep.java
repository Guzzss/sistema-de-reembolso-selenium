package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.CadastroPage;
import pages.LoginPage;
import util.Browser;

public class CadastroStep extends Browser {

    LoginPage loginPage = new LoginPage();
    CadastroPage cadastroPage = new CadastroPage();

    @Test
    public void cadastroComFotoComSucesso() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmailFaker();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.procurarAnexo();
        cadastroPage.clicarNoCadastrarBtn();
    }

    @Test
    public void cadastroSemFotoComSucesso() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmailFaker();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.clicarNoCadastrarBtn();
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

        Assert.assertEquals(cadastroPage.dadosIncorretos(), "Dados incorretos");
    }

    @Test
    public void cadastroSemPassarEmail() {

        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherSenha();
        cadastroPage.preencherConfirmarSenha();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(cadastroPage.campoEmailErro(), "Email inválido!");
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
    public void cadastroSemPassarSenhas() {

        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.preencherNome();
        cadastroPage.preencherEmail();
        cadastroPage.clicarNoCadastrarBtn();

        Assert.assertEquals(cadastroPage.campoSenhaErro(), "Obrigatório conter: 8 caracteres, uma letra maiúscula, uma letra minúscula, um número e um caracter especial.");
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
        Assert.assertEquals(cadastroPage.campoEmailErro(), "Email inválido!");
        Assert.assertEquals(cadastroPage.campoSenhaErro(), "Obrigatório conter: 8 caracteres, uma letra maiúscula, uma letra minúscula, um número e um caracter especial.");
        Assert.assertEquals(cadastroPage.campoConfirmarSenhaErro(), "Confirme a senha!");
    }

    @Test
    public void voltarParaTelaDeLoginComSucesso() {
        loginPage.clicarNoNaoPossuiCadastroBtn();
        cadastroPage.clicarNoVoltarParaTelaDeLoginBtn();

        Assert.assertEquals(loginPage.fazerLoginMsg(), "Fazer login");

    }
}
