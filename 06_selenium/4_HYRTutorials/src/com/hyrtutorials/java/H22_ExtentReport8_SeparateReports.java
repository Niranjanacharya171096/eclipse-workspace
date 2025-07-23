package com.hyrtutorials.java;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class H22_ExtentReport8_SeparateReports {
  public static void main(String[] args) throws IOException {

    ExtentReports extentReports = new ExtentReports(); //Engine

    File extentReportFile = new File(System.getProperty("user.dir") + "\\ExtentReports");
    ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter(extentReportFile+"\\AllTests.html");

    ExtentSparkReporter sparkReporter_failed = new ExtentSparkReporter(extentReportFile+"\\FailedTests.html");
    sparkReporter_failed.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();

    ExtentSparkReporter sparkReporter_skipAndwaring = new ExtentSparkReporter(extentReportFile+"\\SkipAndWarningTests.html");
    sparkReporter_skipAndwaring.filter().statusFilter().as(new Status[] {Status.SKIP, Status.WARNING}).apply();

    extentReports.attachReporter(sparkReporter_all, sparkReporter_failed, sparkReporter_skipAndwaring);//attach the generated report

    //Logging
    extentReports
    .createTest("Test1")
    .assignAuthor("Ramesh")
    .assignCategory("Smoke")
    .assignDevice("Chrome 99")
    .skip("Skipped");

    extentReports
    .createTest("Test2")
    .assignAuthor("Rajesh")
    .assignCategory("Sanity")
    .assignDevice("Edge 99")
    .pass("Passed");

    extentReports
    .createTest("Test3")
    .assignCategory(new String[]{"Smoke", "Sanity"}) //we can use String[] as well
    .assignAuthor("Ram", "Sam")
    .assignDevice("Edge 99")
    .warning("Warning");

    Throwable t1 = new RuntimeException("This is custom exception1");
    extentReports
    .createTest("Exception Test2")
    .fail(t1);

    Throwable t2 = new RuntimeException("This is custom exception2");
    extentReports
    .createTest("Exception Test3")
    .fail(t2);

    extentReports.flush(); // creates the report
    File src = new File(extentReportFile+"\\AllTests.html");
    Desktop.getDesktop().browse(src.toURI()); //opens automatically
    Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\ExtentReports\\FailedTests.html").toURI()); //opens automatically
    Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\ExtentReports\\SkipAndWarningTests.html").toURI()); //opens automatically
  }
}
