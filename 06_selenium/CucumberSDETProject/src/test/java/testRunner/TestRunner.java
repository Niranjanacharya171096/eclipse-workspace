package testRunner;
//This is my test runner class

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features=".//Features//",
    glue="stepDefinitions",
    monochrome=true,
    tags= "@sanity",
    plugin= {"pretty","html:test-output"}
    )
public class TestRunner {
  has some issue
}
