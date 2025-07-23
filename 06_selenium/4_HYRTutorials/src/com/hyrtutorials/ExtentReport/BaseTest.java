package com.hyrtutorials.ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
  public static WebDriver driver;
  public static String screenshotsSubFolderName;
  public static ExtentReports extentReports;
  public static ExtentTest extentTest;

  @BeforeSuite
  public void initialiseExtentReports() {
    File extentReportFile = new File(System.getProperty("user.dir") + "\\ExtentReports");

    ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter(extentReportFile+"\\AllTests.html");
    sparkReporter_all.config().setReportName("All Tests report");

    ExtentSparkReporter sparkReporter_failed = new ExtentSparkReporter(extentReportFile+"\\FailedTests.html");
    sparkReporter_failed.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
    sparkReporter_failed.config().setReportName("Failure report");

    extentReports = new ExtentReports();
    extentReports.attachReporter(sparkReporter_all, sparkReporter_failed);

    extentReports.setSystemInfo("OS", System.getProperty("os.name"));
    extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
  }

  @Parameters("browserName")
  @BeforeTest
  public void setup(ITestContext context, @Optional("chrome") String browserName) {
    switch (browserName.toLowerCase()) {
    case "chrome":
      //      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      break;
    case "edge":
      //      WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
      break;
    case "firefox":
      //      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
      break;
    default:
      System.out.println("Browsername is invalid");
      break;
    }
    driver.manage().window().maximize();

    Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
    String device = capabilities.getBrowserName() + " " + capabilities.getBrowserVersion().substring(0, capabilities.getBrowserVersion().indexOf("."));
    String author = context.getCurrentXmlTest().getParameter("author");

    extentTest = extentReports.createTest(context.getName());
    extentTest.assignAuthor(author);
    extentTest.assignDevice(device);
  }

  @AfterMethod
  public void checkStatus(Method m, ITestResult result) {
    if(result.getStatus() == ITestResult.FAILURE) {
      String screenshotPath = null;
      screenshotPath = captureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");
      extentTest.addScreenCaptureFromPath(screenshotPath);
      extentTest.fail(result.getThrowable());
    } else if(result.getStatus() == ITestResult.SUCCESS) {
      extentTest.pass(m.getName() + " is passed");
    }

    extentTest.assignCategory(m.getAnnotation(Test.class).groups());
  }

  @AfterTest
  public void teardown() {
    driver.quit();
  }

  @AfterSuite
  public void generateExtentReports() throws Exception {
    extentReports.flush();
    Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\ExtentReports\\AllTests.html").toURI()); //opens automatically
    Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\ExtentReports\\FailedTests.html").toURI()); //opens automatically
  }

  public String captureScreenshot(String fileName) {
    if(screenshotsSubFolderName == null) {
      LocalDateTime myDateObj = LocalDateTime.now();
      DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
      screenshotsSubFolderName = myDateObj.format(myFormatObj);
    }

    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
    File destFile = new File("./Screenshots/"+ screenshotsSubFolderName+"/"+fileName);
    try {
      FileUtils.copyFile(sourceFile, destFile);
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Screenshot saved successfully");
    return destFile.getAbsolutePath();
  }
}