package testpackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckBoxes {

public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		
		/*try {
		driver.findElement(By.id("identifierId"));
		
		return true;
		}catch(Throwable t) {
			
			return false;
		}*/
		
	int size =	driver.findElements(by).size();
	
	if(size==0) {
	
		return false;
		
	}else {
	
		return true;
	}
	
	}
	
	
	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//Implicit Wait
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	
		/*for(int i =1;i<=4;i++) {
	
		driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();	
		
		}*/
		
		
		/*driver.findElement(By.xpath("(//*[@type=\"checkbox\" and @name=\"sports\"][@value=\"soccer\"])[1]")).click();
		driver.findElement(By.xpath("(//*[@type=\"checkbox\" and @name=\"sports\"][@value=\"football\"])[1]")).click();
		driver.findElement(By.xpath("(//*[@type=\"checkbox\" and @name=\"sports\"][@value=\"baseball\"])[1]")).click();
		driver.findElement(By.xpath("(//*[@type=\"checkbox\" and @name=\"sports\"][@value=\"basketball\"])[1]")).click();*/
		
		/*
		 * int i=1; int count=0;
		 * while(isElementPresent(By.xpath("//div[4]/input["+i+"]"))) {
		 * 
		 * driver.findElement(By.xpath("//div[4]/input["+i+"]")).click(); i++; count++;
		 * 
		 * }
		 * 
		 * System.out.println("Total checkboxes are:"+count);
		 */
		
		
		WebElement section = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
			
		List<WebElement> checkboxes = section .findElements(By.name("sports"));
	
		//List<WebElement> checkboxes = driver.findElements(By.name("sports"));
		
		System.out.println("Total checkboxes are:"+checkboxes.size());
		
		for(WebElement checkbox:checkboxes) 
		{
			checkbox.click();
		}
	
	}
	



}


