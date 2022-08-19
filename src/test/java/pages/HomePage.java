package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;
    String site = new String("https://www.calculadora-online.xyz/");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.get(site);
    }

    public void scrollPage(String ini_page, String end_page) throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(" + ini_page + "," + end_page + ")");
    }
}
