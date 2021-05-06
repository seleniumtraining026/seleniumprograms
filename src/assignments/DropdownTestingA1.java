package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTestingA1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("day")).sendKeys("2");
		
		driver.findElement(By.id("month")).sendKeys("Oct");
		
		
		driver.findElement(By.id("year")).sendKeys("2000");
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
