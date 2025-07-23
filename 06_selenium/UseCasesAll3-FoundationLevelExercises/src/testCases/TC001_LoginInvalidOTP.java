package testCases;

import org.openqa.selenium.WebDriver;

import pageClasses.LoginPage;
import utilities.DriverSetup;

public class TC001_LoginInvalidOTP {
  public static void main(String[] args) throws Exception {
    WebDriver driver = DriverSetup.initializeDriver("TC001");

    LoginPage loginPage = new LoginPage(driver);
    loginPage.moveToLogin();
    loginPage.clickOnLogin();
    loginPage.switchToAccFrame();

    loginPage.enterEmailID2("niranjanacharya09@gmail.com");

    //		Thread.sleep(5000);
    loginPage.clicOnGetOTP();
    loginPage.enterOTP("4524");

    //		loginPage.invalidOTPMsg();

    //		String otp = GmailOTPUtils.fetchOTPFromGmail(driver);
    //		loginPage.enterOTP(otp);
    //

    System.out.println("Login with Invalid credentials");
    //		driver.quit();
  }
}
