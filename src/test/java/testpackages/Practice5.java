package testpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice5 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//Implicit Wait
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		//new Actions(driver).dragAndDrop(draggable, droppable).perform();
	
		new Actions(driver).dragAndDropBy(draggable, 300, 200).perform();
		
		
	}

}
