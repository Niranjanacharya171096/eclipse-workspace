package _01_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P038_ChromeDriverWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		    "C:\\Users\\letsk\\eclipse-workspace\\libs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://www.letskodeit.com";
		driver.get(baseURL);

	}
}