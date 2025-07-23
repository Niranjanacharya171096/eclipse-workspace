package parallel;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.xml.XmlTest;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/resources/parallel",
    glue = {"parallel"}
    )

public class RunCucumberTest extends AbstractTestNGCucumberTests {
  @Override
  @DataProvider(parallel = true)
  public Object[][] scenarios() {
    return super.scenarios();
  }

  //  @Parameters({ "browser", "os" })
  //  @BeforeTest
  //  public static void setUpScenario(@Optional("Edge") String browser, String os) {
  //    System.out.println(browser);
  //    System.out.println(os);
  //  }

  @Before
  public void setUp(Scenario scenario) {
    // Get browser from TestNG context
    XmlTest xmlTest = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest();
    String browser = xmlTest.getParameter("browser");

    System.out.println(browser);
  }
}