package com.qspider.scripts;

import org.testng.annotations.Test;

import com.qspider.base.BaseTest;
import com.qspider.pom.LoginPage;

public class InvalidLogin extends BaseTest {
  @Test
  public void testInvalidLogin() {
//Enter invalid user name 
    LoginPage l = new LoginPage(driver);
    l.setUserName("abc");
//Enter invalid password 
    l.setPassword("xyz");
//Click on login button 
    l.clickLoginButton();
//Verify Error Message 
    l.verifyErrMsg();
  }
}
