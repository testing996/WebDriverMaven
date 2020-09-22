package TestNGLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExcelReader;

public class TestParameterization {

	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
	
	@DataProvider(name = "dp")
	public Object[][] getData() {
		
		String sheetName = "LoginTest";
		ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\testdata.xlsx");
		
		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		
		System.out.println(excel.getCellData(sheetName, 0, 2));
		
		System.out.println(excel.getCellData(sheetName, "username", 3));
		
		System.out.println("Total rows are: "+rowCount+"---total cols are:"+colCount);
		
		Object[][] data = new Object[rowCount-1][colCount];
		
		/*
		 * data[0][0]=excel.getCellData(sheetName, 0, 2);
		 * data[0][1]=excel.getCellData(sheetName, 1, 2);
		 * 
		 * data[1][0]=excel.getCellData(sheetName, 0, 3);
		 * data[1][1]=excel.getCellData(sheetName, 1, 3);
		 * 
		 * data[2][0]=excel.getCellData(sheetName, 0, 4);
		 * data[2][1]=excel.getCellData(sheetName, 1, 4);
		 */
		
		for(int rows=2;rows<=rowCount;rows++) {
			
			for(int cols=0;cols<colCount;cols++) {
		
				data[rows-2][cols]	= excel.getCellData(sheetName, cols, rows);

				
				
			}
			
		}
		
		return data;
	}
	
	
	@Test(dataProvider= "dp")
	public void doLogin(String username, String password) {
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(username);

		driver.findElement(By.id("pass")).sendKeys(password);
		
		//System.out.println(username+"---"+password);
		
	}
	
}
