package _02_automationframeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P130_SearchPageFactory {
	WebDriver driver;

	@FindBy(id = "header-history")
	WebElement headerHistory;

	@FindBy(id = "tab-flight-tab")
	WebElement fligthsTab;

	@FindBy(id = "flight-origin")
	WebElement originCity;

	@FindBy(id = "flight-destination")
	WebElement destinationCity;

	@FindBy(id = "flight-departing")
	WebElement departureDate;

	@FindBy(id = "flight-returning")
	WebElement returnDate;

	public P130_SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickFlightsTab() {
		headerHistory.click();
		fligthsTab.click();
	}

	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}

	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}

}
