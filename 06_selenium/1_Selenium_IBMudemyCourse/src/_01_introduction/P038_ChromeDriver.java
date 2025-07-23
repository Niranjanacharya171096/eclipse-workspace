package _01_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P038_ChromeDriver {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niranjan'-\\Desktop\\libs\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://learn.letskodeit.com";
		driver.get(baseURL);
	}
}
