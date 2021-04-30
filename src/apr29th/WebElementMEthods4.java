package apr29th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMEthods4 {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.stepchange.org/");
		
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElement(By.linkText("How we help")).isDisplayed());
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}
	
	

}
