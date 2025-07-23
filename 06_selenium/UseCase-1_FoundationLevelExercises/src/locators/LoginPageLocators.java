package locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
	public static By loginOption = By.xpath("//a[contains(text(),'Login')]");
	public static By loginBtn = By.xpath("//a[contains(text(),'Log-in')]");
	public static By signupBtn = By.xpath("//a[contains(text(),'Sign-Up')]");
	public static By accFrame = By.xpath("//iframe[@id='myframe']");
	public static By gmailBtn = By.xpath("//a[contains(@id,'ACCT_GPLUS_SIGNUP')]");
	public static By loginWithOTP = By.xpath("//div[@id='mc_login']//li[contains(text(),'Login with OTP')]");
	public static By loginWithPassword = By
	    .xpath("//div[@id='mc_log_otp_pre']//li[contains(text(),'Login with Password')]");

	public static By email = By.xpath("//input[@placeholder='Email ID/Mobile No. or User ID']");
	public static By password = By.xpath("//input[@placeholder='Password']");
	public static By login = By.xpath("//button[text()='Login']");

	public static By mobileVerifyIframe = By.xpath("//iframe[contains(@id,'mVerifyIframe')]");
	public static By mVerifyIframeClose = By.xpath("//iframe[contains(@id,'mVerifyIframe')]");

	public static By validLogin = By.xpath("//a/span[contains(text(),'Hi')]");

	public static By invalidPassMsg = By.xpath("//div[contains(text(),'Invalid')]");

	public static By email2 = By
	    .xpath("//input[contains(@placeholder,'Email or Mobile No.') and (@name='email_mirror')]");
	public static By getOTPBtn = By.xpath("//div[@id='mc_log_otp_pre']/button[contains(text(),'Get OTP')]");
	public static By otpFields = By
	    .xpath("//div[@class='login_with_otp_section']//input[starts-with(@name,'otp_first')]");
	public static By invalidOTPMsg = By.xpath("//div[contains(text(),'invalid')]");

}
