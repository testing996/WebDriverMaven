package testpackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://www.makemytrip.com/");   
		
       //WebElement from = driver.findElement(By.xpath("//span[contains(text(),'From')]"));
       //from.click();
       
       //driver.findElement(By.xpath("//li[contains(text(),'Round Trip')]")).click(); 
        
        
       List<WebElement> fromCities = driver.findElements(By.tagName("li"));
       
       System.out.println("Total fromCities are:"+fromCities.size()); 
       
       //System.out.println(fromCities.get(10).getText());
       
       
       for(int i=0;i<fromCities.size();i++)
       {
    	   System.out.println(fromCities.get(i).getText());
       }
       
       
      System.out.println("Printing all links--- ");
       
       List<WebElement>links = driver.findElements(By.tagName("a"));
       
       System.out.println(links.size());
       
       for(WebElement link:links)
       {
    	   System.out.println(link.getText()+"---URL IS---"+link.getAttribute("href"));

       }

       	
	}

}
	
