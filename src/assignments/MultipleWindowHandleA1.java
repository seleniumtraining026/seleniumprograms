package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowHandleA1 {
	
	WebDriver driver;

	public void switchToWindow(String xpath) throws InterruptedException
	{
		
		Set<String> windowIds=driver.getWindowHandles();
		
		Iterator<String> it=windowIds.iterator();
		
		while(it.hasNext())
		{
			
			String windowId=it.next();
			
			
			driver.switchTo().window(windowId);
			
			
			Thread.sleep(5000);
			
			try
			{
			driver.findElement(By.xpath(xpath)).click();
			Thread.sleep(5000);
			break;
			}
			catch(Exception e)
			{
				System.out.println("Switched to wrong Window");
			}
				
			
						
			
		}
	}
	
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
		
		Thread.sleep(3000);
		
		switchToWindow("//a[text()='See more']");
		
		driver.switchTo().window(homeWindowId);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		switchToWindow("//a[text()='Terms of Service' and contains(@href,'www.apple.com')]");
		
		switchToWindow("//p[text()='Asia Pacific']");
		
		
						
			
		
		
	}
		

}
