package may3rd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement>  allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("No of Links in WebPage "+allLinks.size());
		
		/*
		 * for(int i=0;i<allLinks.size();i++) {
		 * 
		 * System.out.println(allLinks.get(i).getText());
		 * 
		 * }
		 */
		
		for(WebElement link:allLinks)
		{
			
			System.out.println(link.getText());
		}
		
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		
		

	}

}
