package api.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
  public FileInputStream fis;
  public FileOutputStream fos;
  
  public XSSFWorkbook workbook;
  public XSSFSheet sheet;
  public XSSFRow row;
  public XSSFCell cell;
  public CellStyle style;
  String xlpath;
  
  public ExcelUtility(String xlpath) {
    this.xlpath = xlpath;
  }
  
  public int getRowCount(String sheetName) {
    int rowCount = 0;
    try {
      fis = new FileInputStream(xlpath);
      workbook = new XSSFWorkbook(fis);
      sheet = workbook.getSheet(sheetName);
      rowCount = sheet.getLastRowNum();
      
      workbook.close();
      fis.close();
    } catch (Exception e) {
      System.out.println(e);
    }
    return rowCount;
  }


  public int getCellCount(String sheetName, int rowNum) {
    int cellCount = 0;
    try {
      fis = new FileInputStream(xlpath);
      workbook = new XSSFWorkbook(fis);
      sheet = workbook.getSheet(sheetName);
      row = sheet.getRow(rowNum);
      cellCount = row.getLastCellNum();
      
      workbook.close();
      fis.close();
    } catch (Exception e) {
      System.out.println(e);
    }
    return cellCount;
  }
  
  public String getCellData(String sheetName, int rowNum, int colNum) {
    String cellValue = "";
    try {
      fis = new FileInputStream(xlpath);
      workbook = new XSSFWorkbook(fis);
      sheet = workbook.getSheet(sheetName);
      row = sheet.getRow(rowNum);
      cell = row.getCell(colNum);
      
      DataFormatter formatter = new DataFormatter();
      cellValue = formatter.formatCellValue(cell);

      workbook.close();
      fis.close();
    } catch (Exception e) {
      System.out.println(e);
    }
    return cellValue;
  }
}
