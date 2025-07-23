package com.qspider.scripts;

import org.testng.annotations.Test;

import com.qspider.generics.ExcelUtility;

public class InvalidLoginExcel extends BaseTest {
  @Test
  public void testInvalidLogin() throws InterruptedException {
    String xlpath = "./testdata/TDR.xlsx";
    String sheet = "InvalidLogin";

    int rc = ExcelUtility.getRowCount(sheet);
    System.out.println("getRowCount :: "+rc);

    for (int i = 1; i <= rc; i++) {
      String un = ExcelUtility.getCellData(sheet, i, 0);
      String pw = ExcelUtility.getCellData(sheet, i, 1);
      System.out.println(un + " " + pw);

      //      LoginPage l = new LoginPage(driver);
      //      l.setUserName(un);
      //      l.setPassword(pw);
      //      l.clickLoginButton();
      //      Thread.sleep(1000);
      //      l.verifyErrMsg();
    }
  }
}
