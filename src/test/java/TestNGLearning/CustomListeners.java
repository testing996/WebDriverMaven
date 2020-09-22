package TestNGLearning;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Capture Screenshot");

		
	}

	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		Reporter.log("<a href=\"C:\\Users\\26in\\Desktop\\IMG_2101.jpg\" target = \"_blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Users\\26in\\Desktop\\IMG_2101.jpg\" target = \"_blank\"><img src=\"C:\\Users\\26in\\Desktop\\IMG_2101.jpg\" height = 200 width =200></a>");	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
