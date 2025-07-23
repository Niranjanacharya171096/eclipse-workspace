package _19_testNGObsolete;

import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P286_TestNG_DependentTests {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = LogManager.getLogger(P286_TestNG_DependentTests.class);

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PropertyConfigurator.configure("log4j.properties");
		driver.get(baseUrl);
	}

	@Test
	public void searchFlights() throws Exception {
		P286_SearchPage.navigateToFlightsTab(driver);
		P286_SearchPage.fillOriginTextBox(driver, "New York");
		P286_SearchPage.fillDestinationTextBox(driver, "Chicago");
		P286_SearchPage.fillDepartureDateTextBox(driver, "10/28/2014");
		P286_SearchPage.fillReturnDateTextBox(driver, "10/31/2014");
		P286_SearchPage.clickOnSearchButton(driver);
	}

	@Test(dependsOnMethods = { "searchFlights" })
	public void selectMorningFlight() {
		P286_SearchPage.clickMorningFlight(driver);
	}

	@AfterClass
	public void afterClass() {
	}
}
