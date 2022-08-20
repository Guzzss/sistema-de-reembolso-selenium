package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class BaseTest extends Elements{

    public static void click(By by){
        waitElementClickable(by);
        waitElement(by);
        element(by).click();
    }

    public static void esperarTempo() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

    public static void esperar(By by, String text) {
        waitElement(by);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
    }

    public static void hover(By by){
        waitElement(by);
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(by)).perform();
    }


}
