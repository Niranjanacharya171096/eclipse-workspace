package utilities;

import java.io.IOException;
import java.util.Arrays;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;

import factory.DriverFactory;

public class DataProviders {
  static Logger logger;
  //DataProvider 1 for Login
  @DataProvider(name="LoginData")
  public String[][] getData() throws IOException {
    logger = DriverFactory.getLogger();

    logger.info("****** Data Provider *******");
    System.out.println("Data Provider");

    //get data from Excel
    String path = ".\\testData\\OpenCart_LoginData.xlsx"; //taking xl file data
    System.out.println("Excel path :: " + path);

    ExcelUtility xlutil = new ExcelUtility(path); //create an obj call constructor
    System.out.println("ExcelUtility :: "+xlutil);

    int totalRows = xlutil.getRowCount("Sheet1");
    int totalCols = xlutil.getCellCount("Sheet1", 1);

    System.out.println("Rows :: "+totalRows+" Columns :: "+totalCols);

    //created for two dimension array which can store the data user and password
    String loginData[][] = new String[totalRows][totalCols];
    for(int i=1; i<=totalRows; i++) { //1 //read the data from xl storing in two dimensional array
      for(int j=0; j<totalCols; j++) { //0 //i is rows j is col
        loginData[i-1][j] = xlutil.getCellData("Sheet1", i, j); //1, 0
        System.out.print("|"+loginData[i-1][j]+"|");
      }
      System.out.println();
    }

    for (String[] dataArr : loginData) {
      System.out.println(Arrays.toString(dataArr));
    }

    return loginData; //returns 2D array
  }
  //DataProvider 2, 3, 4,..., n for other test cases
}
