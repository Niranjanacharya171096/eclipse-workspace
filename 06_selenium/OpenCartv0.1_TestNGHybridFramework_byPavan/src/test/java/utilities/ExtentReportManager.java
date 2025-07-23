package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
  public ExtentSparkReporter sparkReporter; // look and feel
  public ExtentReports extent;

  String repName;

  public ExtentReports setup(ITestContext testContext) {
    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); // time stamp
    repName = "Test-Report-" + timeStamp + ".html";

    sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName); // specify location of the report
    sparkReporter.config().setDocumentTitle("OpenCart Automation Project"); // Title of report
    sparkReporter.config().setReportName("OpenCart Functional testing"); // name of the report
    sparkReporter.config().setTheme(Theme.DARK);

    extent = new ExtentReports();
    System.out.println("EXTENT :: " + extent);
    extent.attachReporter(sparkReporter);

    extent.setSystemInfo("Application", "OpenCart");
    extent.setSystemInfo("Module", "Admin");
    extent.setSystemInfo("SubModule", "Customers");
    extent.setSystemInfo("Operating System", System.getProperty("os.name"));
    extent.setSystemInfo("User name", System.getProperty("user.name"));
    extent.setSystemInfo("Environement", "QA");
    extent.setSystemInfo("user", "niranjan");

    String os = testContext.getCurrentXmlTest().getParameter("os"); // get os from testng parameter
    extent.setSystemInfo("Operating System", "os");

    String browser = testContext.getCurrentXmlTest().getParameter("browser"); // get browser from testng parameter
    extent.setSystemInfo("Browser", "browser");

    // get <include> from testng parameter
    List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups();
    if (!includedGroups.isEmpty()) {
      extent.setSystemInfo("Groups", includedGroups.toString());
    }

    return extent;
  }
}
