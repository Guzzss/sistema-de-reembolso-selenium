package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class SolicitarReembolsoPage {

    public final static By titulo = By.cssSelector("#root > section > div > form > div:nth-child(1) > input[type=text]");
    public final static By valor = By.cssSelector("#root > section > div > form > div:nth-child(2) > input[type=text]");
    public final static By anexoBtn = By.cssSelector("#root > section > div > form > div:nth-child(3) > div > div > input[type=file]");
    public final static By solicitarReembolsoBtn = By.cssSelector("#root > section > div > form > button");

    public final static By tituloErroMsg = By.cssSelector("#root > section > div > form > div:nth-child(1) > small");

    public final static By valorErroMsg = By.cssSelector("#root > section > div > form > div:nth-child(2) > small");

    public void preencherTitulo() {
        BaseTest.sendKeys(titulo, "Teste de Reembolso");
    }

    public void preencherValor() {
        BaseTest.sendKeys(valor, "100");
    }

    public void clicarNoAnexoBtn() {
        BaseTest.sendKeys(anexoBtn, "C:\\Users\\gusta\\Downloads\\taya.jpg");
    }

    public void clicarNoSolicitarReembolsoBtn() {
        BaseTest.click(solicitarReembolsoBtn);
    }

    public String tituloErroMsg() {
        return BaseTest.getText(tituloErroMsg);
    }

    public String valorErroMsg() {
        return BaseTest.getText(valorErroMsg);
    }
}
