package TestNGLearning;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test(priority = 1,groups ="high")
	public void doUserReg() {
		
		System.out.println("Executing User Reg test");
		
		Reporter.log("Inside Do User reg test");
	}
	
	
	
	@BeforeMethod
	public void launchBroswer() {
		System.out.println("launching browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing the browser");
	}
	
	
	
	@Test(priority = 2,groups = "low")
	public void doLogin() {

		Reporter.log("Inside Do Login test");
		System.out.println("Executing login test");
		
	}
	
	

}
