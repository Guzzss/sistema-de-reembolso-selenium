package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.AdmPage;
import pages.LoggedPage;
import util.BaseTest;
import util.Browser;

public class AdmStep extends Browser {

    AdmPage admPage = new AdmPage();
    LoginStep loginStep = new LoginStep();

    @Test
    public void pesquisarPorNomeComSucesso() {
        loginStep.fazerLoginComoAdm();
        admPage.clicarNoPesquisarBtn();
        admPage.preencherCampoParaPesquisa();
        admPage.clicarNoPesquisarBtn();

        Assert.assertEquals("Gustavo", admPage.nomeUsuario());
    }

    @Test
    public void editarRoleParaColaborador() {
        loginStep.fazerLoginComoAdm();
        admPage.editarRoleParaColaborador();
        admPage.clicarNoConfirmarAlteracao();

        BaseTest.esperar(AdmPage.tipoMsg, "COLABORADOR");
        Assert.assertEquals("COLABORADOR", admPage.tipoMsg());
    }

    @Test
    public void editarRoleParaGestor() {
        loginStep.fazerLoginComoAdm();
        admPage.editarRoleParaGestor();
        admPage.clicarNoConfirmarAlteracao();
        BaseTest.esperar(AdmPage.tipoMsg, "GESTOR");
        Assert.assertEquals("GESTOR", admPage.tipoMsg());
    }

    @Test
    public void editarRoleParaFinanceiro() {
        loginStep.fazerLoginComoAdm();
        admPage.editarRoleParaFinanceiro();
        admPage.clicarNoConfirmarAlteracao();
        BaseTest.esperar(AdmPage.tipoMsg, "FINANCEIRO");
        Assert.assertEquals("FINANCEIRO", admPage.tipoMsg());
    }

    @Test
    public void editarRoleParaAdm() {
        loginStep.fazerLoginComoAdm();
        admPage.editarRoleParaAdmin();
        admPage.clicarNoConfirmarAlteracao();

        BaseTest.esperar(AdmPage.tipoMsg, "ADMIN");
        Assert.assertEquals("ADMIN", admPage.tipoMsg());
    }

    @Test
    public void irParaPaginaDeUsuariosComSucesso() {
        loginStep.fazerLoginComoAdm();
        admPage.paginaUsuarios();

        Assert.assertEquals("Usuários", admPage.paginaAtualMsg());
    }

    @Test
    public void irParaPaginaDeReembolsosComSucesso() {
        loginStep.fazerLoginComoAdm();
        admPage.paginaReembolsos();

        Assert.assertEquals("Reembolsos", admPage.paginaAtualMsg());
    }

    @Test
    public void irParaPaginaDeGestorComSucesso() {
        loginStep.fazerLoginComoAdm();
        admPage.paginaGestor();

        Assert.assertEquals("Gestor", admPage.paginaAtualHeaderMsg());
    }

    @Test
    public void irParaPaginaDeFinanceiroComSucesso() {
        loginStep.fazerLoginComoAdm();
        admPage.paginaFinanceiro();

        Assert.assertEquals("Financeiro", admPage.paginaAtualHeaderMsg());
    }
}
