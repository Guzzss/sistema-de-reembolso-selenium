package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Elements{

    public static void click(By by){
        waitElement(by);
        element(by).click();
    }

    public static void clickElement(WebElement by){
        elementss(by).get(elementss(by).size() - 1).click();
    }

    public static String getText(By by){
        waitElement(by);
        return element(by).getText();
    }

    public static void sendKeys(By by, String texto) {
        waitElement(by);
        element(by).sendKeys(texto);
    }

    public static void clear(By by){
        waitElement(by);
        element(by).clear();
    }

    public static void esperarElemento(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void esperar(By by, String text) {
        waitElement(by);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
    }


}
