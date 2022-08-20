package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class LoginPage {

    public final static By emailCampo = By.cssSelector("#root > section > div > form > div:nth-child(1) > input[type=email]");
    public final static By senhaCampo = By.cssSelector("#root > section > div > form > div:nth-child(2) > div > input[type=password]");
    public final static By entrarBtn = By.cssSelector("#root > section > div > form > button");
    public final static By naoPossuiCadastroBtn = By.cssSelector("#root > section > div > a");
    public final static By fazerLoginMsg = By.cssSelector("#root > section > div > div > h1");

    public final static By emailErro = By.cssSelector("#root > section > div > form > div:nth-child(1) > small");
    public final static By senhaErro = By.cssSelector("#root > section > div > form > div:nth-child(2) > small");
    public final static By campoInvalido = By.cssSelector("#swal2-title");



    public void preencherEmail() {
        BaseTest.sendKeys(emailCampo, "lol@dbccompany.com.br");
    }
    public void preencherSenha() {
        BaseTest.sendKeys(senhaCampo, "Gust@vo123");
    }

    ///  ///// ///// ///// ///// ///// ///// GESTOR
    public void preencherEmailGestor() {
        BaseTest.sendKeys(emailCampo, "QA@dbccompany.com.br");
    }

    public void preencherSenhaGestor() {
        BaseTest.sendKeys(senhaCampo, "Sua@Senha!23");
    }

    ///// ///// ///// ///// ///// ///// //////FINANCEIRO

    public void preencherEmailFinanceiro() {
        BaseTest.sendKeys(emailCampo, "QAFinanceiro@dbccompany.com.br");
    }
    public void preencherSenhaFinanceiro() {
        BaseTest.sendKeys(senhaCampo, "Sua@Senha!23");
    }

    ///// ///// ///// ///// ///// ///// /////ADMINISTRADOR
    public void preencherEmailAdmin() {
        BaseTest.sendKeys(emailCampo, "QaAdm@dbccompany.com.br");
    }
    public void preencherSenhaAdmin() {
        BaseTest.sendKeys(senhaCampo, "Sua@Senha!23");
    }

    public void preencherEmailInvalido() {
        BaseTest.sendKeys(emailCampo, "gdfghjdfighdfio@dbccompany.com.br");
    }


    public void preencherSenhaInvalida() {
        BaseTest.sendKeys(senhaCampo, "gopdfjgionasdginasdi0gbnasdgi0bsagibsadgi0bsdgui0basduigbasdgsdgsdgh");
    }

    public void clicarNoEntrarBtn() {
        BaseTest.click(entrarBtn);
    }

    public void clicarNoNaoPossuiCadastroBtn() {
        BaseTest.click(naoPossuiCadastroBtn);
    }
    public String fazerLoginMsg() {
        return BaseTest.getText(fazerLoginMsg);
    }

    public String emailErro() {
        return BaseTest.getText(emailErro);
    }

    public String senhaErro() {
        return BaseTest.getText(senhaErro);
    }

    public String campoInvalido() {
        return BaseTest.getText(campoInvalido);
    }
}
