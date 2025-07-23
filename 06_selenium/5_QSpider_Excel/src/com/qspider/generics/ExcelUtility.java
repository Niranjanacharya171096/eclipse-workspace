package com.qspider.generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
  static FileInputStream fis;
  static Workbook workbook;
  String xlpath;

  public ExcelUtility(String xlpath) throws EncryptedDocumentException, IOException{
    this.xlpath=xlpath;

    fis = new FileInputStream(xlpath);
    workbook = WorkbookFactory.create(fis);
    fis.close(); // Close stream after loading workbook
    //or
    //    try (FileInputStream fis = new FileInputStream(xlpath)) {
    //      this.fis = fis;  // Optionally store it as a field if you need it elsewhere
    //      this.workbook = WorkbookFactory.create(fis);
    //    }
  }

  public static int getRowCount(String sheet) {
    int rc = 0;
    rc = workbook.getSheet(sheet).getLastRowNum();
    return rc;
  }

  public static String getCellData(String sheet, int row, int cell) {
    String cellValue = "";
    cellValue = workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
    return cellValue;
  }
}
