package _14_performanceTesting;

import java.time.Duration;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import _06_dataDrivenTesting.P178_Constants;

public class P227_PerformanceUsingStopWatch {

  private WebDriver driver;
  private String baseUrl;
  P227_SearchPageFactory searchPage;
  static Logger log = Logger.getLogger(P227_PerformanceUsingStopWatch.class);
  StopWatch watch = new StopWatch();

  @BeforeClass
  public void beforeClass() throws Exception {
    PropertyConfigurator.configure("log4j.properties");
    driver = new FirefoxDriver();
    baseUrl = "https://www.expedia.com/";
    searchPage = new P227_SearchPageFactory(driver);

    // Maximize the browser's window
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    // Tell the code about the location of Excel file
    P227_ExcelUtility.setExcelFile(P178_Constants.File_Path + P178_Constants.File_Name, "Sheet1");
  }

  @Test
  public void searchFlight() throws Exception {
    watch.start();
    driver.get(baseUrl);
    searchPage.clickFlightsTab();
    searchPage.setOriginCity("New York");
    searchPage.setDestinationCity("San Francisco");
    searchPage.setDepartureDate("10/28/2015");
    searchPage.setReturnDate("10/31/2015");
    double seconds = watch.getTime() / 1000.0;
    watch.reset();
    log.info("**********************************************");
    log.info("Time taken to exeute this method was: " + seconds + " seconds");
    P227_ExcelUtility.setCellData("Flight Page", 1, 0);
    P227_ExcelUtility.setCellData(seconds, 1, 1);
  }

  @AfterClass
  public void afterClass() {
    driver.quit();
  }
}