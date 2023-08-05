package utils;

public class ExcelDataProvider {

	public static void main(String[] args) {
		testData("C:\\Users\\Najmeh\\eclipse-workspace\\SeleniumFramwork\\excel\\data.xlsx", "Sheet1");

	}
	public static void testData(String excelpath, String sheetname) {
		ExcelUtils excel = new ExcelUtils(excelpath, sheetname);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; i++) {
				String celldata = excel.getcellData(i, j);
				System.out.print(celldata +  "|");
			}
System.out.println();
		}
	}

}
