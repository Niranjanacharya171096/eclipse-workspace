package _01_introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P057_FindByClassDemo1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);

		driver.findElement(By.className("btn-style")).click();

	}
}