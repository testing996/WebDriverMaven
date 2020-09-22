package testpackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static String browser = "chrome";
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
	
	//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");	
		
	if(browser.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}else if(browser.equals("firefox"))
		
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
		
	
	driver.get("http://www.gmail.com");
	
	driver.manage().window().maximize();//To maximize the windows
	
	System.out.println(driver.getTitle().length());
	
	/*String title = driver.getTitle();	
	System.out.println(title);
	int length = title.length();//To get length	
	System.out.println(length);*/
	
	//driver.close();//close current browser
	//driver.quit();//close particular browser
	
	
	
	}

}
