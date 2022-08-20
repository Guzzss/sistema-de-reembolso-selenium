package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class FinanceiroPage {

    public static final By pagarReembolsoBtn = By.cssSelector("#root > section > section > ul > li:nth-child(1) > div > button:nth-child(2)");
    public static final By negarReembolsoBtn = By.cssSelector("#root > section > section > ul > li:nth-child(1) > div > button:nth-child(3)");
    public static final By toastMsg = By.cssSelector("body > div.swal2-container.swal2-top.swal2-backdrop-show > div");
    public static final By filtrarPorTipoBtn = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select");
    public static final By tipoTodos = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(1)");
    public static final By tipoAberto = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(2)");
    public static final By tipoAprovadoGestor = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(3)");
    public static final By tipoReprovadoGestor = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(4)");
    public static final By tipoReprovadoFinanceiro = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(5)");
    public static final By tipoPago = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(1) > select > option:nth-child(6)");
    public static final By reembolsoMsg = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div:nth-child(1) > h2");
    public static final By statusReembolsoMsg = By.cssSelector("#root > section > section > ul > li:nth-child(1) > span:nth-child(6)");

    public static final By pesquisarBtn = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(2) > button");
    public static final By pesquisarCampo = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div:nth-child(2) > input[type=text]");
    public static final By nomeColaborador = By.cssSelector("#root > section > section > ul > li:nth-child(1) > span:nth-child(2)");

    public void clicarNoPagarReembolsoAprovadoPeloGestorBtn() {
        BaseTest.esperar(statusReembolsoMsg,"aprovado gestor");
        BaseTest.click(pagarReembolsoBtn);
    }

    public void clicarNoNegarReembolsoAprovadoPeloGestorBtn() {
        BaseTest.esperar(statusReembolsoMsg,"aprovado gestor");
        BaseTest.click(negarReembolsoBtn);
    }
    public void clicarNoPagarReembolsoAberto() {
        BaseTest.esperar(statusReembolsoMsg,"aberto");
        BaseTest.click(pagarReembolsoBtn);
    }

    public void clicarNoNegarReembolsoAbertoBtn() {
        BaseTest.esperar(statusReembolsoMsg,"aberto");
        BaseTest.click(negarReembolsoBtn);
    }

    public void clicarNoPagarReembolsoReprovadoPeloGestorBtn() {
        BaseTest.esperar(statusReembolsoMsg,"reprovado gestor");
        BaseTest.click(pagarReembolsoBtn);
    }

    public void clicarNoPagarReembolsoReprovadoPeloFinanceiroBtn() {
        BaseTest.esperar(statusReembolsoMsg,"reprovado financeiro");
        BaseTest.click(pagarReembolsoBtn);
    }

    public void clicarNoPagarReembolsoPagoBtn() {
        BaseTest.esperar(statusReembolsoMsg,"fechado(pago)");
        BaseTest.click(pagarReembolsoBtn);
    }

    public void clicarNoReprovarReembolsoPagoBtn() {
        BaseTest.esperar(statusReembolsoMsg,"fechado(pago)");
        BaseTest.click(pagarReembolsoBtn);
    }
    public void clicarNoFiltrarPorTipoBtn() {
        BaseTest.click(filtrarPorTipoBtn);
    }

    public void tipoAberto() {
        BaseTest.click(filtrarPorTipoBtn);
        BaseTest.click(tipoAberto);
    }

    public void tipoTodos() {
        BaseTest.click(filtrarPorTipoBtn);
        BaseTest.click(tipoTodos);
    }
    public void tipoAprovadoGestor() {
        BaseTest.click(filtrarPorTipoBtn);
        BaseTest.click(tipoAprovadoGestor);
    }

    public void tipoReprovadoGestor() {
        BaseTest.click(filtrarPorTipoBtn);
        BaseTest.click(tipoReprovadoGestor);
    }

    public void tipoReprovadoFinanceiro() {
        BaseTest.click(filtrarPorTipoBtn);
        BaseTest.click(tipoReprovadoFinanceiro);
    }

    public void tipoPago() {
        BaseTest.click(filtrarPorTipoBtn);
        BaseTest.click(tipoPago);
    }
    public void clicarNoPesquisarBtn() {
        BaseTest.click(pesquisarBtn);
    }

    public void preencherCampoPesquisar() {
        BaseTest.sendKeys(pesquisarCampo, "Gabriel");
    }

    public String toastMsg() {
        return BaseTest.getText(toastMsg);
    }

    public String reembolsoStatusMsg() {
        return BaseTest.getText(statusReembolsoMsg);
    }

    public String filtrarPorTipoBtn() {
        return BaseTest.getText(filtrarPorTipoBtn);
    }
    public String reembolsoMsg() {
        return BaseTest.getText(reembolsoMsg);
    }
    public String nomeColaborador() {
        return BaseTest.getText(nomeColaborador);
    }
}
