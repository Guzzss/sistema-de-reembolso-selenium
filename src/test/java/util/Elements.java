package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends Browser {
    //metodo para pegar o elemento
    protected static WebElement element(By by) {
        return driver.findElement(by);
    }

    //metodo para esperar um elemento
    protected static void waitElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
