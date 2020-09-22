package testpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//Implicit Wait
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		
		for(int i =100;i<=600;i++)
		{
			Dimension d = new Dimension(i,i);
			driver.manage().window().setSize(d);
		
			i=i+10;
			
		}
		
	}
	}


