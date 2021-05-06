package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTestingA2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		
		/*
		 * driver.findElement(By.id("day")).sendKeys("2");
		 * 
		 * driver.findElement(By.id("month")).sendKeys("Oct");
		 * 
		 * 
		 * driver.findElement(By.id("year")).sendKeys("2000");
		 */
		
		//Select s1=new Select(driver.findElement(By.id("day")));
		//s1.selectByVisibleText("2");
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("2");
		
		//Select s2=new Select(driver.findElement(By.id("month")));
		//s2.selectByVisibleText("Nov");
		
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jan");
		
		//Select s3=new Select(driver.findElement(By.id("year")));
		//s3.selectByVisibleText("2001");
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2002");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
