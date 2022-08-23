package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import runner.Run;
import support.Utils;

import java.util.Arrays;
import java.util.List;

public class HomePage extends Run {

    /*
    * HomePage class :
    * Aqui ficara todos metodos de acessar os elementos da inerface web com Selenium
    * Assim o codigo fica mais facil de ser reusado e de realizar manutencoes
    * ele herda Run e que por sua vez herda RunTest que possui o driver do selenium e suas manipulacoess
    */

    List<String> mapeamento = Arrays.asList("zero", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf");
    String site = new String("https://www.calculadora-online.xyz/");
    public By add = By.id("addition");
    public By minus = By.id("moins");
    public By multiplier = By.id("multiplier");
    public By div = By.id("diviser");
    public By enter = By.id("egale");
    public By resultado = By.id("total");

    // Abre o site que foi especificado nos atributos
    public void acessarAplicacao() {
        getDriver().get(site);
    }

    // Clica em um botao de numero da calculadora
    public void clicarNoBotaoCalculadora(Integer numeroTecla) {
        String input_str = Integer.toString(numeroTecla);
        int index;
        for (int i = 0; i < input_str.length(); i++) {
            index = Character.getNumericValue(input_str.charAt(i));
            Utils.waiForElementTobeClickable(By.id(mapeamento.get(index)), 10);
            getDriver().findElement(By.id(mapeamento.get(index))).click();

        }
    }

    // Clica no botao de soma
    public void clickButtonAdd() {
        getDriver().findElement(add).click();
    }

    // clica no botao de subtracao
    public void clickButtonSub() {
        getDriver().findElement(minus).click();
    }

    // clica no botao de multiplicar
    public void clickButtonMultiplier() {
        getDriver().findElement(multiplier).click();
    }

    // clica no botao de divisao
    public void clickButtonDivision() {
        getDriver().findElement(div).click();
    }

    //clica em enter
    public void clickButtonEnter() {
        getDriver().findElement(enter).click();
    }

    //Pega o resultado da calculadora
    public String getResult() {
        return getDriver().findElement(resultado).getText();
    }

    // Da um scroll page
    public void scrollPage(String ini_page, String end_page) throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(" + ini_page + "," + end_page + ")");
    }
}
