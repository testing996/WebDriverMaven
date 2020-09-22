package testpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice4 {

	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//Implicit Wait
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		WebElement mainslider = driver.findElement(By.xpath("//*[@id=\"slider\"]"));

		int width =mainslider.getSize().width/2; // To move it in centre
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		//new Actions(driver).dragAndDropBy(slider, 100, 0).perform();
		
		new Actions(driver).dragAndDropBy(slider, width, 0).perform(); // To bring it in centre
		
		
	}

}
