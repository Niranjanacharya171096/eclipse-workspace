package _18_log4jObsolete;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P280_UsingLog4j {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = LogManager.getLogger(P280_UsingLog4j.class);

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PropertyConfigurator.configure("log4j.properties");
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		P280_SearchPage.navigateToFlightsTab(driver);
		// log.info("Navigate to flights tab");
		P280_SearchPage.fillOriginTextBox(driver, "New York");
		// log.info("Enter origin city");
		P280_SearchPage.fillDestinationTextBox(driver, "Chicago");
		// log.info("Enter destination city");
		P280_SearchPage.departureDateTextBox(driver).sendKeys("12/25/2014");
		// log.info("Enter departure date");
		P280_SearchPage.returnDateTextBox(driver).sendKeys("12/31/2014");
		// log.info("Enter return date");
	}

	@After
	public void tearDown() throws Exception {
	}
}
