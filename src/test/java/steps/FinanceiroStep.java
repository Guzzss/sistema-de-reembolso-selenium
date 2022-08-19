package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.FinanceiroPage;
import pages.GestorPage;
import pages.LoggedPage;
import util.BaseTest;
import util.Browser;

public class FinanceiroStep extends Browser {

    FinanceiroPage financeiroPage = new FinanceiroPage();
    SolicitarReembolsoStep solicitarReembolsoStep = new SolicitarReembolsoStep();
    LoginStep loginStep = new LoginStep();
    LoggedStep loggedStep = new LoggedStep();
    LoggedPage loggedPage = new LoggedPage();

    @Test
    public void pagarReembolsoComSucesso() {
        solicitarReembolsoStep.solicitarReembolso();
        loggedPage.clicarNoSairBtn();
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.clicarNoPagarReembolsoBtn();
        BaseTest.esperar(FinanceiroPage.toastMsg, "Reembolso Pago!");
        Assert.assertEquals("Reembolso Pago!", financeiroPage.toastMsg());
    }

    @Test
    public void negarReembolsoComSucesso() {
        solicitarReembolsoStep.solicitarReembolso();
        loggedPage.clicarNoSairBtn();
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.clicarNoNegarReembolsoBtn();
        BaseTest.esperar(FinanceiroPage.toastMsg, "Reembolso Negado!");
        Assert.assertEquals("Reembolso Negado!", financeiroPage.toastMsg());
    }



}
