package testpackages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestPopups {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);// Implicit Wait
		driver.get("http://way2automation.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div/a[1]")).sendKeys(Keys.PAGE_DOWN);

		Thread.sleep(3000);
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		
		
		/*
		 * System.out.println("------Generating window ids from first window--------");
		 * 
		 * Set<String> winids = driver.getWindowHandles(); Iterator<String> iterator=
		 * winids.iterator();
		 * 
		 * String first_window = iterator.next();
		 * 
		 * System.out.println(first_window);
		 * 
		 * driver.switchTo().window(first_window);
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div/a[1]")).click();
		 * 
		 * System.out.println("------Generating window ids from second window--------");
		 * 
		 * winids = driver.getWindowHandles(); iterator= winids.iterator();
		 * 
		 * System.out.println(iterator.next());
		 * 
		 * String second_window =iterator.next();
		 * 
		 * System.out.println(second_window);
		 * 
		 * driver.switchTo().window(second_window);
		 * 
		 * 
		 * driver.findElement(By.id("user_email")).sendKeys("trainer@way2automation.com"
		 * );
		 * 
		 * driver.close();//2 window driver.switchTo().window(first_window);
		 * driver.close();//1 window
		 * 
		 * 
		 * driver.quit();//To close all sessions
		 */
	}

}
