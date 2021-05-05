package may5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTesting1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//to select some item/option in dropdown using conventional way (Sendkeys method)
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		

	}

}
