package testpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7 {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//Implicit Wait
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		
		
		WebElement img = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		
		new Actions(driver).contextClick(img).perform();
		
		WebElement img1 = driver.findElement(By.xpath("//*[@id=\"dm2m1i1tdT\"]"));
		
		new Actions(driver).contextClick(img1).perform();
		
		WebElement img2 = driver.findElement(By.xpath("//*[@id=\"dm2m2i1tdT\"]"));
		
		new Actions(driver).contextClick(img2).perform();
		
		WebElement img3 = driver.findElement(By.xpath("//*[@id=\"dm2m3i1tdT\"]"));
		
		new Actions(driver).contextClick(img3).perform();
		
	
	}

}
