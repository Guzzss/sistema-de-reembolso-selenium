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

    @Test
    public void verificarAnexo() {
        solicitarReembolsoStep.solicitarReembolso();
        loggedPage.clicarNoSairBtn();
        loginStep.fazerLoginComoGestor();
        gestorPage.clicarNoAnexoBtn();
        Assert.assertNotNull(GestorPage.anexo);
    }

    @Test
    public void fazerPesquisa() {
        loginStep.fazerLoginComoGestor();
        gestorPage.clicarNoPesquisarBtn();
        gestorPage.preencherCampoPesquisa();
        gestorPage.clicarNoPesquisarBtn();

        BaseTest.esperar(GestorPage.campoNome, "Gustavo");
        Assert.assertEquals("Gustavo", gestorPage.validarCampoNome());
    }

    @Test
    public void filtrarPorTipoTodos() {
        loginStep.fazerLoginComoGestor();
        gestorPage.clicarNoTipoTodos();
        BaseTest.esperar(GestorPage.tipoReembolsoMsg, "Reembolsos (todos)");
        Assert.assertEquals("Reembolsos (todos)", gestorPage.tipoReembolsoMsg());
    }

    @Test
    public void filtrarPorTipoAberto() {
        loginStep.fazerLoginComoGestor();
        gestorPage.clicarNoTipoReembolsoBtn();
        gestorPage.clicarNoTipoAberto();
        BaseTest.esperar(GestorPage.tipoReembolsoMsg, "Reembolsos (aberto)");
        Assert.assertEquals("Reembolsos (aberto)", gestorPage.tipoReembolsoMsg());
    }

    @Test
    public void filtrarPorTipoAprovadoGestor() {
        loginStep.fazerLoginComoGestor();
        BaseTest.esperar(GestorPage.tipoReembolsoBtn, "Todos");
        gestorPage.clicarNoTipoAprovadoGestor();
        BaseTest.esperar(GestorPage.tipoReembolsoMsg, "Reembolsos (aprovado - gestor)");
        Assert.assertEquals("Reembolsos (aprovado - gestor)", gestorPage.tipoReembolsoMsg());
    }

    @Test
    public void filtrarPorTipoReprovadoGestor() {
        loginStep.fazerLoginComoGestor();
        BaseTest.esperar(GestorPage.tipoReembolsoBtn, "Todos");
        gestorPage.clicarNoTipoReprovadoGestor();
        BaseTest.esperar(GestorPage.tipoReembolsoMsg, "Reembolsos (reprovado - gestor)");
        Assert.assertEquals("Reembolsos (reprovado - gestor)", gestorPage.tipoReembolsoMsg());
    }

    @Test
    public void filtrarPorTipoReprovadoFinanceiro() {
        loginStep.fazerLoginComoGestor();
        gestorPage.clicarNoTipoReprovadoFinanceiro();
        BaseTest.esperar(GestorPage.tipoReembolsoMsg, "Reembolsos (reprovado - financeiro)");
        Assert.assertEquals("Reembolsos (reprovado - financeiro)", gestorPage.tipoReembolsoMsg());
    }

    @Test
    public void filtrarPorTipoPago() {
        loginStep.fazerLoginComoGestor();
        gestorPage.clicarNoTipoPago();
        BaseTest.esperar(GestorPage.tipoReembolsoMsg, "Reembolsos (fechado - pago)");
        Assert.assertEquals("Reembolsos (fechado - pago)", gestorPage.tipoReembolsoMsg());
    }
}
