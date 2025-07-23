package com.qspider.scripts;

import org.testng.annotations.Test;

import com.qspider.generics.Excel;
import com.qspider.pom.LoginPage;

public class InvalidLoginExcel extends BaseTest {
  @Test
  public void testInvalidLogin() throws InterruptedException {
    String xlpath = "./testdata/TDR.xlsx";
    String sheet = "InvalidLogin";
    
    int rc = Excel.getRowCount(xlpath, sheet);
    System.out.println(rc);
    
    for (int i = 1; i <= rc; i++) {
      String un = Excel.getCellData(xlpath, sheet, i, 0);
      String pw = Excel.getCellData(xlpath, sheet, i, 1);
      System.out.println(un + " " + pw);
      
      LoginPage l = new LoginPage(driver);
      l.setUserName(un);
      l.setPassword(pw);
      l.clickLoginButton();
      Thread.sleep(1000);
      l.verifyErrMsg();
    }
  }
}
