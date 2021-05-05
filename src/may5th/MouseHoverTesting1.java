package may5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverTesting1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.stepchange.org/");
		
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		WebElement element1=driver.findElement(By.linkText("How we help"));
		
		action.moveToElement(element1).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Money advice")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		

	}

}
