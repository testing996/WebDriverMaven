package testpackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {

	public static void main(String[] args) {
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		 driver.findElement(By.xpath("(//*[@value=\"baseball\"])[1]")).click();
		 driver.findElement(By.xpath("(//*[@value=\"baseball\"])[2]")).click();
		
	}

}
