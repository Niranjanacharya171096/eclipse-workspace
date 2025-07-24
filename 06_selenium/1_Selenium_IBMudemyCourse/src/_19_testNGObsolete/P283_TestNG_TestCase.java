package _19_testNGObsolete;

import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P283_TestNG_TestCase {
  private WebDriver driver;
  private String baseUrl;
  static Logger log = LogManager.getLogger(P283_TestNG_TestCase.class);

  @BeforeMethod
  public void beforeMethod() {
    driver = new FirefoxDriver();
    baseUrl = "https://www.expedia.com/";

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    PropertyConfigurator.configure("log4j.properties");
  }

  @Test
  public void testMethod() {
    driver.get(baseUrl);
    P283_SearchPage.navigateToFlightsTab(driver);
    P283_SearchPage.fillOriginTextBox(driver, "New York");
    P283_SearchPage.fillDestinationTextBox(driver, "Chicago");
    P283_SearchPage.fillDepartureDateTextBox(driver, "12/25/2014");
    P283_SearchPage.fillReturnDateTextBox(driver, "12/31/2014");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
