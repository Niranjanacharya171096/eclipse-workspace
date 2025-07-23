package testCases;

import org.openqa.selenium.WebDriver;

import pageClasses.LoginPage;
import utilities.DriverSetup;

public class TC002_LoginInvalidPassword {
	public static void main(String[] args) throws Exception {
		WebDriver driver = DriverSetup.initializeDriver();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.moveToLogin();
		loginPage.clickOnLogin();
		loginPage.switchToAccFrame();
		loginPage.clickLoginWithPassword();

		loginPage.enterEmailID("com");
		loginPage.enterPassword("Password");
		loginPage.clickLogin();
		loginPage.invalidPasswordMsg();

//		String otp = GmailOTPUtils.fetchOTPFromGmail(driver);
//		loginPage.enterOTP(otp);
//

		System.out.println("Login with Invalid credentials");
//		driver.quit();
	}
}
