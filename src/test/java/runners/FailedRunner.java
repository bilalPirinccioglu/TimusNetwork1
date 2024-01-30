package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:src/failedRerun.txt"
        },
        features = "@src/failedRerun.txt",
        glue = {"stepdefinitions","hooks"},
        dryRun = false
)
public class FailedRunner {

}