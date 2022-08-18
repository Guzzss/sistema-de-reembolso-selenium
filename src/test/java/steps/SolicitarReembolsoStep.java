package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.LoggedPage;
import pages.SolicitarReembolsoPage;
import util.Browser;

public class SolicitarReembolsoStep extends Browser {

    LoggedPage loggedPage = new LoggedPage();
    LoginStep loginStep = new LoginStep();
    SolicitarReembolsoPage solicitarReembolsoPage = new SolicitarReembolsoPage();

    @Test
    public void solicitarReembolsoComSucesso() {
        loginStep.fazerLoginComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.preencherTitulo();
        solicitarReembolsoPage.preencherValor();
        solicitarReembolsoPage.clicarNoAnexoBtn();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();

        Assert.assertEquals(loggedPage.tituloReembolso(), "Teste de Reembolso");
        Assert.assertEquals(loggedPage.toastMsg(), "Reembolso Solicitado!");
    }

    @Test
    public void solicitarReembolsoSemAnexo() {
        loginStep.fazerLoginComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.preencherTitulo();
        solicitarReembolsoPage.preencherValor();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();

        Assert.assertEquals(loggedPage.tituloReembolso(), "Teste de Reembolso");
    }

    @Test
    public void solicitarReembolsoSemPassarTitulo() {
        loginStep.fazerLoginComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.preencherValor();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();

        Assert.assertEquals(solicitarReembolsoPage.tituloErroMsg(), "Título obrigatorio!");
    }

    @Test
    public void solicitarReembolsoSemPassarValor() {
        loginStep.fazerLoginComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.preencherTitulo();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();

        Assert.assertEquals(solicitarReembolsoPage.valorErroMsg(), "Valor inválido!");
    }

    @Test
    public void solicitarReembolsoComTodosCamposEmBranco() {
        loginStep.fazerLoginComSucesso();
        loggedPage.clicarNoSolicitarReembolsoBtn();
        solicitarReembolsoPage.clicarNoSolicitarReembolsoBtn();

        Assert.assertEquals(solicitarReembolsoPage.tituloErroMsg(), "Título obrigatorio!");
        Assert.assertEquals(solicitarReembolsoPage.valorErroMsg(), "Valor inválido!");
    }

}

