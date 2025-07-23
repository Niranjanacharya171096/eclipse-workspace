package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {
        "./src/test/resources/features/loginPage.feature",
    },
    glue = {"stepdefinitions", "apphooks"},
    plugin = { "pretty", "junit:target/JUnitReports/report.xml",
        "json:target/JSONReports/report.json",
        "html:target/HtmlReports",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    "timeline:test-output-thread/" },
    dryRun = false
    )
public class TestRunner {

}
