package _01_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P037_FirefoxDriverWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\letsk\\eclipse-workspace\\libs\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://learn.letskodeit.com";
		driver.get(baseURL);

	}
}