package steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.HomePage;
import runner.Run;
import runner.RunTests;

public class CalculatorStep extends Run {
    HomePage home = new HomePage();



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
        home.clicarNoBotaoCalculadora(input);
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
        home.clickButtonEnter();
    }
    @Então("aparece o resultado na tela {str}")
    public void aparece_o_resultado_na_tela(String resultado) {
        String resultado_tela = home.getResult();
        String resultado_esperado = resultado;
        Assert.assertEquals(resultado_esperado,resultado_tela);

    }
    @ParameterType(".*")
    public String str(String name){
        return new String(name);
    }

}
