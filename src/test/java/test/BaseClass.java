package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
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
}
