package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTestingA1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bankofamerica.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("No of Links present in WebPage "+allLinks.size());
		
		int noOfVisibleLinks=0;
		
		
		for(int i=0;i<allLinks.size();i++)
		{
			
			if(!allLinks.get(i).getText().isEmpty())
			{
				noOfVisibleLinks++;
				
				System.out.println(allLinks.get(i).getText());
			}
			
			
		}
		
		System.out.println("No of Visible Links "+noOfVisibleLinks);
		System.out.println("No of Hidden Links "+(allLinks.size()-noOfVisibleLinks));
		
		
		
		Thread.sleep(5000);
		
		
		
		driver.quit();
		
		
		
		
		
		
	}
	

}
