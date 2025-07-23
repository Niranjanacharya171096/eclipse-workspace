package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static List<String> readData(String filePath, String sheetName) throws IOException {
		List<String> companies = new ArrayList<>();
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		for (Row row : sheet) {
			companies.add(row.getCell(0).getStringCellValue());
		}

		workbook.close();
		fis.close();
		return companies;
	}

	public static void writeData(String filePath, String sheetName, List<String[]> data) throws IOException {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet(sheetName);

		int rowCount = 0;
		for (String[] rowData : data) {
			Row row = sheet.createRow(rowCount++);
			for (int i = 0; i < rowData.length; i++) {
				row.createCell(i).setCellValue(rowData[i]);
			}
		}

		FileOutputStream fos = new FileOutputStream(filePath);
		workbook.write(fos);
		fos.close();
		workbook.close();
	}
}
