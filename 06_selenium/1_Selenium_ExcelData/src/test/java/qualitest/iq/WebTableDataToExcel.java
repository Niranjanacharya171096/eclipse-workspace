package qualitest.iq;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableDataToExcel {
  public static void main(String[] args) throws IOException {
    // Step 1: Setup WebDriver
    //    System.setProperty("", "");
    WebDriver driver = new EdgeDriver();
    driver.get("https://cosmocode.io/automation-practice-webtable/");
    driver.manage().window().maximize();

    // Step 2: Locate the table
    WebElement table = driver.findElement(By.xpath("//table[@id='countries']")); // Replace with actual table ID

    // Step 3: Extract rows (excluding header)
    List<WebElement> rows = table.findElements(By.xpath("//tbody/tr"));

    // Step 4: Store data in a List
    List<String[]> tableData = new ArrayList<>();

    for (WebElement row : rows) {
      List<WebElement> cells = row.findElements(By.tagName("td"));
      if (cells.size() >= 5) {
        String[] rowData = new String[5];
        rowData[0] = cells.get(0).getText(); // Visited
        rowData[1] = cells.get(1).getText(); // Country
        rowData[2] = cells.get(2).getText(); // Capital
        rowData[3] = cells.get(3).getText(); // Currency
        rowData[4] = cells.get(4).getText(); // Language
        tableData.add(rowData);

        //or
        //      String country = cells.get(0).getText().trim();
        //      String capital = cells.get(1).getText().trim();
        //      String currency = cells.get(2).getText().trim();
        //      String language = cells.get(3).getText().trim();
        //
        //      tableData.add(new String[]{country, capital, currency, language});
      }
    }
    // Close browser
    driver.quit();

    // Write to Excel
    writeToExcel(tableData, "CountriesData.xlsx");
  }

  public static void writeToExcel(List<String[]> tableData, String fileName) throws IOException {

    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("Country Data");

    // Add header
    //    tableData.add(new String[]{"Visited", "Country", "Capital", "Currency", "Primary Language"}); // Header row
    //or
    //    Row headerRow = sheet.createRow(0);
    //    String[] headers = {"visited", "Country", "Capital", "Currency", "Language"};
    //    for (int i = 1; i < headers.length; i++) {
    //      Cell cell = headerRow.createCell(i);
    //      cell.setCellValue(headers[i]);
    //    }

    // Add table data
    int rowIndex = 0;
    for (String[] dataRow : tableData) {
      Row row = sheet.createRow(rowIndex++);
      for (int i = 0; i < dataRow.length; i++) {
        row.createCell(i).setCellValue(dataRow[i]);
      }
    }
    //for (int i = 0; i < data.size(); i++) {
    //Row row = sheet.createRow(i);
    //String[] rowData = data.get(i);
    //for (int j = 0; j < rowData.length; j++) {
    //    Cell cell = row.createCell(j);
    //    cell.setCellValue(rowData[j]);
    //}
    //}

    ////Autosize columns
    //for (int i = 0; i < data.get(0).length; i++) {
    //sheet.autoSizeColumn(i);
    //}

    // Write to file
    try (FileOutputStream fos = new FileOutputStream("CountryData.xlsx")) {
      workbook.write(fos);
    }

    // Clean up
    workbook.close();

    System.out.println("Excel file 'CountryData.xlsx' created successfully!");
    System.out.println("Data written to Excel file: " + fileName);
  }
}