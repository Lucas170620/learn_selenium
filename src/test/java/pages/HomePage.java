package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import runner.Run;

public class HomePage extends Run {
    String site = new String("https://www.calculadora-online.xyz/");
    public By add = By.id("addition");
    public By minus= By.id("moins");
    public By multiplier = By.id("multiplier");
    public By div = By.id("diviser");



    public void acessarAplicacao() {
        getDriver().get(site);
    }
    public void clickButtonAdd(){
        getDriver().findElement(add).click();
    }
    public void clickButtonSub(){
        getDriver().findElement(minus).click();
    }
    public void clickButtonMultiplier(){
        getDriver().findElement(multiplier).click();
    }
    public void clickButtonDivision(){
        getDriver().findElement(div).click();
    }

    public void scrollPage(String ini_page, String end_page) throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(" + ini_page + "," + end_page + ")");
    }
}
