package com.hyrtutorials.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class H20_CreateWriteReadExcel {
  public static void main(String[] args) throws IOException {
    //Create
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet1 = workbook.createSheet("Niranjan");
    //    XSSFSheet sheet2 = workbook.createSheet("Sayeed");
    //Write
    sheet1.createRow(0);
    sheet1.getRow(0).createCell(0).setCellValue("Name");
    sheet1.getRow(0).createCell(1).setCellValue("Number");
    sheet1.getRow(0).createCell(2).setCellValue("Email");
    sheet1.getRow(0).createCell(3).setCellValue("Active");

    sheet1.createRow(1);
    sheet1.getRow(1).createCell(0).setCellValue("Niranjan");
    sheet1.getRow(1).createCell(1).setCellValue("8073357023");
    sheet1.getRow(1).createCell(2).setCellValue("niranjan@gmail.com");
    sheet1.getRow(1).createCell(3).setCellValue(true);

    //    sheet2.createRow(0);
    //    sheet2.getRow(0).createCell(0).setCellValue("Name");
    //    sheet2.getRow(0).createCell(1).setCellValue("Number");
    //    sheet2.getRow(0).createCell(2).setCellValue("email");

    sheet1.createRow(2);
    sheet1.getRow(2).createCell(0).setCellValue("Sayeed");
    sheet1.getRow(2).createCell(1).setCellValue("9916044351");
    sheet1.getRow(2).createCell(2).setCellValue("sayeed@gmail.com");
    sheet1.getRow(2).createCell(3).setCellValue(false);

    //Save
    File file = new File("E:\\eclipse-workspace\\06_selenium\\4_HYRTutorials_ExcelSheet\\ExcelFolder\\Test2.xlsx");

    FileOutputStream fos = new FileOutputStream(file);
    workbook.write(fos);
    workbook.close();
    fos.close();

    //Read
    FileInputStream fis = new FileInputStream(file);
    workbook = new XSSFWorkbook(fis);
    sheet1 = workbook.getSheet("Niranjan");
    //    sheet2 = workbook.getSheetAt(1);

    //get data using static index
    String cellvalue1 = sheet1.getRow(1).getCell(0).getStringCellValue();
    System.out.println(cellvalue1);
    //    String cellvalue2 = sheet2.getRow(1).getCell(0).getStringCellValue();
    //    System.out.println(cellvalue2);

    //get all data using dynamic index
    System.out.println("FOR LOOP");
    int rowCount = sheet1.getPhysicalNumberOfRows();
    for(int i = 0; i < rowCount; i++) {
      XSSFRow row = sheet1.getRow(i);
      int cellCount = row.getPhysicalNumberOfCells();
      for (int j = 0; j < cellCount; j++) {
        XSSFCell cell = row.getCell(j);
        String cellValue = getCellValue(cell);
        System.out.print("||"+cellValue);
      }
      System.out.println();
    }
    // Loop through each row in the sheet
    System.out.println("\nFOR EACH");
    for (Row row : sheet1) {
      // Loop through each cell in the row
      for (Cell cell : row) {
        // Get the cell value and print it
        System.out.print(cell.toString() + "\t");
      }
      System.out.println();
    }
    workbook.close();
    fis.close();
  }

  public static String getCellValue(XSSFCell cell) {
    switch (cell.getCellType()) {
    case NUMERIC:
      return String.valueOf(cell.getNumericCellValue());
    case BOOLEAN:
      return String.valueOf(cell.getBooleanCellValue());
    case STRING:
      return String.valueOf(cell.getStringCellValue());
    default:
      return String.valueOf(cell.getStringCellValue());
    }
  }
}
