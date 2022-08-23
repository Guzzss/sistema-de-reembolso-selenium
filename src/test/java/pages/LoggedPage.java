package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class LoggedPage {

    public final static By bemVindoMsg = By.cssSelector("#swal2-title");
    public final static By solicitarReembolsoBtn = By.cssSelector("#root > section > button");
    public final static By sairBtn = By.cssSelector("#root > header > div > button");
    public final static By editarReembolsoBtn = By.cssSelector("#root > section > section > ul > li:nth-child(1) > div > button:nth-child(2)");
    public final static By excluirReembolsoBtn = By.cssSelector("#root > section > section > ul > li:nth-child(1) > div > button:nth-child(3)");
    public final static By confirmarExclusaoBtn = By.cssSelector("body > div.swal2-container.swal2-center.swal2-backdrop-show > div > div.swal2-actions > button.swal2-confirm.swal2-styled");
    public final static By toastMsg = By.cssSelector("#swal2-title");
    public final static By nomeUsuario = By.cssSelector("#root > header > div:nth-child(2) > span");
    public final static By statusReembolso = By.cssSelector("#root > section > section > ul > li:nth-child(1) > span:nth-child(4)");
    public final static By filtrarPorTipoBtn = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div > select");
    public final static By tipoTodos = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div > select > option:nth-child(1)");
    public final static By tipoAberto = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div > select > option:nth-child(2)");
    public final static By tipoAprovadoGestor = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div > select > option:nth-child(3)");
    public final static By tipoReprovadoGestor = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div > select > option:nth-child(4)");
    public final static By tipoReprovadoFinanceiro = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div > select > option:nth-child(5)");
    public final static By tipoPago = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div > select > option:nth-child(6)");
    public final static By anexoBtn = By.cssSelector("#root > section > section > ul > li:nth-child(1) > div > button:nth-child(1)");

    public void clicarNoSolicitarReembolsoBtn() {
        BaseTest.click(solicitarReembolsoBtn);
    }

    public void clicarNoEditarReembolsoBtn() {
        BaseTest.click(editarReembolsoBtn);
    }
    public String bemVindoMsg() {
        return BaseTest.getText(bemVindoMsg);
    }

    public String toastMsg() {
//        BaseTest.esperarElemento(toastMsg);
       return BaseTest.getText(toastMsg);
    }

    public void clicarNoExcluirReembolsoBtn() {
        BaseTest.click(excluirReembolsoBtn);
    }

    public void clicarNoConfirmarExclusaoBtn() {
        BaseTest.click(confirmarExclusaoBtn);
    }

    public void clicarNoSairBtn() {
        BaseTest.click(sairBtn);
    }

    public void tipoTodos() {
        BaseTest.click(filtrarPorTipoBtn);
        BaseTest.click(tipoTodos);
    }

    public void tipoAberto() {
        BaseTest.click(filtrarPorTipoBtn);
        BaseTest.click(tipoAberto);
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

    public void clicarNoAnexoBtn() {
        BaseTest.click(anexoBtn);
    }

    public String nomeUsuario() {
        return BaseTest.getText(nomeUsuario);
    }


    public String statusReembolso() {
        return BaseTest.getText(statusReembolso);
    }
}
