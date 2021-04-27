package apr27th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kosmik\\kosmik9ambatchh\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("X coordinate value is "+driver.findElement(By.id("username")).getLocation().x);
		
		
		System.out.println("Height is "+driver.findElement(By.id("username")).getRect().height);
		
		System.out.println("Height is "+driver.findElement(By.id("username")).getSize().height);
		
		
		driver.findElement(By.id("username")).sendKeys("reyaz009");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).clear();
		
		//driver.findElement(By.linkText("New User Register Here")).click();
		
		
		System.out.println(driver.findElement(By.className("build_title")).getText());
		
		System.out.println(driver.findElement(By.linkText("New User Register Here")).getAttribute("href"));
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
