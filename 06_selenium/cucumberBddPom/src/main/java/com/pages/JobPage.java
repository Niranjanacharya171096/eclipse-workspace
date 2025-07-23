package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

public class JobPage {
	
	private WebDriver driver;
	
	//1. By locators 
	
	private By Chaitime = By.xpath("//a[contains(text(),'Chai-time')]");
	
	
	//2  Constructors of the page class
	
	public JobPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	



	

public void ClickOnChaiTime() {
	
	driver.findElement(Chaitime).click();
	
	
}





	
	
	

}
