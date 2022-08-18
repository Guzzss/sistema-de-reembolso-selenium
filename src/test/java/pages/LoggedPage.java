package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class LoggedPage {

    public final static By bemVindoMsg = By.cssSelector("#swal2-title");
    public final static By solicitarReembolsoBtn = By.cssSelector("#root > section > button");

    public final static By sairBtn = By.cssSelector("#root > header > div > button");

    public final static By editarReembolsoBtn = By.cssSelector("#root > section > section > ul > li > div > button:nth-child(1)");
    public final static By excluirReembolsoBtn = By.cssSelector("#root > section > section > ul > li > div > button:nth-child(2)");
    public final static By confirmarExclusaoBtn = By.cssSelector("body > div.swal2-container.swal2-center.swal2-backdrop-show > div > div.swal2-actions > button.swal2-confirm.swal2-styled");
    public final static By tituloReembolso = By.cssSelector("#root > section > section > ul > li > span:nth-child(1)");
    public final static By toastMsg = By.cssSelector("#swal2-title");
//    public final static By reembolsoDeletadoMsg = By.cssSelector("#swal2-title");



    public void clicarNoSolicitarReembolsoBtn() {
        BaseTest.click(solicitarReembolsoBtn);
    }

    public void clicarNoEditarReembolsoBtn() {
        BaseTest.click(editarReembolsoBtn);
    }
    public String bemVindoMsg() {
        return BaseTest.getText(bemVindoMsg);
    }

    public String tituloReembolso() {
        return BaseTest.getText(tituloReembolso);
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

//    public void
}
