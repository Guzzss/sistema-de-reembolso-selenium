package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class CadastroPage {

    public static final By campoNome = By.cssSelector("#root > section > div > form > div:nth-child(1) > input[type=text]");
    public static final By campoEmail = By.cssSelector("#root > section > div > form > div:nth-child(2) > input[type=email]");
    public static final By campoSenha = By.cssSelector("#root > section > div > form > div:nth-child(3) > div > input[type=password]");
    public static final By campoConfirmarSenha = By.cssSelector("#root > section > div > form > div:nth-child(4) > input[type=password]");
    public static final By procurarAnexoBtn = By.cssSelector("#foto");
    public static final By cadastrarBtn = By.cssSelector("#root > section > div > form > button");

    public static final By voltarParaTelaDeLoginBtn = By.cssSelector("#root > section > div > a");
    public static final By campoNomeErro = By.cssSelector("#root > section > div > form > div:nth-child(1) > small");
    public static final By campoEmailErro = By.cssSelector("#root > section > div > form > div:nth-child(2) > small");
    public static final By campoSenhaErro = By.cssSelector("#root > section > div > form > div:nth-child(3) > small");
    public static final By campoConfirmarSenhaErro = By.cssSelector("#root > section > div > form > div:nth-child(4) > small");

    public void preencherNome() {
        BaseTest.sendKeys(campoNome, "Gustavo");
    }

    public void preencherEmail() {
        BaseTest.sendKeys(campoEmail, "lol2@dbccompany.com.br");
    }

    public void preencherSenha() {
        BaseTest.sendKeys(campoSenha, "Gust@vo123");
    }

    public void preencherConfirmarSenha() {
        BaseTest.sendKeys(campoConfirmarSenha, "Gust@vo123");
    }

    public void preencherConfirmarSenhaComSenhaDiferente() {
        BaseTest.sendKeys(campoConfirmarSenha, "ffdsfsdfsdfsd");
    }

    public void procurarAnexo() {}

    public void clicarNoCadastrarBtn() {
        BaseTest.click(cadastrarBtn);
    }

    public String campoNomeErro() {
        return BaseTest.getText(campoNomeErro);
    }

    public String campoEmailErro() {
        return BaseTest.getText(campoEmailErro);
    }

    public String campoSenhaErro() {
        return BaseTest.getText(campoSenhaErro);
    }

    public String campoConfirmarSenhaErro() {
        return BaseTest.getText(campoConfirmarSenhaErro);
    }

    public void clicarNoVoltarParaTelaDeLoginBtn() {
        BaseTest.click(voltarParaTelaDeLoginBtn);
    }

}