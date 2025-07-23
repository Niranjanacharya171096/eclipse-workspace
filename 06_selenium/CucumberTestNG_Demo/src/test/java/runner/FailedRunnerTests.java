package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"@target/failedrerun.txt"},
    glue = {"stepdefinitions" },
    tags="@smoke",
    plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    )

public class FailedRunnerTests extends AbstractTestNGCucumberTests {
  @Override
  @DataProvider(parallel = true)
  public Object[][] scenarios() {
    return super.scenarios();
  }

  @BeforeMethod
  public void setUp() throws InterruptedException {
    System.out.println("Setup");
  }
  @AfterMethod
  public void teardown() {
    System.out.println("teardown");
  }
}