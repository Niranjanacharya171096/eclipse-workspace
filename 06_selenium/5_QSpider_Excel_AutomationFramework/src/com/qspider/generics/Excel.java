package com.qspider.generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
  public static String getCellData(String xlpath, String sheet, int row, int cell) {
    String cellValue = "";
    try {
      FileInputStream fis = new FileInputStream(xlpath);
      Workbook workbook = WorkbookFactory.create(fis);
      cellValue = workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
    } catch (Exception e) {
      System.out.println(e);
    }
    return cellValue;
  }

  public static int getRowCount(String xlpath, String sheet) {
    int rc = 0;
    try {
      FileInputStream fis = new FileInputStream(xlpath);
      Workbook workbook = WorkbookFactory.create(fis);
      rc = workbook.getSheet(sheet).getLastRowNum();
    } catch (Exception e) {
      System.out.println(e);
    }
    return rc;
  }
}
