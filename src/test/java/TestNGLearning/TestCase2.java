package TestNGLearning;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

	@Test(groups = {"high","med"})
	public void validateTitle() {
		
		String actual_title = "Gmail.com";
		String expected_title = "Gmails.com";		
		//String expected_title = "Yahoo.com";		
		
		
		System.out.println("Begining");
		
		SoftAssert asrt = new SoftAssert();
		
		asrt.assertEquals(actual_title, expected_title,"Titles are not matching");
		
		//Assert.assertTrue(true,"Element not found");
		asrt.assertTrue(false,"Element not found");
	    
		asrt.fail("Forecfully failing a test case");

		System.out.println("Ending");
		
		asrt.assertAll();
		
		
		
	}
}
