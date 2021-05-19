package may19th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable2 {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");
		
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
		
		
		String part1="//table/tbody/tr[";

		String part2="]/td[";
		String part3="]";
		
		
		for(int i=1;i<=36;i++)
		{
			
			for(int j=1;j<=8;j++)
			{
				
				System.out.print(driver.findElement(By.xpath(part1+i+part2+j+part3)).getText());
				System.out.print("\t");
			}
			
			System.out.println();
		}
			
		
			
			
			
			
			
		
		
	}

}
