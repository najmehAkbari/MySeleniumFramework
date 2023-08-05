package utils;
import utils.ExcelUtils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		
		ExcelUtils excel = new ExcelUtils("C:\\Users\\Najmeh\\eclipse-workspace\\SeleniumFramwork\\excel\\data.xlsx", "Sheet1");
	   excel.getRowCount();
	     excel.getcellData(0, 0);
	     excel.getCellDataNumeric(1, 1);
	
	}

}
