package com.hyrtutorials.java;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class H22_ExtentReport1_Logging {
  public static void main(String[] args) throws IOException {

    ExtentReports extentReports = new ExtentReports();

    File extentReportFile = new File(System.getProperty("user.dir") + "\\ExtentReports");
    ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter(extentReportFile+"\\AllTests.html");

    extentReports.attachReporter(sparkReporter_all);//attach the generated report

    //Logging
    ExtentTest test1 = extentReports.createTest("Test1"); //by default Test shows as Pass
    test1.log(Status.PASS, "This is passed"); // we can use below simplified version

    ExtentTest test2 = extentReports.createTest("Test2"); //by default Test shows as Pass
    test2.fail("This is failed"); // simplified version of log

    extentReports.createTest("Test3").skip("Thisi is skipped");

    extentReports
    .createTest("Test4")
    .log(Status.INFO, "info1")
    .log(Status.PASS, "pass1")
    .log(Status.INFO, "info2")
    .log(Status.WARNING, "warning1")
    .log(Status.SKIP, "skip1");

    extentReports.flush(); // creates the report
    Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\ExtentReports\\AllTests.html").toURI()); //opens automatically
  }
}
