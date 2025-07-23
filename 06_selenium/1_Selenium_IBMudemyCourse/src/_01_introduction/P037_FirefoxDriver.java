package _01_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P037_FirefoxDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.geko.driver",
		    "C:\\Users\\Niranjan'-\\Desktop\\libs\\browserdrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		String baseURL = "http://learn.letskodeit.com";
		driver.get(baseURL);
	}

}
