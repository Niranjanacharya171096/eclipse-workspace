package com.qspider.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Q23_ReadExcel {
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
// Provide the path to your Excel file
    String excelFilePath = "E:\\Software Files\\eclipse-workspace\\06_selenium\\4_HYRTutorials_ExcelSheet\\ExcelFolder\\Test2.xlsx";

// Open the Excel file using FileInputStream
    FileInputStream fis = new FileInputStream(new File(excelFilePath));

    Workbook workbook = WorkbookFactory.create(fis);
    Cell cellValue = workbook.getSheet("Niranjan").getRow(0).getCell(2);
    System.out.println(cellValue);
    // Sheet s = wb.getSheet("Sheet1");
    // Row r = s.getRow(0);
    // Cell c = r.getCell(0);
    // String v = c.toString();
    // System.out.println(v);
    int rc = workbook.getSheet("Niranjan").getLastRowNum();
    System.out.println(rc);
    int cc = workbook.getSheet("Niranjan").getRow(0).getLastCellNum();
    System.out.println(cc);

    for (int i = 0; i <= rc; i++) {
      for (int j = 0; j <= cc; j++) {
        Cell c = workbook.getSheet("Niranjan").getRow(i).getCell(j);
        System.out.println(c + " ");
      }
      System.out.println();
    }

// Close the workbook and FileInputStream
    workbook.close();
    fis.close();
  }
}