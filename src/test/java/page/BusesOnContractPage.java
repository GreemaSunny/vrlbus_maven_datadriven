package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BusesOnContractPage {

WebDriver driver;	
By busesOnContractlink=By.xpath("//div[@id='demo']/section/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/nav/ul/li[4]/a");
By contactName=By.id("txtcontactPerson");
By emailid=By.id("txtEmail");
By mobileno=By.id("txtMobileNo");
By tourcategory=By.id("TourCategory");
By fromcity=By.id("txtFromCity");
By tocity=By.id("txtToCity");
By departuredate=By.id("txtFromDate");
By arrivaldate=By.id("txtToDate");
By journeytimeH=By.id("txtPickupHour");
By journeytimeM=By.id("txtPickMinute");
By journeytimeR=By.id("txtPickTimeRange");
By pickuppoint=By.id("txtPickup");
By bustype=By.id("BusType");
By passengerno=By.id("txtnoOfPassenger");
By remarks=By.id("txtremarks");
By captcha=By.id("txtcaptcha");
By submit=By.xpath("//*[@id='wrapper']/div/div/div[2]/div[3]/div[3]/input");




	public BusesOnContractPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void busesonContractClick() throws Exception {
		Thread.sleep(3000);
		driver.findElement(busesOnContractlink).click();
	}
	
	public void setcontactdetails(String Name,String email,String mobilenum) {
		driver.findElement(contactName).sendKeys(Name);
		driver.findElement(emailid).sendKeys(email);
		driver.findElement(mobileno).sendKeys(mobilenum);
	}
	
	public void settraveldetails(String tourcateg,String frmcity,String tcity) throws InterruptedException {
		
		WebElement tcat=driver.findElement(tourcategory);
		tcat.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
		tcat.sendKeys(tourcateg);
		Actions actions=new Actions(driver);
		actions.keyDown(tcat,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN);
		actions.keyDown(tcat,Keys.ENTER).keyUp(Keys.ENTER);
		actions.perform();
		Thread.sleep(3000);
	
		driver.findElement(fromcity).sendKeys(frmcity);
		driver.findElement(tocity).sendKeys(tcity);
		
	}
		public void setdatetime(String departdate,String arrivldate,String jtimehr,String jtimemin,String jtimerang) throws Exception {
			
			WebElement depdate=driver.findElement(departuredate);
			depdate.sendKeys(departdate);
			
			
			Thread.sleep(3000);
			
			WebElement arrivldte=driver.findElement(arrivaldate);
			arrivldte.click();
			arrivldte.sendKeys(arrivldate);
	
			try {
			WebElement timehr=driver.findElement(journeytimeH);
			timehr.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
			timehr.sendKeys(jtimehr);
			Actions actions=new Actions(driver);
			actions.keyDown(timehr,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN);
			actions.keyDown(timehr,Keys.ENTER).keyUp(Keys.ENTER);
			actions.perform();
			
			
			WebElement timemin=driver.findElement(journeytimeM);
			timemin.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
			timemin.sendKeys(jtimemin);
			actions.keyDown(timemin,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN);
			actions.keyDown(timemin,Keys.ENTER).keyUp(Keys.ENTER);
			actions.perform();
			
			
			WebElement timerang=driver.findElement(journeytimeR);
			timerang.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
			timerang.sendKeys(jtimerang);
			actions.keyDown(timerang,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN);
			actions.keyDown(timerang,Keys.ENTER).keyUp(Keys.ENTER);
			actions.perform();
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void setbustyprpassngrno(String pickup,String bustyp,String passngrno,String remark) throws Exception {
			
		
		driver.findElement(pickuppoint).sendKeys(pickup);
		
		WebElement btype=driver.findElement(bustype);
		btype.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
		btype.sendKeys(bustyp);
		Actions actions=new Actions(driver);
		actions.keyDown(btype,Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN);
		actions.keyDown(btype,Keys.ENTER).keyUp(Keys.ENTER);
		actions.perform();
		
		driver.findElement(passengerno).sendKeys(passngrno);
		driver.findElement(remarks).sendKeys(remark);
		driver.findElement(captcha);
		Thread.sleep(30000);		
	}
	public void clicksubmit() {
		driver.findElement(submit).click();
	}
}
