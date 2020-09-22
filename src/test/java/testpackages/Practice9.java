package testpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice9 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);// Implicit Wait
		
		driver.findElement(By.name("proceed")).click();
	
		/*Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
	
		alert.accept();
        */
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
	    System.out.println(alert.getText());
		
		alert.accept();
	    
		
	}
	

}
