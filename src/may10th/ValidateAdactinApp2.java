package may10th;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateAdactinApp2 {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Open Browser");
		System.out.println("Laucnh Application");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Close Browser");
		
	}
	@Test(priority=1)
	public void build2Test()
	{
		Assert.assertTrue(false);
		System.out.println("build2 Successfull");
		
	}
	

	@Test(priority=2)
	public void googlePlayTest()
	{
		
		System.out.println("Googglee test Successfull");
		
	}
	
	@Test(priority=3)
	public void appStoreTest()
	{
		
		System.out.println("apple test Successfull");
		
	}


}
