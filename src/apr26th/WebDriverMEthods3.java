package apr26th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMEthods3 {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		//To maximize the window 
		
		
		driver.manage().window().maximize();
		
		
		//System.out.println(driver.getPageSource());
		
		//System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table[2]/tbody/tr/td[1]/a/img")).click();
		
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table[2]/tbody/tr/td[2]/a/img")).click();
		
		
		System.out.println(driver.getWindowHandles());
		
		
		
		
	}

}
