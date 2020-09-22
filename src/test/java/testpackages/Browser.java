package testpackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static String browser = "firefox";
	public static WebDriver driver;
	
	public static void main(String[] args) {

		if(browser.equals("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
			
		}
		
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle().length());
	 
		
		
	}
	
}