package _01_introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P097_WaitTypes {
	WebDriver driver;

	public P097_WaitTypes(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("Waiting for max:: " + timeout + " seconds for element to be available");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element appeared on the web page");
		} catch (Exception e) {
			System.out.println("Element not appeared on the web page");
		}
		return element;
	}

	public void clickWhenReady(By locator, int timeout) {
		try {
			WebElement element = null;
			System.out.println("Waiting for max:: " + timeout + " seconds for element to be clickable");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("Element clicked on the web page");
		} catch (Exception e) {
			System.out.println("Element not appeared on the web page");
		}
	}
}
