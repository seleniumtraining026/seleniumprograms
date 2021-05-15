package may12th;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowHandle {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
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
		
		String homeWindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		Iterator<String> it=windowIds.iterator();
		
		while(it.hasNext())
		{
			
			String windowId=it.next();
			
			
			driver.switchTo().window(windowId);
			
			
			Thread.sleep(5000);
			
			try
			{
			driver.findElement(By.xpath("//a[text()='See more']")).click();
			Thread.sleep(5000);
			break;
			}
			catch(Exception e)
			{
				System.out.println("Switched to wrong Window");
			}
				
			
						
			
		}
		
		
		driver.switchTo().window(homeWindowId);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		
		windowIds=driver.getWindowHandles();
		
		it=windowIds.iterator();
		
		while(it.hasNext())
		{
			
			String windowId=it.next();
			
			
			driver.switchTo().window(windowId);
			
			
			Thread.sleep(5000);
			
			try
			{
			driver.findElement(By.xpath("//a[text()='Terms of Service' and contains(@href,'www.apple.com')]")).click();
			Thread.sleep(5000);
			break;
			}
			catch(Exception e)
			{
				System.out.println("Switched to wrong Window");
			}
				
		
						
			
		}
		
		
		
		
		
		
		
	}
		

}
