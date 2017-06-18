package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig 
{

	public static XSSFWorkbook wb =null;
	public static XSSFSheet sh =null;
	public static void setWorkBookAndSheet(String WorkbookName, String SheetName) 
	{
		File file = new File(System.getProperty("user.dir")+"/Resources/"+WorkbookName+".xlsx");
		FileInputStream fis =null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) 
		{
			PrintUtils.logError(e.getMessage());
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			PrintUtils.logError(e.getMessage());
		}
		sh=wb.getSheet(SheetName);
	}
	
	public static int getRowCount()
	{
		int count =sh.getLastRowNum();
		return count;
	}

	public static String readStringData(int rownum, int cellnum)
	{
		String value= sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
	}
	
	public static double readNumericData(int rownum, int cellnum)
	{
		double value= sh.getRow(rownum).getCell(cellnum).getNumericCellValue();
		return value;
	}
}
