package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class FinanceiroPage {

    public static final By pagarReembolsoBtn = By.cssSelector("#root > section > section > ul > li:nth-child(5) > div > button:nth-child(1)");
    public static final By negarReembolsoBtn = By.cssSelector("#root > section > section > ul > li:nth-child(5) > div > button:nth-child(2)");
    public static final By toastMsg = By.cssSelector("body > div.swal2-container.swal2-top.swal2-backdrop-show > div");

    public void clicarNoPagarReembolsoBtn() {
        BaseTest.click(pagarReembolsoBtn);
    }

    public void clicarNoNegarReembolsoBtn() {
        BaseTest.click(negarReembolsoBtn);
    }

    public String toastMsg() {
        return BaseTest.getText(toastMsg);
    }


}
