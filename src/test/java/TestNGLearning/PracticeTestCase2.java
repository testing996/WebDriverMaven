package TestNGLearning;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeTestCase2 {

	@Test(groups = {"high","med"})
	public void validateTitle() {
		
	String actual_title="Gmail.com";
	String expected_title = "Yahoo.com";
	//String expected_title = "Yahoo.com";
	
	System.out.println("Begining");

	SoftAssert asrt = new SoftAssert();
	
	asrt.assertEquals(actual_title, expected_title,"Titles are not matching");//Soft Assertions
	
	//Assert.assertEquals(actual_title, expected_title,"Titles are not matching"); //Hard Assertions
	
	asrt.assertTrue(true,"Element  found");
	
	//Assert.assertTrue(true,"Element  found");
	
	//Assert.assertFalse(true,"Element found");
	
	asrt.fail("Forcefully failing a test");
	
	//Assert.fail("Forcefully failing a test");
	
	System.out.println("Ending");
	
	asrt.assertAll();
	
	
	
	}
}
