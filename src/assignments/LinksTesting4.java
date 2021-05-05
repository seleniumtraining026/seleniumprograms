package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.stepchange.org/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//*[@id=\"footerContainer\"]/nav/div[1]"));
		
		
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		
		
		System.out.println("No of Links "+allLinks.size());
		
		
		for(int i=0;i<allLinks.size();i++)
		{
			
			String linkName=allLinks.get(i).getText();
			
			String expUrl=allLinks.get(i).getAttribute("href");
			
			//allLinks.get(i).click();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].click();", allLinks.get(i));
			
			
			String actUrl=driver.getCurrentUrl();
			System.out.println("expUrl"+expUrl);
			System.out.println("actUrl"+actUrl);
			
			if(actUrl.contains(expUrl))
			{
				System.out.println(linkName+"Link is working");
			}
			else
			{
				System.out.println(linkName+"Link is not working");
			}
			
			
			driver.navigate().back();
			
			block=driver.findElement(By.xpath("//*[@id=\"footerContainer\"]/nav/div[1]"));
			
			allLinks=block.findElements(By.tagName("a"));
			
			
		}
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
