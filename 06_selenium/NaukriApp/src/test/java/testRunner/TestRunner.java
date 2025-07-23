package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/profile.feature",
				  glue={"stepDefinitions","hooks"},
				  plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
				  dryRun=true,
				  tags="@home",
				  publish=true
				  )
public class TestRunner {

}
