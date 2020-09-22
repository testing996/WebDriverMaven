package testpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice6 {

	public static void main(String[] args) {
		    WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//Implicit Wait
			driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
			
			WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
			
			new Actions(driver).dragAndDropBy(resizable, 200, 300).perform();
	}

}
