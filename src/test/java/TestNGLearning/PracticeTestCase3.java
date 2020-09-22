package TestNGLearning;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PracticeTestCase3 {

	@Test(priority = 1,groups = "med")
	public void doUserReg() {
		
		System.out.println("Executing user register test");
		Assert.fail("Failing user registration");
		
	}
	
	@Test(priority = 2, dependsOnMethods = "doUserReg",groups = "med")
	public void doLoging() {
		System.out.println("Executing login test");
	}
	
	@Test(priority=3,groups = "high")
	public void isSkip() {
		
		//if(!true) {

		throw new SkipException("Skipping the test as condition is not met");
	}
		
	}

//}
