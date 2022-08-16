package steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DescontoStep {
    WebDriver driver = new FirefoxDriver();
    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando(){
        driver.get("https://qazando.com.br/");
        return;
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail(){
        driver.get("https://qazando.com.br/");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom(){
    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto(){
    }

}
