package com.hyrtutorials.java;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class H22_ExtentReport6_SystemEnvironmentInfo {
  public static void main(String[] args) throws IOException {

    ExtentReports extentReports = new ExtentReports();

    File extentReportFile = new File(System.getProperty("user.dir") + "\\ExtentReports");
    ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter(extentReportFile+"\\AllTests.html");

    System.getProperties().list(System.out); //prints all the properties

    extentReports.setSystemInfo("OS : ", System.getProperty("os.name"));
    extentReports.setSystemInfo("Java Version : ", System.getProperty("java.version"));
    extentReports.setSystemInfo("URL : ", "www.google.com");
    extentReports.setSystemInfo("Username : ", "Ramesh");
    extentReports.setSystemInfo("Password : ", "pass123");

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");

    Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
    extentReports.setSystemInfo("Browser Name : ", cap.getBrowserName());
    extentReports.setSystemInfo("Browser Version : ", cap.getBrowserVersion());

    extentReports.attachReporter(sparkReporter_all);//attach the generated report

    //Logging
    extentReports
    .createTest("Test3")
    .assignCategory(new String[]{"Smoke", "Sanity"}) //we can use String[] as well
    .assignAuthor("Ram", "Sam")
    .assignDevice("Edge 99")
    .pass("Passed");

    extentReports.flush(); // creates the report
    driver.quit();
    Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\ExtentReports\\AllTests.html").toURI()); //opens automatically
  }
}
