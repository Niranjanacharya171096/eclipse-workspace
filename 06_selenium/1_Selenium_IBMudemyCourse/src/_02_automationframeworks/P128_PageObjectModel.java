package _02_automationframeworks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P128_PageObjectModel {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		P128_SearchPage.fillOriginTextBox(driver, "New York");
		P128_SearchPage.destinationTextBox(driver).sendKeys("Chicago");
		P128_SearchPage.departureDateTextBox(driver).sendKeys("12/25/2014");
		// Added a line to clear the return date text box
		// before entering the return date, because Expedia by default
		// enters the return date same as the departure date
		P128_SearchPage.returnDateTextBox(driver).clear();
		P128_SearchPage.returnDateTextBox(driver).sendKeys("12/31/2014");
		P128_SearchPage.clickOnSearchButton(driver);
	}

	@After
	public void tearDown() throws Exception {
	}

}
