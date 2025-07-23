package testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import pageClasses.MarketStockPage;
import utilities.DriverSetup;
import utils.ExcelUtils;

public class TC001_MarketStockDetails {
	public static void main(String[] args) throws Exception {
		WebDriver driver = DriverSetup.initializeDriver();

		MarketStockPage marketStockPage = new MarketStockPage(driver);
		Thread.sleep(5000);
		marketStockPage.closeNotificationAndAd();

		String xlpath = "./Excel/CompaniesStockDetails.xlsx";
		String sheetName = "Sheet1";

		List<String> companies = ExcelUtils.readData(xlpath, sheetName);
		System.out.println(companies);// .toString());
		List<String[]> results = new ArrayList<>();

		results.add(new String[] { "Company", "Current Value", "Change", "Change %" }); // Header

		for (String company : companies) {
			if (!company.equals("Company")) {
				System.out.println(company);
				marketStockPage.searchCompany(company);
//				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//				WebDriverWaitUtils.waitForPageToLoad(driver, 10);
				Thread.sleep(15);
				String current = marketStockPage.getCurrentValue();
				String change = marketStockPage.getChangedValue();
				String percent = marketStockPage.getChangePercentage();
				Thread.sleep(10);

				results.add(new String[] { company, current, change, percent });
				driver.navigate().back();
//				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
				Thread.sleep(10);
			}
		}

		ExcelUtils.writeData(xlpath, sheetName, results);

		driver.quit();
	}
}
