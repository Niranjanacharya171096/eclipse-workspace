package com.qa.base;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.qa.prop.ConfigReader;
import com.qa.utilities.TakeFailedScreenshot;

public class BaseTest {
  public static ExtentReports extentReports;
  public static ExtentTest extentTest;

  public WebDriver driver;
  public ConfigReader configReader;
  TakeFailedScreenshot tk;

  Properties prop;
  public static String screenshotsSubFolderName;

  @BeforeTest
  public void initialiseExtentReports() {
    ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("AllTests.html");
    sparkReporter_all.config().setReportName("All Tests report");

    extentReports = new ExtentReports();
    extentReports.attachReporter(sparkReporter_all);
  }

  @BeforeMethod
  public void preCondition(ITestContext context) {
    configReader = new ConfigReader();
    try {
      prop = configReader.init_prop();
    } catch (IOException e) {
      e.printStackTrace();
    }

    driver = new EdgeDriver();
    driver.get(prop.getProperty("url"));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void screenshotCapture(Method m, ITestResult result) throws InterruptedException {
    if(result.getStatus() == ITestResult.FAILURE) {
      String screenshotPath = null;
      screenshotPath = TakeFailedScreenshot.captureScreenshot(driver, result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");
      System.out.println("screenshotPath :: "+screenshotPath);
      extentTest.addScreenCaptureFromPath(screenshotPath);
      extentTest.fail(result.getThrowable());
    } else if(result.getStatus() == ITestResult.SUCCESS) {
      extentTest.pass(m.getName() + " is passed");
    }
    //    extentTest.assignCategory(m.getAnnotation().groups());
  }

  @AfterMethod(dependsOnMethods = "screenshotCapture")
  public void postCondition() throws InterruptedException {
    Thread.sleep(5000);
    driver.close();
  }

  @AfterTest
  public void generateExtentReports() throws Exception {
    extentReports.flush();
    Desktop.getDesktop().browse(new File("AllTests.html").toURI());
    //    Desktop.getDesktop().browse(new File("FailedTests.html").toURI());
  }
}
