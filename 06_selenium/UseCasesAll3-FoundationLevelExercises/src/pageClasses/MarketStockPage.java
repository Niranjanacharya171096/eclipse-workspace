package pageClasses;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.MarketStockPageLocators;
import utilities.WebDriverWaitUtils;

public class MarketStockPage {
	WebDriver driver;

	public MarketStockPage(WebDriver driver) {
		System.out.println("Driver = " + driver);
		this.driver = driver;
	}

	public void closeNotificationAndAd() {
		driver.findElement(MarketStockPageLocators.notification).click();
		driver.findElement(MarketStockPageLocators.moneyControlAd).click();
//		WebDriverWaitUtils.waitForElementToBePresent(driver, MarketStockPageLocators.moneyControlAd, 5).click();
	}

	public void searchCompany(String company) {
//		WebElement table = driver.findElement(MarketStockPageLocators.table);
		List<WebElement> cellValues = driver.findElements(MarketStockPageLocators.cellValues);
//		System.out.println(cellValues.get(5).getText());
		for (WebElement cell : cellValues) {
			if ((cell.getText()).equalsIgnoreCase(company)) {
				System.out.println("Found :: " + cell.getText());
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cell);
				cell.click();
				break;
			}
		}
	}

	public String getCurrentValue() {
//		WebElement currentPrice = driver.findElement(MarketStockPageLocators.currentPrice);
		WebElement currentPrice = WebDriverWaitUtils.waitForElementToBePresent(driver, MarketStockPageLocators.currentPrice,
		    10);
		return currentPrice.getText();
	}

	public String getChangedValue() {
		return driver.findElement(MarketStockPageLocators.previousPrice).getText();
	}

	public String getChangePercentage() {
		return driver.findElement(MarketStockPageLocators.percentageChange).getText();
	}
}
