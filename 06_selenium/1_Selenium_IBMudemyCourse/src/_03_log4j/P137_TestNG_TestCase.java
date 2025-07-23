package _03_log4j;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P137_TestNG_TestCase {
	private WebDriver driver;

	private String baseUrl;
	private static final Logger log = LogManager.getLogger(P137_TestNG_TestCase.class.getName());

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "/Users/atomar/Documents/workspace_personal/libs/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void testMethod() throws Exception {
		log.info("This message is from test method");
	}

	@AfterClass
	public void afterClass() {
	}
}