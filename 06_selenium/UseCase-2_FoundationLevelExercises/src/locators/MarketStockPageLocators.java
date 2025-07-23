package locators;

import org.openqa.selenium.By;

public class MarketStockPageLocators {
	public static By notification = By.xpath("//button[text()='No thanks']");
	public static By moneyControlAd = By.xpath("//div[@id='marketsProModalDiv']//button");
	public static By table = By.xpath("//th[strong[text()='Company Name']]/ancestor::table");
	public static By rows = By.xpath("/tbody/tr");
	public static By cells = By.xpath("/td/a");
	public static By cellValues = By.xpath("//th/strong[text()='Company Name']/ancestor::table/tbody/tr/td/a");

	public static By currentPrice = By.xpath("//tr[1]/td[contains(@id,'lastPrice')]");
	public static By previousPrice = By.xpath("//td[contains(text(),'Previous')]/following-sibling::td");
	public static By percentageChange = By.xpath("//tr[1]/td[contains(@id,'perChange')]");
}