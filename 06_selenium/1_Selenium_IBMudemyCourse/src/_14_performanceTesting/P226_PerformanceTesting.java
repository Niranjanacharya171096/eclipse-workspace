package _14_performanceTesting;

import java.lang.reflect.Method;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import _06_dataDrivenTesting.P178_Constants;

public class P226_PerformanceTesting {
  long startTime;
  long endTime;
  long duration;
  double seconds;

  private WebDriver driver;
  private String baseUrl;
  P226_SearchPageFactory searchPage;
  static Logger log = Logger.getLogger(P226_PerformanceTesting.class);

  @BeforeClass
  public void beforeClass() throws Exception {
    PropertyConfigurator.configure("log4j.properties");
    System.setProperty("webdriver.gecko.driver",
        "/Users/atomar/Documents/workspace_personal/selenium/geckodriver");
    driver = new FirefoxDriver();
    baseUrl = "https://www.expedia.com/";
    searchPage = new P226_SearchPageFactory(driver);

    // Maximize the browser's window
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    // Tell the code about the location of Excel file
    P226_ExcelUtility.setExcelFile(P178_Constants.File_Path + P178_Constants.File_Name, "Sheet1");
  }

  @Test
  public void searchFlight(Method name) throws Exception {
    startTime = System.nanoTime();
    driver.get(baseUrl);
    searchPage.clickFlightsTab();
    searchPage.setOriginCity("New York");
    searchPage.setDestinationCity("San Francisco");
    searchPage.setDepartureDate("10/28/2015");
    searchPage.setReturnDate("10/31/2015");
    endTime = System.nanoTime();
    duration = endTime - startTime;
    seconds = duration / 1000000000.0;
    log.info("*****************************************");
    log.info("Time taken to execute this method: " + seconds + " seconds");
    // When you create the excel file, you should create row and type Flights Page in the row you are trying to write
    // If there is nothing in the row, the code will fail
    P226_ExcelUtility.setCellData("Flights Page", 1, 0);
    P226_ExcelUtility.setCellData(seconds, 1, 1);
  }

  @AfterClass
  public void afterClass() {
    driver.quit();
  }
}