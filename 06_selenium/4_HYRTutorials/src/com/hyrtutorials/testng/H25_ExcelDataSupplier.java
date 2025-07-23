package com.hyrtutorials.testng;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class H25_ExcelDataSupplier {
  @DataProvider(name="loginData")
  public String[][] getData() throws Exception {
    File excelFile = new File("./Excel/test.xlsx");
    FileInputStream fis = new FileInputStream(excelFile);
    //    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    //    XSSFSheet sheet = workbook.getSheet("Sheet1");
    Workbook  workbook = WorkbookFactory.create(fis);
    Sheet sheet = workbook.getSheet("Sheet1");

    int totalRows = sheet.getLastRowNum(); //3 // counts in between empty rows
    //sheet.getPhysicalNumberOfRows(); //4 // ignores in between empty rows
    int totalCols = sheet.getRow(0).getLastCellNum();
    System.out.println("Rows :: "+totalRows+" Columns :: "+totalCols);

    //DataProvider
    String[][] data = new String[totalRows][totalCols];
    for (int i = 0; i < totalRows; i++) {
      for (int j = 0; j < totalCols; j++) {
        DataFormatter df = new DataFormatter();
        data[i][j] =  df.formatCellValue(sheet.getRow(i+1).getCell(j)); //converts to Text
      }
    }
    workbook.close();
    fis.close();

    for (String[] dataArr : data) {
      System.out.println(Arrays.toString(dataArr));
    }
    return data;
  }
}
