package _01_introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P055_FindByNameDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);

		driver.findElement(By.name("enter-name")).sendKeys("Automation");
	}
}