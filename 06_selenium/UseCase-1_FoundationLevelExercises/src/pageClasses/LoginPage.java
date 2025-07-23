package pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import locators.LoginPageLocators;
import utilities.WebDriverWaitUtils;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		System.out.println("Driver = " + driver);
		this.driver = driver;
	}

	public void chooseLanguage() {

	}

	public void moveToLogin() {
		WebElement loginOption = driver.findElement(LoginPageLocators.loginOption);
		Actions actions = new Actions(driver);
		actions.moveToElement(loginOption).perform();
		System.out.println("moveToLogin");
	}

	public void clickOnLogin() {
		WebElement loginBtn = driver.findElement(LoginPageLocators.loginBtn);
		loginBtn.click();
		System.out.println("clickOnLogin");
	}

	public void clickOnSignUp() {
		WebElement signupBtn = driver.findElement(LoginPageLocators.signupBtn);
		signupBtn.click();
		System.out.println("clickOnSignUp");
	}

	public void switchToAccFrame() {
//		WebElement accFrame = driver.findElement(LoginPageLocators.accFrame);
		WebElement accFrame = WebDriverWaitUtils.waitForElementToBePresent(driver, LoginPageLocators.accFrame, 10);
//		driver.switchTo().frame(accFrame);
//		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wdw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(accFrame));
		WebDriverWaitUtils.waitForFrameSwitch(driver, accFrame, 5);
		System.out.println("switchToAccFrame");
	}

	public void clickOnGmail() {
		WebElement gmailBtn = driver.findElement(LoginPageLocators.gmailBtn);
		gmailBtn.click();
		System.out.println("clickOnGmail");
	}

	public void clickLoginWithOTP() {
		WebElement loginWithOTP = driver.findElement(LoginPageLocators.loginWithOTP);
		loginWithOTP.click();
		System.out.println("clickLoginWithOTP");
	}

	public void clickLoginWithPassword() {
		WebElement loginWithPassword = driver.findElement(LoginPageLocators.loginWithPassword);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", loginWithPassword);
//		loginWithPassword.click();
		System.out.println("clickLoginWithPassword");
	}

	public void enterEmailID(String email) {
		WebElement loginEmail = driver.findElement(LoginPageLocators.email);
		loginEmail.sendKeys(email);
		System.out.println("enterEmailID");
	}

	public void enterPassword(String password) {
		WebElement loginPassword = driver.findElement(LoginPageLocators.password);
		loginPassword.sendKeys(password);
		System.out.println("enterPassword");
	}

	public void clickLogin() {
		WebElement login = driver.findElement(LoginPageLocators.login);
//		WebDriverWaitUtils.waitUntilEnabled(driver, login, 5);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", login);
//		login.click();
		System.out.println("clickLogin");
	}

	public void closeMobileVerification() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

//		String text = (String) js
//		    .executeScript("return document.getElementsByTagName('iframe')[0].contentWindow.document.body.innerText;");
//		System.out.println("Iframe text: " + text);

		Boolean exists = (Boolean) js.executeScript("return document.querySelectorAll('iframe#mVerifyIframe').length > 0;");
		System.out.println("Iframe present: " + exists);

//		WebElement mobileVerificationFrame = driver.findElement(By.xpath("//iframe[contains(@id,'mVerifyIframe')]"));
//		WebDriverWaitUtils.waitForFrameSwitch(driver, By.xpath("//iframe[contains(@id,'mVerifyIframe')])"), 30);
//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("//input[@name='mobile_mirror']")).sendKeys("7676798373");
//		driver.findElement(By.xpath("//a[@class='skip_btn']")).click();
		System.out.println("closeMobileVerification");
	}

	public void clickOnLogout() {

	}

	public void enterEmailID2(String email) {
		WebElement loginEmail = driver.findElement(LoginPageLocators.email2);
		loginEmail.sendKeys(email);
		System.out.println("enterEmailID2");
	}

	public void clicOnGetOTP() {
		WebElement getOTPBtn = driver.findElement(LoginPageLocators.getOTPBtn);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", getOTPBtn);
//		getOTPBtn.click();
		System.out.println("clicOnGetOTP");
	}

	public void enterOTP(String otpVal) {
		WebElement otpFields = driver.findElement(LoginPageLocators.otpFields);
		((JavascriptExecutor) driver).executeScript("arguments[0].value='6'", otpFields);
//		char[] otp = (otpVal.toCharArray());
//		int i = 0;
//		for (WebElement otpField : otpFields) {
//		otpFields.sendKeys("6");
//			break;
//	}

	}

	public void invalidOTPMsg() {
	}

	public void invalidPasswordMsg() {
//		WebElement msg = driver.findElement(LoginPageLocators.invalidPassMsg);
		WebElement msg = WebDriverWaitUtils.waitForElementToBePresent(driver, LoginPageLocators.invalidPassMsg, 10);
//		System.out.println((msg.getText()));
		if ((msg.getText()).equals("Invalid User Id/EmailID or Password. Please try again.")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
}
