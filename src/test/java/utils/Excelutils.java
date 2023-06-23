package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelutils {
public static String getcellvalue(String xl,String sheet,int row,int column)  {
	try {
	FileInputStream fi=new FileInputStream(xl);
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFCell cell=wb.getSheet(sheet).getRow(row).getCell(column);
	if(cell.getCellType()==CellType.STRING) {
		return cell.getStringCellValue();
	}else {
		return cell.getRawValue();
	}
	}catch(Exception e) {
		return "error";	
	}
}
public static int getrowcount(String xl, String sheet) {
	try {
		FileInputStream fi=new FileInputStream(xl);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		return wb.getSheet(sheet).getLastRowNum();
	}catch(Exception e) {
		return 0;
	}
}
}
