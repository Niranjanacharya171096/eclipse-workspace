package com.qa.test;

import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.utilities.ExcelDataSupplier;

public class InvalidLogin extends BaseTest {
  @Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupplier.class)
  public void testInvalidLogin(String Username, String Password) throws Exception{
    //Enter invalid user name
    LoginPage l = new LoginPage(driver);

    l.setUserName(Username);
    //Enter invalid password
    l.setPassword(Password);
    System.out.println(Username+" :::::::::: "+Password);
    //Click on login button
    l.clickLoginButton();
    //Verify Error Message
    l.verifyErrMsg();
    extentTest.pass("Assertion is failed for webpage title");
  }
}

