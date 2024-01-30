package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:src/failedRerun.txt"
        },
        features = "./src/test/resources/features",
        glue = {"stepdefinitions","hooks"},
        tags = "@Positive",
        dryRun = false

)
public class Runner {

}