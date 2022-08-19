package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.BaseTest;

import java.util.List;

public class GestorPage extends BaseTest {

    public final static By aprovarReembolso = By.cssSelector("#root > section > section > ul > li:nth-child(5) > div > button:nth-child(1) > svg > path");
    public final static By reprovarReembolso = By.cssSelector("#root > section > section > ul > li:nth-child(5) > div > button:nth-child(2)");
    public final static By toastMsg = By.cssSelector("#swal2-title");

//    public final static List<WebElement> aprovadorBtn = driver.findElements(By.cssSelector("#body > div:nth-child(2) > section:nth-child(2) > section:nth-child(1) > ul:nth-child(2) > li > div:nth-child(5) > button:nth-child(1)"));

//    WebElement lastMessage = aprovadorBtn.get(aprovadorBtn.size() - 1);

    public void clicarNoAprovarReembolso() {
        BaseTest.click(aprovarReembolso);
    }

    public void clicarNoReprovarReembolso() {
        BaseTest.click(reprovarReembolso);
    }
    public String toastMsg() {
        return BaseTest.getText(toastMsg);
    }
}
