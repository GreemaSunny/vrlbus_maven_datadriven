package test;

import org.testng.annotations.Test;

import page.BusesOnContractPage;

public class BusesOnContractTest extends BaseClass{
	@Test
	public void test1() throws Exception {
	BusesOnContractPage bp=new BusesOnContractPage(driver);
		bp.busesonContractClick();
		bp.setcontactdetails("Greema","greema@gmail.com","9074441004");
		bp.settraveldetails("Pilgrim Tour","Hyderabad","Bangalore");
		bp.setdatetime("28-06-2023","24-08-2023","06","30","AM");
		bp.setbustyprpassngrno("Abids, Hyderabad","A/C-SLEEPER(32) - 32 Seats","5","on time");
		bp.clicksubmit();
	}
}

