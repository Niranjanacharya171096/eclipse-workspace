package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigPropertiesReader;

public class Hooks {

  public static WebDriver driver;
  public Properties prop;

  @Before
  public void setup() throws IOException {
    driver = DriverFactory.initializeDriver();

    prop = ConfigPropertiesReader.getProperties();

    driver.get(prop.getProperty("appURL"));
    driver.manage().window().maximize();
  }

  @AfterStep
  public void addScreenshot(Scenario scenario) {
    // this is for cucumber junit report
    if (scenario.isFailed()) {
      TakesScreenshot ts = (TakesScreenshot) driver;
      byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
      scenario.attach(screenshot, "image/png", scenario.getName());
    }
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
