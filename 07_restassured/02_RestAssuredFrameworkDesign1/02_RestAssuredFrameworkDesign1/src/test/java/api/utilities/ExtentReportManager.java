package api.utilities;

import java.text.SimpleDateFormat; 
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
  public ExtentSparkReporter sparkReporter; // look and feel
  public ExtentReports extent;
  public ExtentTest test; // result

  String repName;

  @Override
  public void onStart(ITestContext context) {
    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); // time stamp
    repName = "Test-Report-" + timeStamp + ".html";

    sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName); // specify location of the report
    sparkReporter.config().setDocumentTitle("RestAssuredAutomationProject"); // Title of report
    sparkReporter.config().setReportName("Pet Store Users API"); // name of the report
    sparkReporter.config().setTheme(Theme.DARK);

    extent = new ExtentReports();
    System.out.println("EXTENT :: " + extent);
    extent.attachReporter(sparkReporter);
    
    extent.setSystemInfo("Application", "Pest Store Users API");
    extent.setSystemInfo("Operating System", System.getProperty("os.name"));
    extent.setSystemInfo("User name", System.getProperty("user.name"));
    extent.setSystemInfo("Environement", "QA");
    extent.setSystemInfo("user", "niranjan");
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    test = extent.createTest(result.getName());
    test.assignCategory(result.getMethod().getGroups());
    test.createNode(result.getName());
    test.log(Status.PASS, "Test Passed");
//    ITestListener.super.onTestSuccess(result);
  }

  @Override
  public void onTestFailure(ITestResult result) {
    test = extent.createTest(result.getName());
    test.createNode(result.getName());
    test.assignCategory(result.getMethod().getGroups());
    test.log(Status.FAIL, "Test Failed");
    test.log(Status.FAIL, result.getThrowable().getMessage());
//    ITestListener.super.onTestFailure(result);
  }

  @Override
  public void onTestSkipped(ITestResult result) {
    test = extent.createTest(result.getName());
    test.createNode(result.getName());
    test.assignCategory(result.getMethod().getGroups());
    test.log(Status.SKIP, "Test Skipped");
    test.log(Status.SKIP, result.getThrowable().getMessage());
//    ITestListener.super.onTestSkipped(result);
  }

  @Override
  public void onFinish(ITestContext context) {
    extent.flush(); //to write the result in the report
    //    ITestListener.super.onFinish(context);
  }
}