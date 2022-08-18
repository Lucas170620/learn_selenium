package steps;
import io.cucumber.java.PendingException;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DescontoStep {
    WebDriver driver;
    String site = new String("https://qazando.com.br/");
    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(site);
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("/html/body/div[11]/div[1]/form/div[5]/span/span/p/span")).click();
        

        System.out.println(site);
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail(){
        System.out.println("corno1");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom(){
        System.out.println("corno2");
    }

    @Então("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto(){
        System.out.println("corno3");
    }
}