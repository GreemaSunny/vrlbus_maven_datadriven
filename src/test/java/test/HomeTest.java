package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import page.HomePage;
import utils.Excelutils;

public class HomeTest extends BaseClass {

@Test
public void test1() throws Exception {
	
	HomePage ob=new HomePage(driver);
	String xl="C:\\Users\\HP\\eclipse-workspace\\VrlbusMaven01\\src\\test\\resources\\excel\\vrlbus_datadriven.xlsx";
	String sheet="Home";
	int lastrowno=Excelutils.getrowcount(xl, sheet);
	for(int i=1;i<=lastrowno;i++) {
		
		String source=Excelutils.getcellvalue(xl, sheet, i, 0);
		String destination=Excelutils.getcellvalue(xl, sheet, i, 1);
		String date=Excelutils.getcellvalue(xl, sheet, i, 2);
		
	ob.setValues(source,destination);
	ob.datepick(date);
	ob.searchclick();
	ob.homeclick();
	ob.clodeadv();
    }

}	
}
