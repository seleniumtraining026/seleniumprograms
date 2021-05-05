package may5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(dropDown);
		
		//using selectByIndex(int)
		
		//s1.selectByIndex(12);
		
		//Using selectByValue(String) --> value is an attribute for option
		
		//s1.selectByValue("search-alias=stripbooks");
		
		//selectByVisibleText(String) --> text means between > and < ==> most prefered 
		
		s1.selectByVisibleText("Books");
	
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		

	}

}
