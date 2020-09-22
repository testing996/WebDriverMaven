package testpackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice8 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	   ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//Implicit Wait
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		driver.switchTo().defaultContent();
		
		 List<WebElement> frames = driver.findElements(By.tagName("iframe"));
			
		    System.out.println("Total frames are "+frames.size());
			
			for(WebElement frame:frames)
			
			{
				System.out.println(frame.getAttribute("id"));
		
			
			}
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		((JavascriptExecutor) driver).executeScript("myFunction()");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.id("mySubmit")));
	
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("/html/body/button")));
	
		
	}

}
