package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Elements extends Browser {
    //metodo para pegar o elemento
    protected static WebElement element(By by) {
        return driver.findElement(by);
    }

    protected static List<WebElement> elementss(WebElement webElement) {
        return driver.findElements(By.cssSelector(String.valueOf(webElement)));
    }

    protected static void waitElementClickable(By by) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    protected static void waitElementPreencher(By by, String texto) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, texto));
    }
    //metodo para esperar um elemento
    protected static void waitElement(By by) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
