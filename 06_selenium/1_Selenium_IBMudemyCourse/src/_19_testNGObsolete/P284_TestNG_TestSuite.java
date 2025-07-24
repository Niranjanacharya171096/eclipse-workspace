package _19_testNGObsolete;

import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P284_TestNG_TestSuite {
  private WebDriver driver;
  private String baseUrl;
  static Logger log = LogManager.getLogger(P284_TestNG_TestSuite.class);

  @BeforeClass
  public void beforeClass() {
    driver = new FirefoxDriver();
    baseUrl = "https://www.expedia.com/";

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    PropertyConfigurator.configure("log4j.properties");
    driver.get(baseUrl);
  }

  @Test
  public void test1_fillBasicInfo() throws Exception {
    P284_SearchPage.navigateToFlightsTab(driver);
    P284_SearchPage.fillOriginTextBox(driver, "New York");
    P284_SearchPage.fillDestinationTextBox(driver, "Chicago");
    P284_SearchPage.fillDepartureDateTextBox(driver, "12/25/2014");
    P284_SearchPage.fillReturnDateTextBox(driver, "12/31/2014");
    Thread.sleep(3000);
  }

  @Test
  public void test2_fillAdvancedInfo() {
    // Expedia remembers last settings, if you have previously visited the page
    // clicked advanced options
    // Then next time, when automation runs that option will already be open
    // And automation will click it and this time it will close
    // And the test will faill because it will not be able to find not-stop and
    // flight class checkboxes
    // We are adding If condition to find whether the advanced option is open or
    // close
    WebElement e = driver.findElement(By.id("advanced-options"));
    String clicked = e.getAttribute("aria-pressed");
    System.out.println("Value of area-pressed is: " + clicked);
    if (clicked.contains("false")) {
      P284_SearchPage.clickOnAdvancedLink(driver);
    }
    P284_SearchPage.clickNonStopCheckBox(driver);
    P284_SearchPage.selectFlightClass(driver, "first");
  }

  @AfterClass
  public void afterClass() {
  }

}
