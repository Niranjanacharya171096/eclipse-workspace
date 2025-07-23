package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	/* This method is used to initialize the thread local driver on the basis of given browser
	 * @ parameter browser
	 * @return this will return tlDriver.
	 * 
	 * 
	 */
	
	public WebDriver init_driver(String browser) {
		
		System.out.println("browser value is" + browser);
		if (browser.equals("chrome")) {
		//	WebDriverManager.chromedriver().setup();
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
			
		//	WebDriver tlDriver = new ChromeDriver();
				
			tlDriver.set(new ChromeDriver());
			}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
			}
		
		else if (browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			tlDriver.set(new InternetExplorerDriver());
			}
		
		else {
			System.out.println("Please correct the browser value:" + browser);
			
		}
		

		
		//getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return getDriver();
		
		
		
    }
	
	public static synchronized WebDriver getDriver() {
		
		return tlDriver.get();
	}

}
