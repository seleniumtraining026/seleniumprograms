package apr30th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("Title of home Page "+driver.getTitle());
		
		System.out.println(driver.findElement(By.linkText("New User Register Here")).getAttribute("href"));
		
		driver.findElement(By.linkText("New User Register Here")).click();
		
		System.out.println("Title of Page After Clicking the Link "+driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		
		
		

	}

}
