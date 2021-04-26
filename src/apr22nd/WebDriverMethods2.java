package apr22nd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("New User Register Here")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
	}

}
