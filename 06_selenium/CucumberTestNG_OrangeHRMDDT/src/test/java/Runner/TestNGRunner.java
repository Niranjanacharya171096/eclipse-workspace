package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = { "src/test/resources/Parallel/LoginDDTExcel.feature" },
    glue = { "stepdefinitions", "Parallel"},
    plugin = { "rerun:target/failedscenarios.txt", "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/" }
    )

public class TestNGRunner extends AbstractTestNGCucumberTests {

  //  private DriverFactory driverFactory;
  //  private WebDriver driver;
  //  private ConfigReader configReader;
  //  Properties prop;
  not running
  @Override
  @DataProvider(parallel = true)
  @Override
  public Object[][] scenarios() {
    return super.scenarios();
  }

  //  @BeforeMethod
  //  public void setUp() throws InterruptedException, IOException {
  //    System.out.println("Setup");
  //    System.out.println("getProperty()");
  //    configReader = new ConfigReader();
  //    prop = configReader.init_prop();
  //
  //    System.out.println("launchBrowser()");
  //
  //    String browserName = prop.getProperty("browser");
  //    driverFactory = new DriverFactory();
  //    driver = driverFactory.init_driver(browserName);
  //  }
  //
  //  @AfterMethod
  //  public void teardown() {
  //    System.out.println("teardown");
  //    driver.quit();
  //  }
}