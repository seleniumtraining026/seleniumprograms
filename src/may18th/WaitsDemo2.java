package may18th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitsDemo2 {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.24hourfitness.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void waitsDemo1Test() throws InterruptedException
	{
		
		
		
		
		WebDriverWait myWait=new WebDriverWait(driver, 30);
		
		myWait.until(ExpectedConditions
			  .visibilityOf(
			  driver.findElement(By.xpath("//a[text()='See Gyms']"))))
		      .click();
		
		
		
		
		
	}

}
