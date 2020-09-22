package TestNGLearning;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase4 {

	@BeforeTest
	public void CreateDb() {
		
		System.out.println("Create Database Test");
	}
	
	@AfterTest
	
   public void CloseDb() {
		
		System.out.println("Close Database Test");
	}
	
	
	@BeforeMethod
	public void LaunchBroswer() {
		
		System.out.println("Launch the browser");
	}
    
	@AfterMethod
     public void CloseBroswer() {
		
		System.out.println("Close the browser");
	}
	
	
	@Test(priority=2,groups = "low")
	public void doUserReg() {
		
		System.out.println("Executing User Reg test");
	}
	
	@Test(priority=1,groups = "high")
	public void doLogin() {
		System.out.println("Executing login test");
	
		
	}
}
