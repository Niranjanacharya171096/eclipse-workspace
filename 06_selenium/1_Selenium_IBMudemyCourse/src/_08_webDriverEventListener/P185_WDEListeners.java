package _08_webDriverEventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class P185_WDEListeners {

	public static void main(String[] args) {
		String baseUrl = "https://www.expedia.com/";
		WebDriver driver = new FirefoxDriver();

		EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
		P185_HandleEvents he = new P185_HandleEvents();
		eDriver.register(he);

		eDriver.get(baseUrl);
		eDriver.findElement(By.id("tab-flight-tab")).click();

	}
}