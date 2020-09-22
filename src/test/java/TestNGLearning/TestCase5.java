package TestNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase5 {

	@Test(groups = {"low","high"})
	public void validateTitle() {
	
		String actual_title = "Gmail.com";
		
		//String expected_title = "Gmail.com";
	
		String expected_title = "Yahoo.com";
		
		System.out.println("Begining");
		
		SoftAssert asrt = new SoftAssert();
		
		asrt.assertEquals(actual_title, expected_title, "Titles are matching");
		
		//Assert.assertEquals(actual_title, expected_title, "Titles are matching");
		
		asrt.fail("Failing a test case");
		
		asrt.assertTrue(false, "Element not found");
		
		//Assert.assertTrue(false, "Element not found");
		
		System.out.println("Ending");
		
		asrt.assertAll();
		
		
	}
	
	
	
	
}
