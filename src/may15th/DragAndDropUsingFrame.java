package may15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUsingFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		
		Actions action=new Actions(driver);
		
		Thread.sleep(5000);
		
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement source=driver.findElement(By.id("draggable"));
		
		WebElement target=driver.findElement(By.id("droppable"));
		
		
		action.dragAndDrop(source, target).perform();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}

}
