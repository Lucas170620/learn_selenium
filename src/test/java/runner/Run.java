package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/report.html"},
        features = "src/test/resources/features",
        tags = ("@calculadora"),
        glue = {"steps"}
)
public class Run extends RunTests {
    @AfterClass
    public static void stop() {
        driver.close();

    }

}
