package com.hyrtutorials.java;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class H22_ExtentReport5_Configuration {
  public static void main(String[] args) throws IOException {

    ExtentReports extentReports = new ExtentReports();

    File extentReportFile = new File(System.getProperty("user.dir") + "\\ExtentReports");
    ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter(extentReportFile + "\\AllTests.html");

    // using java
    // ExtentSparkReporterConfig config = sparkReporter_all.config();
    // config.setTheme(Theme.DARK);
    // config.setReportName("All Tests report");
    // config.setDocumentTitle("Spark Report");
    // config.setTimeStampFormat("dd-MM-yyyy hh:mm:ss");
    // config.setCss(".badge-primary {background-color: #ff2c00;}");
    // config.setJs("document.getElementsByClassName('logo')[0].style.display='none';");

    // using json file - preferred
    sparkReporter_all.loadJSONConfig(new File("./ExtentReport-Config/extent-report-config.json"));

    // using xml file
    //    sparkReporter_all.loadXMLConfig(new File("./ExtentReport-Config/extent-report-config.xml"));

    extentReports.attachReporter(sparkReporter_all);// attach the generated report

    // Logging
    extentReports
    .createTest("Test1")
    .assignAuthor("Ramesh")
    .assignCategory("Smoke")
    .assignDevice("Chrome 99")
    .pass("Passed");

    extentReports.flush(); // creates the report
    Desktop.getDesktop().browse(new File(System.getProperty("user.dir") + "\\ExtentReports\\AllTests.html").toURI()); // opens
    // automatically
  }
}
