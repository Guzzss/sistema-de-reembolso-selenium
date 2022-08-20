package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.AtualizarReembolsoPage;
import pages.GestorPage;
import pages.LoggedPage;
import util.BaseTest;
import util.Browser;

public class AtualizarReembolsoStep extends Browser {

    LoginStep loginStep = new LoginStep();
    LoggedPage loggedPage = new LoggedPage();
    LoggedStep loggedStep = new LoggedStep();
    AtualizarReembolsoPage atualizarReembolsoPage = new AtualizarReembolsoPage();
    SolicitarReembolsoStep solicitarReembolsoStep = new SolicitarReembolsoStep();

    @Test
    public void limparCampo() {
        loginStep.fazerLoginComSucesso();
        loggedPage.clicarNoEditarReembolsoBtn();
        atualizarReembolsoPage.limparCampoTitulo();
        atualizarReembolsoPage.limparCampoValor();
    }

    @Test
    public void atualizarReembolsoComSucesso() {
        solicitarReembolsoStep.solicitarReembolso();
        loggedPage.clicarNoEditarReembolsoBtn();
        atualizarReembolsoPage.limparCampoTitulo();
        atualizarReembolsoPage.preencherTitulo();
        atualizarReembolsoPage.limparCampoValor();
        atualizarReembolsoPage.preencherValor();
        atualizarReembolsoPage.limparCampoAnexo();
        atualizarReembolsoPage.clicarNoAnexoBtn();
        atualizarReembolsoPage.clicarNoAtualizarReembolsoBtn();
        BaseTest.esperar(AtualizarReembolsoPage.toastMsg, "Reembolso atualizado com sucesso");
        Assert.assertEquals("Reembolso atualizado com sucesso", atualizarReembolsoPage.toastMsg());
        loggedStep.deletarReembolso();
    }
}
