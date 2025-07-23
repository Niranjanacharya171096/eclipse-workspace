package parallel;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
  WebDriver driver;

  @Before
  public void setUp() {
    driver = DriverFactory.initDriver();
  }

  @After
  public void tearDown() {
    DriverFactory.quitDriver();
  }
}
