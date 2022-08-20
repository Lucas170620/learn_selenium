package steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import runner.Run;

import java.util.Arrays;
import java.util.List;

import runner.RunTests;
import support.Utils;

public class CalculatorStep extends Run {

    String site = new String("https://www.calculadora-online.xyz/");
    HomePage home = new HomePage();

    Integer valor_um , valor_dois, resultado;
    List<String> mapeamento = Arrays.asList("zero","un","deux","trois","quatre","cinq","six","sept","huit","neuf");


    @Dado("que eu estou logado no site da calculadora")
    public void que_eu_estou_logado_no_site_da_calculadora() throws InterruptedException {
        getDriver(RunTests.Browser.CHROME);
        home.acessarAplicacao();
    }

    @Quando("eu clico em {int}")
    public void eu_clico_na_caixa_de_escrever_digitando(Integer input) throws InterruptedException {
        /*
        Scroll na pagina:
            home.scrollPage("0","1000");

         */
        String input_str = Integer.toString(input);
        int index;
        for (int i = 0; i < input_str.length(); i++) {
            index = Character.getNumericValue(input_str.charAt(i));
            Utils.waiForElementTobeClickable(By.id(mapeamento.get(index)),10);
            getDriver().findElement(By.id(mapeamento.get(index))).click();

        }
    }

    @Quando("eu clico na operacao {str}")
    public void eu_clico_em(String op) {
        switch (op){
            case "mais":
                home.clickButtonAdd();
                break;
            case "menos":
                home.clickButtonSub();
                break;
            case "vezes":
                home.clickButtonMultiplier();
                break;
            case "dividir":
                home.clickButtonDivision();
                break;
            default:
                throw new IllegalArgumentException("Operacao invalida");
        }
    }
    @Quando("aperto enter")
    public void aperto_enter() {
        getDriver().findElement(By.id("egale")).click();
    }
    @Então("aparece o resultado na tela {str}")
    public void aparece_o_resultado_na_tela(String resultado) {
        String resultado_tela = getDriver().findElement(By.id("total")).getText();
        String resultado_esperado = resultado;
        Assert.assertEquals(resultado_esperado,resultado_tela);

    }
    @ParameterType(".*")
    public String str(String name){
        return new String(name);
    }

}
