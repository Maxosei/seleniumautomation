package learningSession1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataSheet {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataSheet(String excelPath) {
		File file = new File(excelPath);
		try {
			FileInputStream fis = new FileInputStream(file);
			try {
				wb = new XSSFWorkbook(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
			
	}
	
	public String getData(int sheetnumber, int row , int column) {
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	public int getRowCount(int sheetIndex) {
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
		
	}
}
