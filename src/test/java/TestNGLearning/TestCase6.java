package TestNGLearning;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase6 {

	@Test(priority =1,groups = "med")
	public void doUserReg() {
		
		System.out.println("Executing User Reg");
		Assert.fail("Failing a test case");
		Reporter.log("Taking screenshot");
	}
	
	@Test(priority =2,dependsOnMethods = "doUserReg" ,groups="med")
	public void doLogin() {
		
		System.out.println("Executing login test");
	}
	
	@Test(priority =3,groups="high")
	public void isSkip() {
		
		throw new SkipException("Skipping the test");
	}
}
