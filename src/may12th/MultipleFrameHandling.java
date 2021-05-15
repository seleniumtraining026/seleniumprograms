package may12th;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleFrameHandling {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.angelfire.com/super/badwebs/");
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void multipleWindowHandleTest() throws InterruptedException
	{
		
		driver.switchTo().frame("contents");
		
		
		driver.findElement(By.xpath("//font[contains(text(),'International I Hate Frames Club')]")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame("main");
		
		driver.findElement(By.xpath("//a[contains(text(),'Coast to coast fun as Y2K')]")).click();
		
		Thread.sleep(5000);
		
		
		
	}
		

}
