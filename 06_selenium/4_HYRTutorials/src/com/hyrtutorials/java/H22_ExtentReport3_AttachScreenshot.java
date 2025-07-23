package com.hyrtutorials.java;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class H22_ExtentReport3_AttachScreenshot {
  static WebDriver driver;

  public static void main(String[] args) throws IOException {

    ExtentReports extentReports = new ExtentReports();

    File extentReportFile = new File(System.getProperty("user.dir") + "\\ExtentReports");
    ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter(extentReportFile + "\\AllTests.html");

    extentReports.attachReporter(sparkReporter_all);// attach the generated report

    driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    String base64Code = captureScreenshot();
    String path = captureScreenshot("Google.jpg");

    //test level
    extentReports.createTest("Screenshot Test 1 at Test Level", "attaching screenshot at Test Level")
    .info("INFO Message")
    .addScreenCaptureFromBase64String(base64Code)
    .addScreenCaptureFromBase64String(base64Code, "Google Home Page")
    .addScreenCaptureFromPath(path)
    .addScreenCaptureFromPath(path, "Google Home Page");

    Throwable t = new Throwable("This is throwable exception");
    //log level
    extentReports.createTest("Screenshot Test 3 at Log Level", "attaching screenshot at Log Level")
    .info("INFO Message")
    .fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code).build())
    .fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code, "GoogleHome Page").build())
    .fail("this is Google", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Code, "GoogleHome Page").build())
    .fail(MediaEntityBuilder.createScreenCaptureFromPath(path, "Google Home Page").build())
    .fail(t, MediaEntityBuilder.createScreenCaptureFromPath(path, "Google Home Page").build());

    extentReports.flush(); // creates the report
    driver.quit();
    Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\ExtentReports\\AllTests.html").toURI()); // opens automatically
  }

  public static String captureScreenshot() {
    String base64Code = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    return base64Code; // not storing in local, directly showing on the report
  }

  public static String captureScreenshot(String fileName) {
    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File destFile = new File("./Screenshots/"+fileName); //storing in local
    try {
      FileHandler.copy(srcFile, destFile);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return destFile.getAbsolutePath();
  }
}
