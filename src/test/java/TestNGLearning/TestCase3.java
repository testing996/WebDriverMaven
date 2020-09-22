package TestNGLearning;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase3 {

	@Test(priority = 1,groups = "med")
	public void doUserReg() {
		
		System.out.println("Executing User Reg test");
		Assert.fail("Failing test case");
		
		
	}
	
	@Test(priority = 2, dependsOnMethods = "doUserReg",groups = "med")
	public void doLogin() {
		
		System.out.println("Executing login test");
		
	}
	
	@Test(priority=3,groups = "high")
	public void isSkip() {
		
		throw new SkipException("Exceptions are not met");
	}
	
	
	
}
