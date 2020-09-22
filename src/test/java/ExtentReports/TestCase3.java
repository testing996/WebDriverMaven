package ExtentReports;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TestCase3 {


	@Test
	public void doLogin() {
		
		System.out.println("Executing login test");
		
	}
	
	
	@Test
	public void doUserReg() {
		
		Assert.fail("Failing user reg test");
	}
	
	
	@Test
	public void validateTitle() {
		
		throw new SkipException("Skipping the test case");
	}
	
}
