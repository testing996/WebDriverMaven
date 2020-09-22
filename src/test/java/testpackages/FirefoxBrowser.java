package testpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://qa.way2automation.com");
        
        //driver.navigate().to("http://way2automation.com/way2auto_jquery/index.php");
        
        driver.findElement(By.name("name")).sendKeys("Raj");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/label")).getText());

        driver.findElement(By.name("phone")).sendKeys("625923629298");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[2]/label")).getText());
        
        driver.findElement(By.name("email")).sendKeys("raj12@gmail.com");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[3]/label")).getText());
        
        driver.findElement(By.name("city")).sendKeys("mumbai");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[5]/label")).getText());
		
        
        driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")).sendKeys("raj12132123");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/label")).getText());
        
        driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).sendKeys("asdad3629292");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/label")).getText());
		
        
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")).click();
		
        
		driver.quit();
		
	}
	

}
