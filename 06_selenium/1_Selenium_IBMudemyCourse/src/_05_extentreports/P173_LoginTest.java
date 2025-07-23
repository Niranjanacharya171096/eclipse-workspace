package _05_extentreports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class P173_LoginTest {

	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	P173_HomePage hp;

	@BeforeClass
	public void beforeClass() {
		baseUrl = "http://www.letskodeit.com/";
		report = P171_ExtentFactory.getInstance();
		test = report.startTest("Verify Welcome Text");
		driver = new FirefoxDriver();
		hp = new P173_HomePage(driver, test);
		test.log(LogStatus.INFO, "Browser Started...");

		// Maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web application opened");
	}

	@Test
	public void test1_validLoginTest() throws Exception {
		hp.login("test@email.com", "abcabc");

		Thread.sleep(3000);

		boolean result = hp.isWelcomeTextPresent();

		Assert.assertTrue(result);
		test.log(LogStatus.PASS, "Verified Welcome Text");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}