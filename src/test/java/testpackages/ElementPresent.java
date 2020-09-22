package testpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementPresent {

	public static WebDriver driver;
	
	public static boolean isElementPresent(By by) {
		
		/*try {
		driver.findElement(By.id("identifierId"));
		
		return true;
		}catch(Throwable t) {
			
			return false;
		}*/
		
	int size =	driver.findElements(by).size();
	
	if(size==0) {
	
		return false;
		
	}else {
	
		return true;
	}
	
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 2);//Explicit Wait
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//Implicit Wait
		//driver.get("http://gmail.com");
		
		driver.navigate().to("http://gmail.com");
		
		System.out.println(isElementPresent(By.id("identifierId")));
		
		/*WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("trainer@way2automation.com");*/
		
		//driver.findElement(By.id("identifierId")).sendKeys("java@way2automation.com");
	
		
		/*driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/span/span")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("adasda");//Explicit wait
		
		//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("asdasdad");
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/span/span")).click();
		
       //System.out.println(driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")).getText());
	
		System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span"))).getText());
		
		driver.quit();*/
		
	}


	}
	
