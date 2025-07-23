package com.qspider.scripts;

import org.testng.annotations.Test;

import com.qspider.base.BaseTest;
import com.qspider.pom.EnterTimeTrackPage;
import com.qspider.pom.LoginPage;

public class VerifyBuildNumber extends BaseTest {
  @Test
  public void testVerifyBuildNumber() {
//Enter valid user name
    LoginPage l = new LoginPage(driver);
    l.setUserName("admin");
//Enter valid password 
    l.setPassword("manager");
//Click on login button 
    l.clickLoginButton();
    
    EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
//click on Help 
    e.clickHelp();
//click on About ActiTIME 
    e.clickAboutActiTime();
//Verify Build Number --> due to wrong build num TC fails
    e.verifyBuildNumber("(build 24252)");
//close About ActiTIME popup 
    e.clickClose();
//Click on logout link 
    e.clickLogoutLink();
  }
}
