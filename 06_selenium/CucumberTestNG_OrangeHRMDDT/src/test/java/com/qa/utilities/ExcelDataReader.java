package com.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataReader {
  //  public static HashMap<String, String> storeValues = new HashMap();
  //
  //  public static List<HashMap<String, String>> excelDataReader (String filepath, String sheetName) throws IOException {
  //
  //    FileInputStream file = new FileInputStream(filepath);
  //
  //    XSSFWorkbook workbook = new XSSFWorkbook(file);
  //    XSSFSheet sheet = workbook.getSheet(sheetName);
  //
  //    int totalRows = sheet.getLastRowNum();
  //
  //    XSSFRow headerRow = sheet.getRow(0);
  //
  //    List<HashMap<String, String>> excelData = new ArrayList<>();
  //
  //    for (int i = 1; i <= totalRows; i++) {
  //      XSSFRow currentRow = sheet.getRow(i);
  //
  //      HashMap<String, String> currentHash = new HashMap<String, String>();
  //
  //      for (int j = 0; j < currentRow.getLastCellNum(); j++) {
  //        XSSFCell currentCell = currentRow.getCell(j);
  //        currentHash.put(headerRow.getCell(j).toString(), currentCell.toString());
  //      }
  //      excelData.add(currentHash);
  //    }
  //
  //    file.close();
  //
  //    return excelData;
  //  }
  public static String[][] excelDataReader (String filepath, String sheetName) throws IOException {
    FileInputStream fis = new FileInputStream(filepath);

    //    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    //    XSSFSheet sheet = workbook.getSheet(sheetName);
    //    Workbook  workbook = new XSSFWorkbook(fis);
    Workbook  workbook = WorkbookFactory.create(fis);
    Sheet sheet = workbook.getSheet("Sheet1");

    int totalRows = sheet.getLastRowNum();
    int totalCols = sheet.getRow(0).getLastCellNum();

    System.out.println("Rows :: "+totalRows+" Columns :: "+totalCols);

    //created for two dimension array which can store the data user and password
    String loginData[][] = new String[totalRows][totalCols];
    for(int i=0; i<totalRows; i++) { //1 //read the data from xl storing in two dimensional array
      for(int j=0; j<totalCols; j++) { //0 //i is rows j is col
        DataFormatter df = new DataFormatter();
        loginData[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
        System.out.print("|"+loginData[i][j]+"|");
      }
      System.out.println();
    }
    workbook.close();
    fis.close();

    for (String[] dataArr : loginData) {
      System.out.println(Arrays.toString(dataArr));
    }

    return loginData; //returns 2D array
  }
}
