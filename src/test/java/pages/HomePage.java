package pages;

import org.openqa.selenium.WebDriver;
import runner.Run;

public class HomePage {
    WebDriver driver;
    String site = new String("https://www.calculadora-online.xyz/");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get(site);

    }
}
