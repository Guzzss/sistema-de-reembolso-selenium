package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void iniciarBrowser() {

        // acessar o site
        String url = "https://sistema-de-rembolso.vercel.app";

        //definir onde está o chromedriver
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, 40); // delay
        driver.get(url);
     // definir um tempo para iniciar
        driver.manage().window().maximize(); // maximizar a janela do browser
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

//        @After
//        public void finalizarBrowser() {
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // definir um tempo para iniciar
//            driver.quit();
//        }
}
