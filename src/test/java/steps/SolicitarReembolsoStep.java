package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.FinanceiroPage;
import pages.LoggedPage;
import pages.SolicitarReembolsoPage;
import util.BaseTest;
import util.Browser;

public class SolicitarReembolsoStep extends Browser {

    LoggedPage loggedPage = new LoggedPage();
    LoginStep loginStep = new LoginStep();
    SolicitarReembolsoPage solicitarReembolsoPage = new SolicitarReembolsoPage();


    public void solicitarReembolso() {
        loginStep.fazerLoginComoColaboradorComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.preencherTitulo();
        solicitarReembolsoPage.preencherValor();
        solicitarReembolsoPage.clicarNoAnexoBtn();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();
    }

    @Test
    public void solicitarReembolsoComSucesso() {
        loginStep.fazerLoginComoColaboradorComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.preencherTitulo();
        solicitarReembolsoPage.preencherValor();
        solicitarReembolsoPage.clicarNoAnexoBtn();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();
        BaseTest.esperar(FinanceiroPage.toastMsg, "Reembolso Solicitado!");
        Assert.assertEquals(loggedPage.toastMsg(), "Reembolso Solicitado!");
    }

    @Test
    public void solicitarReembolsoSemAnexo() {
        loginStep.fazerLoginComoColaboradorComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.preencherTitulo();
        solicitarReembolsoPage.preencherValor();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();

        Assert.assertEquals(solicitarReembolsoPage.anexoErroMsg(), "Anexo obrigatório!");
    }

    @Test
    public void solicitarReembolsoSemPassarTitulo() {
        loginStep.fazerLoginComoColaboradorComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.preencherValor();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();

        Assert.assertEquals(solicitarReembolsoPage.tituloErroMsg(), "Título obrigatorio!");
    }

    @Test
    public void solicitarReembolsoSemPassarValor() {
        loginStep.fazerLoginComoColaboradorComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.preencherTitulo();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();

        Assert.assertEquals(solicitarReembolsoPage.valorErroMsg(), "Valor inválido!");
    }

    @Test
    public void solicitarReembolsoComTodosCamposEmBranco() {
        loginStep.fazerLoginComoColaboradorComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();

        Assert.assertEquals(solicitarReembolsoPage.tituloErroMsg(), "Título obrigatorio!");
        Assert.assertEquals(solicitarReembolsoPage.valorErroMsg(), "Valor inválido!");
    }

}

