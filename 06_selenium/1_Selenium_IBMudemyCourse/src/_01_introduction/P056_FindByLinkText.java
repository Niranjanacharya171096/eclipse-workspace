package _01_introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P056_FindByLinkText {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
//		System.setProperty("webdriver.gecko.driver", "/Users/atomar/Documents/workspace_personal/libs/geckodriver");
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String baseURL = "https://letskodeit.teachable.com/";
		driver.get(baseURL);

		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("Pract")).click();
	}
}