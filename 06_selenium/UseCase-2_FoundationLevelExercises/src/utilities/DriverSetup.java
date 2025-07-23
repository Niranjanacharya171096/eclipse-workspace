package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	public static WebDriver initializeDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://www.moneycontrol.com/india/stockpricequote/";
		driver.get(url);
		System.out.println(driver);
		return driver;
	}
}
