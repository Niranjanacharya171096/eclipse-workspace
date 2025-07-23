package hooks;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;



public class Hooks {

	WebDriver driver;
	Properties p;
	
	@Before
	public void setup() throws IOException
	{
	driver=Base.initilizeBrowser();
	p=Base.getProperties();
	driver.get(p.getProperty("appURL"));
	driver.manage().window().maximize();
	}
	
	@After
	public void teardown(Scenario scenario)
	{
	 
	 if(scenario.isFailed())
	 {
		 byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		 Allure.addAttachment("Failure Screenshot", new ByteArrayInputStream(screenshot));
	 }
	 driver.quit();
	}
}
