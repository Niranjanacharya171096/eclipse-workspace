package _01_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P057_FindByClassDemo2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		String baseURL = "https://www.facebook.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.className("inputtext")).sendKeys("Automation");
		driver.findElement(By.className("uiButtonConfirm")).click();
	}
}