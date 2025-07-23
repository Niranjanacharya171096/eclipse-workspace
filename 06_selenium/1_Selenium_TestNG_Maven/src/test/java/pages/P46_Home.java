package pages;
//P46_PageFactoryModel_Test is a main program 

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P46_Home {
  WebDriver driver;
  
  @FindBy(xpath = "//a[@class='oxd-brand']")
  WebElement orangehrm;
  
  public P46_Home(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
  
  public void onClickOrangeHRMLink() {
    orangehrm.click();
  }
}
