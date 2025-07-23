package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features = { "@target/failedscenarios.txt" },
    glue = { "stepdefinitions", "Parallel" },
    plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/" }
    )

public class FailedScenariosTestNGRunner extends AbstractTestNGCucumberTests {}
