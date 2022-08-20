package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import runner.Run;

import java.util.concurrent.TimeUnit;

public class DescontoStep extends Run {
    String site = new String("https://qazando.com.br/");
    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando() throws InterruptedException {
        getDriver().get(site);
        TimeUnit.SECONDS.sleep(5);
        getDriver().findElement(By.xpath("/html/body/div[11]/div[1]/form/div[5]/span/span/p/span")).click();
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail(){
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom(){
    }

    @Então("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto(){
    }
}