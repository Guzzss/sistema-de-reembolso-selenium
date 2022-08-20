package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.BaseTest;

import java.util.List;

public class GestorPage extends BaseTest {

    public final static By aprovarReembolso = By.cssSelector("#root > section > section > ul > li:nth-child(1) > div > button:nth-child(2)");
    public final static By reprovarReembolso = By.cssSelector("#root > section > section > ul > li:nth-child(1) > div > button:nth-child(3)");
    public final static By anexo = By.cssSelector("#root > section > section > ul > li:nth-child(1) > div > button:nth-child(1)");
    public final static By toastMsg = By.cssSelector("#swal2-title");
    public final static By preencherCampoPesquisa = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(2) > input[type=text]");
    public final static By clicarNoPesquisar = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(2) > button");
    public final static By tipoReembolsoBtn = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select");
    public final static By tipoTodos = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(1)");
    public final static By tipoAberto = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(2)");
    public final static By tipoAprovadoGestor = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(3)");
    public final static By tipoReprovadoGestor = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(4)");
    public final static By tipoReprovadoFinanceiro = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(5)");
    public final static By tipoPago = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(6)");
    public final static By campoNome = By.cssSelector("#root > section > section > ul > li:nth-child(1) > span:nth-child(2)");
    public final static By campoGestor = By.cssSelector("#root > header > div:nth-child(1) > h2");

    public final static By tipoReembolsoMsg = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div:nth-child(1) > h2");
    public void preencherCampoPesquisa() {
        BaseTest.sendKeys(preencherCampoPesquisa, "Gustavo");
    }

    public void clicarNoPesquisarBtn() {
        BaseTest.click(clicarNoPesquisar);
    }

    public void clicarNoAprovarReembolso() {
        BaseTest.click(aprovarReembolso);
    }

    public void clicarNoAnexoBtn(){
        BaseTest.click(anexo);
    }

    public void clicarNoReprovarReembolso() {
        BaseTest.click(reprovarReembolso);
    }
    public String toastMsg() {
        return BaseTest.getText(toastMsg);
    }

    public String validarCampoNome() {
        return BaseTest.getText(campoNome);
    }

    public void clicarNoTipoTodos() {
        BaseTest.click(tipoReembolsoBtn);
        BaseTest.click(tipoTodos);
    }

    public void clicarNoTipoReembolsoBtn() {
        BaseTest.click(tipoReembolsoBtn);
    }
    public void clicarNoTipoAberto() {
//        BaseTest.click(tipoReembolsoBtn);
        BaseTest.click(tipoAberto);
    }

    public void clicarNoTipoAprovadoGestor() {
        BaseTest.click(tipoReembolsoBtn);
        BaseTest.click(tipoAprovadoGestor);
    }

    public void clicarNoTipoReprovadoGestor() {
        BaseTest.click(tipoReembolsoBtn);
        BaseTest.click(tipoReprovadoGestor);
    }

    public void clicarNoTipoReprovadoFinanceiro() {
        BaseTest.click(tipoReembolsoBtn);
        BaseTest.click(tipoReprovadoFinanceiro);
    }

    public void clicarNoTipoPago() {
        BaseTest.click(tipoReembolsoBtn);
        BaseTest.click(tipoPago);
    }

    public String validarCampoGestor() {
        return BaseTest.getText(campoGestor);
    }
    public String tipoReembolsoMsg() {
       return BaseTest.getText(tipoReembolsoMsg);
    }
}
