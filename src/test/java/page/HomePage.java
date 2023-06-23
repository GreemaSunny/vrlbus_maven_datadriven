package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
WebDriver driver;
    By closeadd=By.xpath("//button[@class='btn-close']");
    By home=By.xpath("//a[@class='homeicon']");
	By sourcep=By.id("FromCity");
	By destinationp=By.id("ToCity");
	By departure=By.id("txtFromDate");
	By searchbutton=By.xpath("//button[@class='searchbtn']");
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
		public void setValues(String source,String destination) {
			driver.findElement(sourcep).sendKeys(source,Keys.ENTER);
			driver.findElement(destinationp).sendKeys(destination,Keys.ENTER);
			
		}
		public void clodeadv() throws Exception {
			Thread.sleep(3000);
			try {
			driver.findElement(closeadd).click();
			}catch(Exception e) {
				System.out.println("error"+e.getMessage());
			}
		}
		public void homeclick() throws Exception {
			Thread.sleep(3000);
			driver.findElement(home).click();
		}
		public void datepick(String date) {
			WebElement selectdept=driver.findElement(departure);
			selectdept.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
			selectdept.sendKeys(date);
			Actions actions=new Actions(driver);
			actions.moveToElement(selectdept).perform();
		}
		
		public void searchclick() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(searchbutton).click();
		}
	}
	
	
	
	
	
	
	
	
	
	

