package testpackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"searchLanguage\"]"));

		Select select = new Select(dropdown);
		
		//select.selectByValue("fa");
		
		//select.selectByIndex(2);
		
		List<WebElement> values = driver.findElements(By.tagName("option"));

		System.out.println("Total values are:"+values.size());

		//System.out.println(values.get(2).getAttribute("value"));
		
		//System.out.println(values.get(1).getText());
		
		for(int i =0;i<values.size();i++)
		{
			System.out.println(values.get(i).getAttribute("lang"));
		}
	
		System.out.println("Printing all links");
		
		//WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]"));
		
		//List<WebElement> links =  block.findElements(By.tagName("a"));
		
		List<WebElement> links =  driver.findElements(By.tagName("a"));
	    
		System.out.println("Total links are:"+links.size());
		
		for(WebElement link:links)
		{
			System.out.println(link.getText()+"----URL IS----"+link.getAttribute("href"));
		}
		
	}
	

}
