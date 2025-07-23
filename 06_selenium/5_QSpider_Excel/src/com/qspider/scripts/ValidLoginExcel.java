package com.qspider.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.qspider.generics.ExcelUtility;

public class ValidLoginExcel extends BaseTest {
  @Test
  public void testValidLogin() throws EncryptedDocumentException, IOException, InterruptedException {
    String xlpath = "./testdata/TDR.xlsx"; //DOT->current path of Java Project
    String sheet = "ValidLogin";

    ExcelUtility xlutil = new ExcelUtility(xlpath);

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
      //
      //      EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
      //      e.clickLogoutLink();
    }
  }
}