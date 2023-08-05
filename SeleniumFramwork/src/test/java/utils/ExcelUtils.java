package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFSheet sheet;
	static XSSFWorkbook workbook;

	public static void main(String[] args) throws IOException {
		 getRowCount();
		getcellData(0, 0);
	}

	// create contractor
	public ExcelUtils(String excelpath, String sheetname) {
		try {
			// create reference for Workbook
			XSSFWorkbook workbook = new XSSFWorkbook(excelpath);

			// create reference for WorkSheet
			sheet = workbook.getSheet(sheetname);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int getRowCount() {

		int rowcount;
		rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows: " + rowcount);
		
		return rowcount;

	}

	public static int getColCount() {
		int colcount;
		colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("no of colums"+colcount);
		return colcount;
	}

	public static String getcellData(int rownum, int colnum) {

		String cellData;
		cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		//System.out.println(cellData);
		return cellData;
	}

	public void getCellDataNumeric(int rowNum, int colNUm) {
		double celldata = sheet.getRow(rowNum).getCell(colNUm).getNumericCellValue();
		//System.out.println(celldata);
	}
}
