package may10th;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateAdactinApp {
	
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
	public void loginTest()
	{
		Assert.assertTrue(false);
		System.out.println("Login Successfull");
		
	}
	

	@Test(priority=2)
	public void registrationTest()
	{
		
		System.out.println("Registration Successfull");
		
	}
	
	@Test(priority=3 , dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Change Password Successfull");
		
	}


}
