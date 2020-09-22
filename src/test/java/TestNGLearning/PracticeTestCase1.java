package TestNGLearning;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestCase1 {

	@BeforeTest
	public void createDbConn() {
		
		System.out.println("Creating a Db Conn");
	}
	
	@AfterTest
	public void closeDbConn() {
		System.out.println("Closing a Db Conn");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launch a browser");
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close a browser");
	}
	
	@Test(priority = 1,groups = "high")
	public void doUserReg() {
		
		System.out.println("Executing user register test");
		
		
	}
	
	@Test(priority = 2,groups = "low" )
	public void doLoging() {

		Reporter.log("Inside Do Login Test");
		System.out.println("Executing login test");
	}
	
	
}
