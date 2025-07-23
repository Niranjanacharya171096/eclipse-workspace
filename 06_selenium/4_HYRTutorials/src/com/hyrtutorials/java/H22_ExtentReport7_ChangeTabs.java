package com.hyrtutorials.java;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class H22_ExtentReport7_ChangeTabs {
  public static void main(String[] args) throws IOException {

    ExtentReports extentReports = new ExtentReports();

    File extentReportFile = new File(System.getProperty("user.dir") + "\\ExtentReports");
    ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter(extentReportFile+"\\AllTests.html");

    //    change the order or remove tab
    sparkReporter_all.viewConfigurer().viewOrder().as(new ViewName[] {
        ViewName.DASHBOARD,
        ViewName.CATEGORY,
        ViewName.DEVICE,
        ViewName.AUTHOR,
        ViewName.TEST
    }).apply();

    extentReports.attachReporter(sparkReporter_all);//attach the generated report

    //Logging
    extentReports
    .createTest("Test1")
    .assignAuthor("Ramesh")
    .assignCategory("Smoke")
    .assignDevice("Chrome 99")
    .pass("Passed");

    extentReports
    .createTest("Test2")
    .assignAuthor("Rajesh")
    .assignCategory("Sanity")
    .assignDevice("Edge 99")
    .fail("Failed");

    extentReports
    .createTest("Test3")
    .assignCategory(new String[]{"Smoke", "Sanity"}) //we can use String[] as well
    .assignAuthor("Ram", "Sam")
    .assignDevice("Edge 99")
    .pass("Passed");

    extentReports.flush(); // creates the report
    Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\ExtentReports\\AllTests.html").toURI()); //opens automatically
  }
}
