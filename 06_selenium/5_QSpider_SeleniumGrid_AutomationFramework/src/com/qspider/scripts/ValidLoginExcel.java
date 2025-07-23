package com.qspider.scripts;

import org.testng.annotations.Test;

import com.qspider.generics.Excel;
import com.qspider.pom.EnterTimeTrackPage;
import com.qspider.pom.LoginPage;

public class ValidLoginExcel extends BaseTest {
  @Test
  public void testValidLogin() {
    String xlpath = "./testdata/TDR.xlsx";
//DOT->current path of Java Project 
    String sheet = "ValidLogin";
    
    String un = Excel.getCellData(xlpath, sheet, 1, 0);
    System.out.println(un);
    String pw = Excel.getCellData(xlpath, sheet, 1, 1);
    System.out.println(pw);
    
    LoginPage l = new LoginPage(driver);
    l.setUserName(un);
    l.setPassword(pw);
    l.clickLoginButton();
    
    EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
    e.clickLogoutLink();
  }
}
