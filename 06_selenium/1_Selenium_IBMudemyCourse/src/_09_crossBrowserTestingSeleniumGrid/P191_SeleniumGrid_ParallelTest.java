package _09_crossBrowserTestingSeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P191_SeleniumGrid_ParallelTest {
	private WebDriver driver;
	private String baseUrl;
	private String nodeURL;

	P191_SearchPageFactory searchPage;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		baseUrl = "https://www.expedia.com/";
		nodeURL = "http://192.168.75.128:5555/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeURL), caps);

		searchPage = new P191_SearchPageFactory(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void searchFlights() throws Exception {
		searchPage.clickFlightsTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("San Francisco");
		searchPage.setDepartureDate("10/28/2015");
		searchPage.setReturnDate("10/31/2015");
	}

	@AfterClass
	public void tearDown() throws Exception {
		// driver.quit();
	}
}