package pageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import locators.CommoditiesPageLocators;
import utilities.WebDriverWaitUtils;

public class CommoditiesPage {
	WebDriver driver;

	public CommoditiesPage(WebDriver driver) {
		System.out.println("Driver = " + driver);
		this.driver = driver;
	}

	public void clickGold() {
		driver.findElement(CommoditiesPageLocators.gold).click();
	}

	public List<WebElement> getPeriodTabs() {
		System.out.println("getPeriodTabs");
		WebElement selectOptions = WebDriverWaitUtils.waitForElementToBePresent(driver,
		    CommoditiesPageLocators.selectOptions, 10);
//		WebElement selectOptions = driver.findElement(CommoditiesPageLocators.selectOptions);
		Select sel = new Select(selectOptions);
		return sel.getOptions();
	}

	public String getPrice() {
		return driver.findElement(CommoditiesPageLocators.currentPrice).getText();
	}

	public String getChange() {
		return driver.findElement(CommoditiesPageLocators.previousPrice).getText();
	}

	public String getChangePercent() {
		return driver.findElement(CommoditiesPageLocators.percentageChange).getText();
	}
}
