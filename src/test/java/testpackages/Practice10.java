package testpackages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice10 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);// Implicit Wait
		driver.get("http://way2automation.com/");
		
		//1 window
		System.out.println("Generating window ids from first window");
		
		Set<String> winids = driver.getWindowHandles();
         Iterator<String> iterate = winids.iterator();

         String first_window = iterate.next();
         
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div/a[1]")).click();
	
		System.out.println(first_window);
		
		//2 window
		
       System.out.println("Generating window ids from second window");
		
		 winids = driver.getWindowHandles();
         iterate = winids.iterator();

         System.out.println(iterate.next());//first window
         
         String second_window = iterate.next();//second window
		
         System.out.println(second_window);
         
		driver.switchTo().window(second_window);
		
		driver.findElement(By.id("user_email")).sendKeys("trainer@way2automation.com");
		
		
		
		
		
	}

}
