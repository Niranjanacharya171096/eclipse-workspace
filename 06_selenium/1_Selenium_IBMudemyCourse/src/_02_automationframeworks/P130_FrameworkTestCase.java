package _02_automationframeworks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P130_FrameworkTestCase {
	private WebDriver driver;
	private String baseUrl;
	P130_SearchPageFactory searchPage;

	@Before
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		searchPage = new P130_SearchPageFactory(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws Exception {
		searchPage.clickFlightsTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("San Francisco");
//		searchPage.setDepartureDate("10/28/2015");
//		searchPage.setReturnDate("10/31/2015");
	}

	@After
	public void afterClass() {
	}
}