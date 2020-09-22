package testpackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHandlingMultipleElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://www.wikipedia.org/");      
        
      /*  List<WebElement> elements =  driver.findElements(By.xpath("//input"));
        
        System.out.println(elements.size());*/ 
		
       // driver.findElement(By.xpath("//*[@id=\"searchLanguage\"][@name=\"language\"]")).sendKeys("Eesti");
        
       WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"][@name=\"language\"]"));
        
       Select select = new Select(dropdown);
       
        //select.selectByVisibleText("Eesti");

        select.selectByValue("hi");
        
        select.selectByIndex(3);
        
        
        List<WebElement> values =  driver.findElements(By.tagName("option"));
        
        //List<WebElement> values =  dropdown.findElements(By.tagName("option"));//If want to find links from certain section

        System.out.println("Total Values are :"+values.size());
       
        System.out.println(values.get(8).getText());

        System.out.println(values.get(8).getAttribute("value"));
        
        for(int i =0;i<values.size();i++)

        {
        	System.out.println(values.get(i).getAttribute("lang"));
    
        }
	
        System.out.println("Printing all links--- ");
        
       //WebElement block= driver.findElement(By.xpath("//*[@class=\"other-projects\"]"));
        
       //List<WebElement> links = block.findElements(By.tagName("a"));//If want to find links from certain section
       
       List<WebElement> links = driver.findElements(By.tagName("a"));
       
       System.out.println(links.size());
       
       for(WebElement link:links)
      
       {
    	   System.out.println(link.getText()+"---URL IS---"+link.getAttribute("href"));
	
    	   
    	   
       
       }

}
	
}