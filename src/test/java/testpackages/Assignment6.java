package testpackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6 {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	
	List<WebElement> checkboxes = driver.findElements(By.name("sports"));

	System.out.println("Total checkboxes are:"+checkboxes.size());

	for(int i =1;i<checkboxes.size();i++) 
	{
		
		System.out.println(checkboxes.get(i).getAttribute("value"));
 }
	
	
	}

}