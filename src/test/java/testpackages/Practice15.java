package testpackages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice15 {

	public static WebDriver driver;
	
	public static Logger log = Logger.getLogger(Practice15.class.getName());
	
    public static Properties OR = new Properties();
    public static Properties Config = new Properties();
	
	public static void click(String Key) {
		
		if(Key.endsWith("_XPATH")) {
		
			driver.findElement(By.xpath(OR.getProperty(Key))).click();
		
		}else if(Key.endsWith("_ID")) {
		
			driver.findElement(By.id(OR.getProperty(Key))).click();
		
		}else if(Key.endsWith("_CSS")) {
		
			driver.findElement(By.cssSelector(OR.getProperty(Key))).click();
			
		}
		
		log.info("Clicking on an Element:"+ Key);
		
	}
	
     public static void type(String Key,String value) {
		
		if(Key.endsWith("_XPATH")) {
		
			driver.findElement(By.xpath(OR.getProperty(Key))).sendKeys(value);
		
		}else if(Key.endsWith("_ID")) {
		
			driver.findElement(By.id(OR.getProperty(Key))).sendKeys(value);
		
		}else if(Key.endsWith("_CSS")) {
		
			driver.findElement(By.cssSelector(OR.getProperty(Key))).sendKeys(value);
			
		}
		
		log.info("Typing in an Element"+ Key+"enterd the value as:"+value);
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\log4j.properties");
		
		

		FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		log.info("OR Properties loaded");
		
		
		fis = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		Config.load(fis);
		
        log.info("Config Properties loaded");;
		
		System.out.println(OR.getProperty("username_ID"));
		
		
		System.out.println(Config.getProperty("testsiteurl"));
		
		if(Config.getProperty("browser").equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Chrome Browser launched!!! ");
			
		}else if(Config.getProperty("browser").equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("Firefox Browser launched!!! ");
		
	}

		driver.get(Config.getProperty("testsiteurl"));
		log.info("Navigated to: " +Config.getProperty("testsiteurl"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
		
		
		type("username_ID","trainer@way2automation.com");
		click("nextBtn_XPATH");
		
		
		driver.quit();
		log.info("Test execution completed!!" );
	
		
	}
	
}