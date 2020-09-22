package testpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice11 {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
	
		
		int size = driver.findElements(by).size();
		
		if(size ==0) {
			
			return false;
			
			}else {
				
			return true;
					
			
		}
		
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		System.out.println(isElementPresent(By.id("identifierId")));
		
	}

}
