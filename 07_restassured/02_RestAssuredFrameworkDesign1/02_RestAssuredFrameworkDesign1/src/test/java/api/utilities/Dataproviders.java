//using Excel 
package api.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataproviders {
  @DataProvider(name = "AllData")
  public String[][] getAllData() throws Exception {
    String xlPath = System.getProperty("user.dir") + "//testData//UsersData.xlsx";
    ExcelUtility xl = new ExcelUtility(xlPath);

    int noOfRows = xl.getRowCount("Sheet1");
    int noOfColumns = xl.getCellCount("Sheet1", 1);

    String[][] testData = new String[noOfRows][noOfColumns];
    for (int i = 1; i <= noOfRows; i++) {
      for (int j = 0; j < noOfColumns; j++) {
        testData[i-1][j] = xl.getCellData("Sheet1", i, j);
      }
    }
    return testData;
  }

  @DataProvider(name = "UserNames")
  public String[] getUserNames() throws Exception {
    String xlPath = System.getProperty("user.dir") + "//testData//UsersData.xlsx";
    ExcelUtility xl = new ExcelUtility(xlPath);

    int noOfRows = xl.getRowCount("Sheet1");

    String[] usernameData = new String[noOfRows];
    for (int i = 1; i <= noOfRows; i++) {
      usernameData[i-1] = xl.getCellData("Sheet1", i, 1);
    }
    return usernameData;
  }
}
