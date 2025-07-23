package _01_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P044_SeleniumManagerDemo {

	public static void main(String[] args) {
//		String driverPath = SeleniumManager.getInstance().getDriverPath("geckodriver"); 
		// this wont work

//		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.letskodeit.com");
		System.out.println(driver.getTitle());
//		System.out.println(driverPath);
		driver.quit();
	}
}