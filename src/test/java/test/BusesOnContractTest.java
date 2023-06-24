package test;

import org.testng.annotations.Test;

import page.BusesOnContractPage;
import utils.Excelutils;

public class BusesOnContractTest extends BaseClass{
	@Test
	public void test1() throws Exception {
	BusesOnContractPage bp=new BusesOnContractPage(driver);
	String xl="C:\\Users\\HP\\eclipse-workspace\\VrlbusMaven01\\src\\test\\resources\\excel\\vrlbus_datadriven.xlsx";
	String sheet="Busesoncontract";
	int lastrownum=Excelutils.getrowcount(xl, sheet);
	for(int i=1;i<=lastrownum;i++) {
		String Name=Excelutils.getcellvalue(xl, sheet,i, 0);
		String Emailid=Excelutils.getcellvalue(xl, sheet,i, 1);
		String mobileno=Excelutils.getcellvalue(xl, sheet,i, 2);
		String Tourcat=Excelutils.getcellvalue(xl, sheet,i, 3);
		String Fromcity=Excelutils.getcellvalue(xl, sheet,i, 4);
		String Tocity=Excelutils.getcellvalue(xl, sheet,i, 5);
		String Depdate=Excelutils.getcellvalue(xl, sheet,i, 6);
		String Arrivdate=Excelutils.getcellvalue(xl, sheet,i, 7);
		String journeyhr=Excelutils.getcellvalue(xl, sheet,i, 8);
		String journeymin=Excelutils.getcellvalue(xl, sheet,i, 9);
		String AMorPM=Excelutils.getcellvalue(xl, sheet,i, 10);
		String pickuppoint=Excelutils.getcellvalue(xl, sheet,i, 11);
		String bustype=Excelutils.getcellvalue(xl, sheet,i, 12);
		String Noofpassengers=Excelutils.getcellvalue(xl, sheet,i, 13);
		String Remark=Excelutils.getcellvalue(xl, sheet,i, 14);
	
		bp.busesonContractClick();
		bp.setcontactdetails(Name,Emailid,mobileno);
		bp.settraveldetails(Tourcat,Fromcity,Tocity);
		bp.setdatetime(Depdate,Arrivdate,journeyhr,journeymin,AMorPM);
		bp.setbustyprpassngrno(pickuppoint,bustype,Noofpassengers,Remark);
		bp.clicksubmit();
	}
	}
}

