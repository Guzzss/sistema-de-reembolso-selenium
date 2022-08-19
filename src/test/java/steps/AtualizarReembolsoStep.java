package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.AtualizarReembolsoPage;
import pages.LoggedPage;
import util.Browser;

public class AtualizarReembolsoStep extends Browser {

    LoginStep loginStep = new LoginStep();
    LoggedPage loggedPage = new LoggedPage();
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
        solicitarReembolsoStep.solicitarReembolsoComSucesso();
        loggedPage.clicarNoEditarReembolsoBtn();
        atualizarReembolsoPage.limparCampoTitulo();
        atualizarReembolsoPage.preencherTitulo();
        atualizarReembolsoPage.limparCampoValor();
        atualizarReembolsoPage.preencherValor();
        atualizarReembolsoPage.limparCampoAnexo();
        atualizarReembolsoPage.clicarNoAnexoBtn();
        atualizarReembolsoPage.clicarNoAtualizarReembolsoBtn();
    }

    @Test
    public void atualizarReembolsoSemPassarTitulo() {
        solicitarReembolsoStep.solicitarReembolsoComSucesso();
        loggedPage.clicarNoEditarReembolsoBtn();
        atualizarReembolsoPage.limparCampoTitulo();
        atualizarReembolsoPage.limparCampoValor();
        atualizarReembolsoPage.preencherValor();
        atualizarReembolsoPage.limparCampoAnexo();
        atualizarReembolsoPage.clicarNoAnexoBtn();
        atualizarReembolsoPage.clicarNoAtualizarReembolsoBtn();
        Assert.assertEquals(atualizarReembolsoPage.tituloErroMsg(), "Título obrigatorio!");
    }
}
