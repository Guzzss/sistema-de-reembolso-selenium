package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.FinanceiroPage;
import pages.LoggedPage;
import util.BaseTest;
import util.Browser;

public class FinanceiroStep extends Browser {

    FinanceiroPage financeiroPage = new FinanceiroPage();
    LoginStep loginStep = new LoginStep();
    LoggedPage loggedPage = new LoggedPage();

    GestorStep gestorStep = new GestorStep();

    @Test
    public void fazerPesquisaComSucesso() {
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.clicarNoPesquisarBtn();
        financeiroPage.preencherCampoPesquisar();
        financeiroPage.clicarNoPesquisarBtn();
        Assert.assertEquals("Gustavo", financeiroPage.nomeColaborador());
    }

    @Test
    public void pagarReembolsoComSucesso() {
        gestorStep.aprovarReembolsoComSucesso();
        loggedPage.clicarNoSairBtn();
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.clicarNoPesquisarBtn();
        financeiroPage.tipoAprovadoGestor();
        financeiroPage.clicarNoPagarReembolsoAprovadoPeloGestorBtn();
        BaseTest.esperar(FinanceiroPage.toastMsg, "Reembolso Pago!");
        Assert.assertEquals("Reembolso Pago!", financeiroPage.toastMsg());
    }

    @Test
    public void negarReembolsoComSucesso() {
        gestorStep.aprovarReembolsoComSucesso();
        loggedPage.clicarNoSairBtn();
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.clicarNoPesquisarBtn();
        financeiroPage.tipoAprovadoGestor();
        financeiroPage.clicarNoNegarReembolsoAprovadoPeloGestorBtn();
        BaseTest.esperar(FinanceiroPage.toastMsg, "Reembolso Negado!");
        Assert.assertEquals("Reembolso Negado!", financeiroPage.toastMsg());
    }

    @Test
    public void filtrarPorTipoTodos() {
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.tipoTodos();
        BaseTest.esperar(FinanceiroPage.reembolsoMsg, "Reembolsos (todos)");
        Assert.assertEquals("Reembolsos (todos)", financeiroPage.reembolsoMsg());
    }

    @Test
    public void filtrarPorTipoAberto() {
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.tipoAberto();
        BaseTest.esperar(FinanceiroPage.reembolsoMsg, "Reembolsos (aberto)");
        Assert.assertEquals("Reembolsos (aberto)", financeiroPage.reembolsoMsg());
    }
    @Test
    public void filtrarPorTipoAprovadoGestor() {
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.tipoAprovadoGestor();
        BaseTest.esperar(FinanceiroPage.reembolsoMsg, "Reembolsos (aprovado - gestor)");
        Assert.assertEquals("Reembolsos (aprovado - gestor)", financeiroPage.reembolsoMsg());
    }

    @Test
    public void filtrarPorTipoReprovadoGestor() {
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.tipoReprovadoGestor();
        BaseTest.esperar(FinanceiroPage.reembolsoMsg, "Reembolsos (reprovado - gestor)");
        Assert.assertEquals("Reembolsos (reprovado - gestor)", financeiroPage.reembolsoMsg());
    }

    @Test
    public void filtrarPorTipoReprovadoFinanceiro() {
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.tipoReprovadoFinanceiro();
        BaseTest.esperar(FinanceiroPage.reembolsoMsg, "Reembolsos (reprovado - financeiro)");
        Assert.assertEquals("Reembolsos (reprovado - financeiro)", financeiroPage.reembolsoMsg());
    }

    @Test
    public void filtrarPorTipoPago() {
        loginStep.fazerLoginComoFinanceiro();
        financeiroPage.tipoPago();
        BaseTest.esperar(FinanceiroPage.reembolsoMsg, "Reembolsos (fechado - pago)");
        Assert.assertEquals("Reembolsos (fechado - pago)", financeiroPage.reembolsoMsg());
    }
}

