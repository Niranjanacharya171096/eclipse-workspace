package _05_extentreports;

import com.relevantcodes.extentreports.ExtentReports;

public class P171_ExtentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "//Users//atomar//Desktop//report-demo.html";
		extent = new ExtentReports(Path, false);
		extent.addSystemInfo("Selenium Version", "2.52").addSystemInfo("Platform", "Mac");

		return extent;
	}
}