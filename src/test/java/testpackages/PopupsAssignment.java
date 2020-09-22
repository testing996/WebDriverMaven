package testpackages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);// Implicit Wait
		driver.get("http://way2automation.com/way2auto_jquery/frames-and-windows.php");
		
		         //1 Window
				System.out.println("Generating ids from first window");
				
				Set<String> winids = driver.getWindowHandles();
				Iterator<String> iterate = winids.iterator();
			
			  String first_window = iterate.next();
			  
			  System.out.println(first_window);
		
			    driver.findElement(By.name("name")).sendKeys("Ro");
		        driver.findElement(By.name("phone")).sendKeys("848848494");
		        driver.findElement(By.name("email")).sendKeys("rajes1245@gmail.com");
		        driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select")).sendKeys("Greece");
		        driver.findElement(By.name("city")).sendKeys("mohali12");
		        driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")).sendKeys("raj121253451512123");
		        driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).sendKeys("asdad36244929215115151");
		        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")).click();
		      
		        
		         //2 Window
		        
                System.out.println("Generating ids from second window");
				
				 winids = driver.getWindowHandles();
				iterate = winids.iterator();
			
				System.out.println(iterate.next());//first window
				
			  String second_window = iterate.next(); // second window
			  
			  System.out.println(second_window);
			   
			  driver.switchTo().window(second_window);
		      
			  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  driver.findElement(By.xpath("//a[contains(text(),'Frames and Windows')]")).click();
			  
			  
			  
			  
				
		        
		        
				
		        
		        
		        
		        
		
		
	}

}
