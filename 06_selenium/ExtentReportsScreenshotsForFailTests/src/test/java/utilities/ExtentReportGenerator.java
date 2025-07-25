package utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportGenerator {
  public static ExtentReports getExtentReport() {
    ExtentReports report = new ExtentReports();
    File extentReportFile = new File(System.getProperty("user.dir") + "\\ExtentReports\\eReport.html");

    ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
    report.attachReporter(sparkReporter);

    return report;
  }
}
