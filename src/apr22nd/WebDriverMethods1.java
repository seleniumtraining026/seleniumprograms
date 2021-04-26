package apr22nd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//get method
		
		driver.get("http://adactinhotelapp.com/");
		
		//below statement is to stop execution for 10 seconds 
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table[2]/tbody/tr/td[2]/a/img")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		//close method is to close the tab or window
		
		//driver.close();
		
		//quit method to close the tab or window
		
		driver.quit();
		
	}

}
