package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
//	LoginPage loginPage;

	public static WebDriver initializeDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://www.moneycontrol.com/";
		driver.get(url);

		if (!(driver.getCurrentUrl()).equals(url)) {
			System.out.println("URL NOT EQUAL");
			// WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(15));
			// wdw.until(ExpectedConditions.titleContains("Business News Today"));
			boolean bool = WebDriverWaitUtils.waitForTitleContains(driver, "Business News Today", 15);
			System.out.println(bool);
		}
		System.out.println(driver);
		return driver;
	}
}
