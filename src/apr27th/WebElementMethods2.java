package apr27th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElement(By.className("build_title")).getCssValue("color"));
		System.out.println(driver.findElement(By.className("build_title")).getCssValue("font-family"));
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
