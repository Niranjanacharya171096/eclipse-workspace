package _10_maven;

import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P201_TestNG_TestSuite {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = LogManager.getLogger(P201_TestNG_TestSuite.class);

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
	public void fillBasicInfo() throws Exception {
		P201_SearchPage.navigateToFlightsTab(driver);
		P201_SearchPage.fillOriginTextBox(driver, "New York");
		P201_SearchPage.fillDestinationTextBox(driver, "Chicago");
		P201_SearchPage.fillDepartureDateTextBox(driver, "12/25/2015");
		P201_SearchPage.fillReturnDateTextBox(driver, "12/31/2015");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
