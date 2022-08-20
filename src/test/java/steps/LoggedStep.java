package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.LoggedPage;
import pages.LoginPage;
import util.BaseTest;
import util.Browser;


public class LoggedStep extends Browser {

    SolicitarReembolsoStep solicitarReembolsoStep = new SolicitarReembolsoStep();
    LoggedPage loggedPage = new LoggedPage();
    LoginStep loginStep = new LoginStep();

    LoginPage loginPage = new LoginPage();

    @Test
    public void deletarReembolsoComSucesso() {
        solicitarReembolsoStep.solicitarReembolsoComSucesso();
        loggedPage.clicarNoExcluirReembolsoBtn();
        loggedPage.clicarNoConfirmarExclusaoBtn();
        BaseTest.esperar(LoggedPage.toastMsg, "Reembolso deletado");
        Assert.assertEquals("Reembolso deletado", loggedPage.toastMsg());
    }

    public void deletarReembolso() {
        loggedPage.clicarNoExcluirReembolsoBtn();
        loggedPage.clicarNoConfirmarExclusaoBtn();
    }

    @Test
    public void filtrarPorTipoTodos() {
        loginStep.fazerLoginComSucesso();
        loggedPage.tipoTodos();
    }

    @Test
    public void filtrarPorTipoAberto() {
        loginStep.fazerLoginComSucesso();
        loggedPage.tipoAberto();
        Assert.assertEquals("aberto", loggedPage.statusReembolso());
    }

    @Test
    public void filtrarPorTipoAprovadoGestor() {
        loginStep.fazerLoginComSucesso();
        loggedPage.tipoAprovadoGestor();
        Assert.assertEquals("aprovado gestor", loggedPage.statusReembolso());
    }

    @Test
    public void filtrarPorTipoReprovadoGestor() {
        loginStep.fazerLoginComSucesso();
        loggedPage.tipoReprovadoGestor();
        Assert.assertEquals("reprovado gestor", loggedPage.statusReembolso());
    }

    @Test
    public void filtrarPorTipoReprovadoFinanceiro() {
        loginStep.fazerLoginComSucesso();
        loggedPage.tipoReprovadoFinanceiro();
        Assert.assertEquals("reprovado financeiro", loggedPage.statusReembolso());
    }

    @Test
    public void filtrarPorTipoPago() {
        loginStep.fazerLoginComSucesso();
        loggedPage.tipoPago();
        Assert.assertEquals("fechado(pago)", loggedPage.statusReembolso());
    }

    @Test
    public void verificarAnexo() {
        solicitarReembolsoStep.solicitarReembolso();
        loggedPage.clicarNoAnexoBtn();
        Assert.assertNotNull(LoggedPage.anexoBtn);
    }

    @Test
    public void fazerLogout() {
        loginStep.fazerLoginComSucesso();
        loggedPage.clicarNoSairBtn();
        Assert.assertEquals("Fazer login", loginPage.fazerLoginMsg());
    }
}




