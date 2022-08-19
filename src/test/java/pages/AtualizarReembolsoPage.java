package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class AtualizarReembolsoPage {

    public static final By titulo = By.cssSelector("#root > section > div > form > div:nth-child(1) > input[type=text]");
    public static final By valor = By.cssSelector("#root > section > div > form > div:nth-child(2) > input[type=text]");
    public static final By anexoBtn = By.cssSelector("#root > section > div > form > div:nth-child(3) > div > div > input[type=file]");
    public static final By deletarAnexoBtn = By.cssSelector("#root > section > div > form > div:nth-child(3) > div > div > button > svg > path");
    public static final By atualizarReembolsoBtn = By.cssSelector("#root > section > div > form > button");
    public static final By tituloErroMsg = By.cssSelector("#root > section > div > form > div:nth-child(1) > small");
    public static final By valorErroMsg = By.cssSelector("#root > section > div > form > div:nth-child(2) > small");
    public static final By anexoErroMsg = By.cssSelector("#root > section > div > form > div:nth-child(3) > small");

    public void limparCampoTitulo() {
        BaseTest.clear(titulo);
    }

    public void limparCampoAnexo() {
        BaseTest.click(deletarAnexoBtn);
    }

    public void limparCampoValor() {
        BaseTest.clear(valor);
    }

    public void preencherTitulo() {
        BaseTest.sendKeys(titulo, "Teste de Reembolso editado");
    }

    public void preencherValor() {
        BaseTest.sendKeys(valor, "1000");
    }

    public void clicarNoAnexoBtn() {
        BaseTest.sendKeys(anexoBtn, "C:\\Users\\gusta\\Downloads\\taya.jpg");
    }

    public void clicarNoAtualizarReembolsoBtn() {
        BaseTest.click(atualizarReembolsoBtn);
    }

    public String tituloErroMsg() {
        return BaseTest.getText(tituloErroMsg);
    }

    public String valorErroMsg() {
        return BaseTest.getText(valorErroMsg);
    }

    public String anexoErroMsg() {
        return BaseTest.getText(anexoErroMsg);
    }

}
