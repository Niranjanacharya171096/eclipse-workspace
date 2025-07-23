package locators;

import org.openqa.selenium.By;

public class CommoditiesPageLocators {
	public static By gold = By.xpath("//a[text()='View More']");
	public static By selectOptions = By.id("expdt");

	public static By currentPrice = By.xpath("//td[text()='Open']/following-sibling::td");
	public static By previousPrice = By.xpath("//td[contains(text(),'Previous')]/following-sibling::td");
	public static By percentageChange = By.xpath("//td[contains(text(),'Chg%')]/following-sibling::td");

	public static By srollTo = By.xpath("//li[a[@title='Home']]");
}