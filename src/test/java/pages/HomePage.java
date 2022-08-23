package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import runner.Run;
import support.Utils;

import java.util.Arrays;
import java.util.List;

public class HomePage extends Run {

    List<String> mapeamento = Arrays.asList("zero", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf");
    String site = new String("https://www.calculadora-online.xyz/");
    public By add = By.id("addition");
    public By minus = By.id("moins");
    public By multiplier = By.id("multiplier");
    public By div = By.id("diviser");
    public By enter = By.id("egale");
    public By resultado = By.id("total");


    /*
     * campo select :
     * metodo (String State){
     * Select nome_select = new Select(driver.findElement(By algo("seletor"));
     * nome_select.selecByVisibleText(state);
     * }
     * Add File no selenium :
     * metodo_up_file(String path_file){
     * driver.findElement(By.algo("nome_html)).sendKeys(pathFile);
     *
     * }
     * achar input do tipo file no html
     *
     */
    public void acessarAplicacao() {
        getDriver().get(site);
    }

    public void clicarNoBotaoCalculadora(Integer numeroTecla) {
        String input_str = Integer.toString(numeroTecla);
        int index;
        for (int i = 0; i < input_str.length(); i++) {
            index = Character.getNumericValue(input_str.charAt(i));
            Utils.waiForElementTobeClickable(By.id(mapeamento.get(index)), 10);
            getDriver().findElement(By.id(mapeamento.get(index))).click();

        }
    }

    public void clickButtonAdd() {
        getDriver().findElement(add).click();
    }

    public void clickButtonSub() {
        getDriver().findElement(minus).click();
    }

    public void clickButtonMultiplier() {
        getDriver().findElement(multiplier).click();
    }

    public void clickButtonDivision() {
        getDriver().findElement(div).click();
    }

    public void clickButtonEnter() {
        getDriver().findElement(enter).click();
    }

    public String getResult() {
        return getDriver().findElement(resultado).getText();
    }

    public void scrollPage(String ini_page, String end_page) throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(" + ini_page + "," + end_page + ")");
    }
}
