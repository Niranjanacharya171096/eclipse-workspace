package _19_testNGObsolete;

import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// http://docs.oracle.com/javase/tutorial/essential/concurrency/ - Multi-Threading Tutorial
public class P292_TestNG_MultiThreading {
	private WebDriver driver;

	private String baseUrl;
	static Logger log = LogManager.getLogger(P292_TestNG_MultiThreading.class);

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		PropertyConfigurator.configure("log4j.properties");
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void testMethod() throws Exception {
		String title = "Expedia Travel: Vacations, Cheap Flights, Airline Tickets & Airfares";
		log.info("[START] Thread Id : " + Thread.currentThread().getId() + " is started!");
		driver.get(baseUrl);
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals(title, driver.getTitle());
		log.info("[END] Thread Id : " + Thread.currentThread().getId() + " is ended");
	}

	@AfterMethod
	public void afterMethod() {
	}

}
