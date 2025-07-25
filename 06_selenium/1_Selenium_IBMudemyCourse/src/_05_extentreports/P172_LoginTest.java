package _05_extentreports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class P172_LoginTest {

	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	P172_HomePage hp;

	@BeforeClass
	public void beforeClass() {
		baseUrl = "http://www.letskodeit.com/";
		report = P171_ExtentFactory.getInstance();
		test = report.startTest("Verify Welcome Text");
		driver = new FirefoxDriver();
		hp = new P172_HomePage(driver, test);
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
		hp.clickSignUpLink();

		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		test.log(LogStatus.INFO, "Clicked on login link");

		WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
		emailField.sendKeys("test@email.com");
		test.log(LogStatus.INFO, "Enter email");

		WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
		passwordField.sendKeys("abcabc");
		test.log(LogStatus.INFO, "Enter password");

		WebElement goButton = driver.findElement(By.id("memberLoginDialogsubmitButton"));
		goButton.click();
		test.log(LogStatus.INFO, "Clicked Go button");

		Thread.sleep(3000);

		WebElement welcomeText = null;

		try {
			welcomeText = driver.findElement(By.xpath("//div[text()='Hello test@email.com']"));
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertTrue(welcomeText != null);
		test.log(LogStatus.PASS, "Verified Welcome Text");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}