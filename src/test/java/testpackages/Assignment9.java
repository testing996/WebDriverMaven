package testpackages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);// Implicit Wait
		driver.get("https://www.naukri.com/");
		
		
		//1 Window
		System.out.println("Generating ids from first window");
		
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterate = winids.iterator();
	
	  String first_window = iterate.next();
	  
	  System.out.println(first_window);
	  
	  //2 window
	  
	  System.out.println("Generating ids from second window");
	  
	   winids = driver.getWindowHandles();
	   iterate = winids.iterator();
	  
	   System.out.println(iterate.next());//1 window
	   
	   String second_window = iterate.next();//2 window
	   
	   System.out.println(second_window);
	   
	   driver.switchTo().window(second_window);
	   
	   //3  window

	   System.out.println("Generating ids from third window");
		  
	   winids = driver.getWindowHandles();
	   iterate = winids.iterator();
	  
	   System.out.println(iterate.next());//1 window
	   System.out.println(iterate.next());//2 window
	   
	   String third_window = iterate.next();
	   
	   System.out.println(third_window);
	   
	   //4 window
	   
	   System.out.println("Generating ids from fourth window");
		  
	   winids = driver.getWindowHandles();
	   iterate = winids.iterator();
	  
	   System.out.println(iterate.next());//1 window
	   System.out.println(iterate.next());//2 window
	   System.out.println(iterate.next());//3rd window
	   
	   String fourth_window = iterate.next();
	   
	   System.out.println(fourth_window);
	      
	   driver.switchTo().window(fourth_window);
	   
	   driver.close(); // 4rd window
	   
	   driver.switchTo().window(third_window);
	   
	   driver.close(); // 3rd window 
	   
       driver.switchTo().window(second_window);
	   
	   driver.close(); // 2nd window
	   
       driver.switchTo().window(first_window);
	   
	   driver.close(); // 1st window   
	   
	   //driver.quit();
	
	}

}
