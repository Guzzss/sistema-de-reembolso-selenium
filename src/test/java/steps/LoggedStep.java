package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.GestorPage;
import pages.LoggedPage;
import util.BaseTest;
import util.Browser;


public class LoggedStep extends Browser {

    SolicitarReembolsoStep solicitarReembolsoStep = new SolicitarReembolsoStep();
    LoggedPage loggedPage = new LoggedPage();

    @Test
    public void deletarReembolsoComSucesso() {
        solicitarReembolsoStep.solicitarReembolsoComSucesso();
        loggedPage.clicarNoExcluirReembolsoBtn();
        loggedPage.clicarNoConfirmarExclusaoBtn();
        BaseTest.esperar(LoggedPage.toastMsg, "Reembolso deletado");
        Assert.assertEquals("Reembolso deletado", loggedPage.toastMsg());
    }
}
