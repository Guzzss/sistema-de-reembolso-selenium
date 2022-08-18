package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.LoggedPage;
import util.BaseTest;
import util.Browser;


public class LoggedStep extends Browser {

    SolicitarReembolsoStep solicitarReembolsoStep = new SolicitarReembolsoStep();
    LoggedPage loggedPage = new LoggedPage();

    public void esperar() {
        BaseTest.esperar(50000);
    }

    @Test
    public void deletarReembolsoComSucesso() {
        solicitarReembolsoStep.solicitarReembolsoComSucesso();
        loggedPage.clicarNoExcluirReembolsoBtn();
        loggedPage.clicarNoConfirmarExclusaoBtn();
        Assert.assertEquals(loggedPage.toastMsg(), "Reembolso deletado");
    }
}
