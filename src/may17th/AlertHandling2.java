package may17th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling2 {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://javascript.info/alert-prompt-confirm");
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void alertHandlingTest() throws InterruptedException
	{
		
		
		driver.findElement(By
		.xpath("//span[text()=\"'How old are you?'\"]/preceding::div[1]/preceding-sibling::div/descendant::a"))
		.click();
		
		Alert a1=driver.switchTo().alert();
		
		System.out.println(a1.getText());
		
		a1.sendKeys("35");
		
		a1.accept();
		
		Thread.sleep(5000);
		
		a1=driver.switchTo().alert();
		
		System.out.println(a1.getText());
		
		a1.accept();
		
		
		
		
		
		
		
			
	}
		
}
