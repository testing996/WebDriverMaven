package ExtentReports;

import java.io.IOException;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase2 {

	

	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	@BeforeTest
	public void setReport() {
		
		htmlReporter = new ExtentSparkReporter("./reports/extent1.html");
		
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("W2A Automation Reports");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Automation Tester", "Rahul Arora");
		extent.setSystemInfo("Organization", "Way2Automation");
		extent.setSystemInfo("Build-No", "W2A-1234");
		
		
		
		
	}
	
	
	@AfterTest
	public void endReport() {
		
		extent.flush();
	}
	
	
	@Test
	public void doLogin() {
		
		test = extent.createTest("Login Test");
		test.log(Status.INFO, "Inside Do login test");
		
		
	}
	
	
	@Test
	public void doUserReg() {
		
		test = extent.createTest("User Reg Test");
		test.log(Status.INFO, "Enter username");
		test.log(Status.INFO, "Enter Password");
		test.log(Status.FAIL, "Failing the test - screenshot attached");
		Assert.fail("Failing user reg test");
	}
	
	
	@Test
	public void validateTitle() {
		
		test = extent.createTest("Validate Title Test");
		test.log(Status.INFO, "Validating title");
		
		throw new SkipException("Skipping the test case");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		
		
		if(result.getStatus() == ITestResult.FAILURE) {
			
		String exceptionMessage =	Arrays.toString(result.getThrowable().getStackTrace());
		test.fail(exceptionMessage);
		
		String screenshot = "C:\\Users\\26in\\Desktop\\IMG_2101.JPG";
		test.fail("<b><font color=red>Screenshot of failure</font></b><br>",MediaEntityBuilder.createScreenCaptureFromPath(screenshot).build());
		
		
		String methodName = result.getMethod().getMethodName();
		String text = "<b>TEST CASE: - "+methodName.toUpperCase()+" FAILED</b>";
		
		Markup m = MarkupHelper.createLabel(text, ExtentColor.RED);
		
		test.log(Status.FAIL, m);
			
		}else if(result.getStatus() == ITestResult.SUCCESS) {
			
			
			String methodName = result.getMethod().getMethodName();
			String text = "<b>TEST CASE: - "+methodName.toUpperCase()+" PASS</b>";
			
			Markup m = MarkupHelper.createLabel(text, ExtentColor.GREEN);
		
			
			test.log(Status.PASS, m);
			
		}else if(result.getStatus() == ITestResult.SKIP) {
			
			
			String methodName = result.getMethod().getMethodName();
			String text = "<b>TEST CASE: - "+methodName.toUpperCase()+" SKIPPED</b>";
			
			Markup m = MarkupHelper.createLabel(text, ExtentColor.YELLOW);
		
			test.log(Status.SKIP, m);
			
		}
		
	}
	

}
