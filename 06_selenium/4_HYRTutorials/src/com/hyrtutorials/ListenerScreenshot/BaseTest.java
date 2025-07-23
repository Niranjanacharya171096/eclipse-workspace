package com.hyrtutorials.ListenerScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
  public static WebDriver driver;
  public static String screenshotsSubFolderName;

  @BeforeTest
  public void setup() {
    driver = new EdgeDriver();
    driver.manage().window().maximize();
  }

//  @AfterMethod
//  public void screenshotCapture(ITestResult result) throws InterruptedException {
//    if(result.getStatus() == ITestResult.FAILURE) {
//      captureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");
//    }
//  }

  @AfterTest
  public void teardown() {
    driver.quit();
  }

  public void captureScreenshot(String fileName) throws InterruptedException {
    if(screenshotsSubFolderName == null) {
      LocalDateTime myDateObj = LocalDateTime.now();
      DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
      screenshotsSubFolderName = myDateObj.format(myFormatObj);
    }
    Thread.sleep(5000);
    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
    File destFile = new File("./failedScreenshot/"+ screenshotsSubFolderName+"/"+fileName);
    try {
      FileUtils.copyFile(sourceFile, destFile);
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Screenshot saved successfully");
  }
}