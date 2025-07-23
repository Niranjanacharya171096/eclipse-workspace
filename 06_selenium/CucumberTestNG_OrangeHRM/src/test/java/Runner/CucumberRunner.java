package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = { "src/test/resources/Parallel/Loginpage.feature" },
    glue = { "stepdefinitions", "Parallel" },
    plugin = { "rerun:target/failedscenarios.txt", "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/" }
    )

public class CucumberRunner {
  //extends AbstractTestNGCucumberTests {
}