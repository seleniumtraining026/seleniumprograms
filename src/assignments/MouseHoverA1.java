package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHoverA1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.icicibank.com/");
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void mouseHoverA1Test()
	{
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Loans']")))
		      .pause(Duration.ofSeconds(2))
		      .moveToElement(driver.findElement(By.xpath("//label[text()='Agri and Rural Finance']")))
		      .build()
		      .perform();
		
		driver.findElement(By.xpath("//a[text()='Tractor Loan']")).click();
		
		
		
		
		
	}

}
