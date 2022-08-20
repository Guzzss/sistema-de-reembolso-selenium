package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class AdmPage {

    public static final By cadastrarUsuarioBtn = By.cssSelector("#root > section > button");
    public static final By campoParaPesquisa = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div > input[type=text]");
    public static final By pesquisarBtn = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div.sc-fEOsli.mHTFZ > div > button");
    public static final By editarRoleBtn = By.cssSelector("#root > section > section > ul > li:nth-child(2) > div > button");
    public static final By tipoColaborador = By.cssSelector("body > div.swal2-container.swal2-center.swal2-backdrop-show > div > select > option:nth-child(2)");
    public static final By tipoGestor = By.cssSelector("body > div.swal2-container.swal2-center.swal2-backdrop-show > div > select > option:nth-child(3)");
    public static final By tipoFinanceiro = By.cssSelector("body > div.swal2-container.swal2-center.swal2-backdrop-show > div > select > option:nth-child(4)");
    public static final By tipoAdmin = By.cssSelector("body > div.swal2-container.swal2-center.swal2-backdrop-show > div > select > option:nth-child(5)");
    public static final By tipoMsg = By.cssSelector("#root > section > section > ul > li:nth-child(2) > span:nth-child(4)");
    public static final By filtrarPorNomeMsg = By.cssSelector("#root > section > section > div.sc-fnykZs.eGmVGy > div.sc-fEOsli.cnFtLV > div:nth-child(1) > span");
    public static final By confirmarAlteracao = By.cssSelector("body > div.swal2-container.swal2-center.swal2-backdrop-show > div > div.swal2-actions > button.swal2-confirm.swal2-styled.swal2-default-outline");
    public static final By toasMsg = By.cssSelector("#swal2-title");
    public static final By nomeUsuario = By.cssSelector("#root > section > section > ul > li:nth-child(1) > span:nth-child(2)");
    public static final By paginasBtn = By.cssSelector("#root > header > div:nth-child(2) > div > button");
    public static final By paginaUsuario = By.cssSelector("#root > header > div:nth-child(2) > div > div > button:nth-child(2)");
    public static final By paginaReembolso = By.cssSelector("#root > header > div:nth-child(2) > div > div > button:nth-child(3)");
    public static final By paginaGestor = By.cssSelector("#root > header > div:nth-child(2) > div > div > button:nth-child(4)");
    public static final By paginaFinanceiro = By.cssSelector("#root > header > div:nth-child(2) > div > div > button:nth-child(5)");
    public static final By paginaAtualMsg = By.cssSelector("#root > section > section > div.sc-fnykZs.jKHkWw > div:nth-child(1) > h2");
    public static final By paginaAtualHeaderMsg = By.cssSelector("#root > header > div:nth-child(1) > h2");

    public void clicarNoCadastrarUsuarioBtn() {
        BaseTest.click(cadastrarUsuarioBtn);
    }
    public void preencherCampoParaPesquisa() {
        BaseTest.sendKeys(campoParaPesquisa, "gustavo");
    }
    public void clicarNoPesquisarBtn() {
        BaseTest.click(pesquisarBtn);
    }

    public void paginaUsuarios() {
        BaseTest.hover(paginasBtn);
        BaseTest.click(paginaUsuario);
    }

    public void paginaReembolsos() {
        BaseTest.hover(paginasBtn);
        BaseTest.click(paginaReembolso);
    }

    public void paginaGestor() {
        BaseTest.hover(paginasBtn);
        BaseTest.click(paginaGestor);
    }

    public void paginaFinanceiro() {
        BaseTest.hover(paginasBtn);
        BaseTest.click(paginaFinanceiro);
    }
    public void editarRoleParaColaborador() {
        BaseTest.click(editarRoleBtn);
        BaseTest.click(tipoColaborador);
    }

    public void editarRoleParaGestor() {
        BaseTest.click(editarRoleBtn);
        BaseTest.click(tipoGestor);
    }

    public void editarRoleParaFinanceiro() {
        BaseTest.click(editarRoleBtn);
        BaseTest.click(tipoFinanceiro);
    }

    public void editarRoleParaAdmin() {
        BaseTest.click(editarRoleBtn);
        BaseTest.click(tipoAdmin);
    }

    public void clicarNoConfirmarAlteracao() {
         BaseTest.click(confirmarAlteracao);
    }
    public String tipoMsg() {
        return BaseTest.getText(tipoMsg);
    }
    public String filtrarPorNomeMsg() {
        return BaseTest.getText(filtrarPorNomeMsg);
    }
    public String verificarSeFoiCadastrado() {
        return BaseTest.getText(cadastrarUsuarioBtn);
    }

    public String toasMsg() {
        return BaseTest.getText(toasMsg);
    }
    public String nomeUsuario() {
        return BaseTest.getText(nomeUsuario);
    }
    public String paginaAtualMsg() {
        return BaseTest.getText(paginaAtualMsg);
    }

    public String paginaAtualHeaderMsg() {
        return BaseTest.getText(paginaAtualHeaderMsg);
    }
}
