package may6th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(dropDown);
		
		List<WebElement> allItems=s1.getOptions();
		
		System.out.println("no of Items in Dropdown "+allItems.size());
		
		for(WebElement item:allItems)
		{
			
			System.out.println(item.getText());
		}
	
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		

	}

}
