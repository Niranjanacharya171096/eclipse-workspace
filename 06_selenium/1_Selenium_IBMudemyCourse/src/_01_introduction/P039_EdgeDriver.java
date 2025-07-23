package _01_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P039_EdgeDriver {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.msedge.driver", "C:\\Users\\Niranjan'-\\Desktop\\libs\\browserdrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		String baseURL = "http://learn.letskodeit.com";
		driver.get(baseURL);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
