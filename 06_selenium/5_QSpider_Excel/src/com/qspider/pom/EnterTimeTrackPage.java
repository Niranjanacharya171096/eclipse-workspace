package com.qspider.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrackPage {
  @FindBy(id = "logoutLink")
  private WebElement logoutLink;
  @FindBy(xpath = "(//div[@class='popup_menu_icon'])[4]")
  private WebElement help;
  @FindBy(linkText = "About your actiTIME")
  private WebElement aboutActiTIME;
  @FindBy(xpath = "//span[contains(text(),'build')]")
  private WebElement buildNumber;
  @FindBy(id = "aboutPopupCloseButtonId")
  private WebElement close;

  public EnterTimeTrackPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }

  public void clickLogoutLink() {
    logoutLink.click();
  }

  public void clickHelp() {
    help.click();
  }

  public void clickAboutActiTime() {
    aboutActiTIME.click();
  }

  public void verifyBuildNumber(String eBuildNumber) {
    String aBuildNumber = buildNumber.getText();
    Assert.assertEquals(aBuildNumber, eBuildNumber);
  }

  public void clickClose() {
    close.click();
  }
}
