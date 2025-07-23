package pages;
//P46_PageFactoryModel_Test is a main program

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class P46_Login {
  WebDriver driver;

  @FindBy(name = "username")
  WebElement username;
  @FindBy(name = "password")
  WebElement password;
  @FindBy(xpath = "//button[text()=' Login ']")
  WebElement login;

  public P46_Login(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void onClickUsername() {
    Assert.fail();
    username.sendKeys("Admin");
  }
  public void onClickPassword() {
    password.sendKeys("admin123");
  }
  public void onClickLogin() {
    login.click();
  }
}
