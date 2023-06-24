package pkg;

import java.time.Duration;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Datepicker {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.vrlbus.in");
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();//close advertisement
		}
	@Test
	public void test1() throws Exception {

		Thread.sleep(3000);
	    driver.findElement(By.id("txtFromDate")).click();

		try {
			while(true) {
				WebElement monthelement=driver.findElement(By.xpath("//th[normalize-space()='June 2023']"));
				String month1=monthelement.getText();
				System.out.println(month1);
				if(month1.equalsIgnoreCase("july 2023")) {
					System.out.println(month1);
					break;
				}else {
					driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[1]/th[3]")).click();
				}
				List<WebElement>alldayelements=driver.findElements(By.xpath("/html/body/div/div[1]/table/tbody/tr/td"));
						for(WebElement dayelement:alldayelements) {
							String date=dayelement.getText();
							System.out.println(date);
							if(date.equals("20")) {
								System.out.println(date);
								dayelement.click();
								System.out.println("date selected");
							}
							}
			}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}}
}
