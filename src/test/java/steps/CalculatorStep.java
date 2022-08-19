package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import runner.Run;

import java.util.Arrays;
import java.util.List;

import support.Utils;

public class CalculatorStep extends Utils{

    String site = new String("https://www.calculadora-online.xyz/");
    HomePage home = new HomePage(driver);

    Integer valor_um , valor_dois, resultado;
    List<String> mapeamento = Arrays.asList("zero","un","deux","trois","quatre","cinq","six","sept","huit","neuf");


    @Dado("que eu estou logado no site da calculadora")
    public void que_eu_estou_logado_no_site_da_calculadora() throws InterruptedException {
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
            waiForElementTobeClickable(By.id(mapeamento.get(index)),10);
            driver.findElement(By.id(mapeamento.get(index))).click();

        }
    }

    @Quando("eu clico em +")
    public void eu_clico_em() {
        driver.findElement(By.id("addition")).click();
    }
    @Quando("aperto enter")
    public void aperto_enter() {
        driver.findElement(By.id("egale")).click();
    }
    @Então("aparece o resultado na tela {int}")
    public void aparece_o_resultado_na_tela(Integer resultado) {
        String resultado_tela = driver.findElement(By.id("total")).getText();
        String resultado_esperado = Integer.toString(resultado);
        Assert.assertEquals(resultado_esperado,resultado_tela);

    }
}
