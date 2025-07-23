package com.qspider.scripts;

import org.testng.annotations.Test;

import com.qspider.base.BaseTest;
import com.qspider.pom.EnterTimeTrackPage;
import com.qspider.pom.LoginPage;

public class ValidLogin extends BaseTest {
  @Test
  public void testValidLogin() {
    //Enter valid user name
    LoginPage l = new LoginPage(driver);
    l.setUserName("admin");
    //Enter valid password
    l.setPassword("manager");
    //Click on login button
    l.clickLoginButton();
    //Click on logout link
    EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
    e.clickLogoutLink();
  }
}
