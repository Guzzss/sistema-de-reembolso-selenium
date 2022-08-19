package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.GestorPage;
import pages.LoggedPage;
import util.BaseTest;
import util.Browser;

public class GestorStep extends Browser {

    GestorPage gestorPage = new GestorPage();
    LoginStep loginStep = new LoginStep();

    LoggedPage loggedPage = new LoggedPage();

    SolicitarReembolsoStep solicitarReembolsoStep = new SolicitarReembolsoStep();

    @Test
    public void aprovarReembolsoComSucesso() {
        solicitarReembolsoStep.solicitarReembolso();
        loggedPage.clicarNoSairBtn();
        loginStep.fazerLoginComoGestor();
        gestorPage.clicarNoAprovarReembolso();
        BaseTest.esperar(GestorPage.toastMsg, "Reembolso Aprovado!");
        Assert.assertEquals("Reembolso Aprovado!", gestorPage.toastMsg());
    }

    @Test
    public void reprovarReembolsoComSucesso() {
        solicitarReembolsoStep.solicitarReembolso();
        loggedPage.clicarNoSairBtn();
        loginStep.fazerLoginComoGestor();
        gestorPage.clicarNoReprovarReembolso();
        BaseTest.esperar(GestorPage.toastMsg, "Reembolso Negado!");
        Assert.assertEquals("Reembolso Negado!", gestorPage.toastMsg());
    }


}
