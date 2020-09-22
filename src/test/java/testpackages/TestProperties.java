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

public class TestProperties {

	/*
	 * 1 - add log4j dep 2 - Logger - getLogger(); 3 - Log4j Appenders - Info,
	 * Error, Debug - log4j.properties 4 - PropertyConfigurator
	 * 
	 */
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(TestProperties.class.getName());
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();

	public static void click(String key) {

		if (key.endsWith("_XPATH")) {

			driver.findElement(By.xpath(OR.getProperty(key))).click();
		} else if (key.endsWith("_ID")) {

			driver.findElement(By.id(OR.getProperty(key))).click();
		} else if (key.endsWith("_CSS")) {

			driver.findElement(By.cssSelector(OR.getProperty(key))).click();
		}

		log.info("Clicking on an Element: " + key);

	}

	public static void type(String key, String value) {

		if (key.endsWith("_XPATH")) {

			driver.findElement(By.xpath(OR.getProperty(key))).sendKeys(value);
		} else if (key.endsWith("_ID")) {

			driver.findElement(By.id(OR.getProperty(key))).sendKeys(value);;
		} else if (key.endsWith("_CSS")) {

			driver.findElement(By.cssSelector(OR.getProperty(key))).sendKeys(value);
		}

		log.info("Typing in an Element: " + key+" entered the value as : "+value);

	}

	public static void main(String[] args) throws IOException {

		PropertyConfigurator.configure(System.getProperty("user.dir") +"\\src\\test\\resources\\properties\\log4j.properties");

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		log.info("OR Properties loaded");

		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
		Config.load(fis);

		log.info("Config Properties loaded");

		// driver.findElement(By.id(OR.getProperty("username_ID"))).sendKeys();
		System.out.println(OR.getProperty("username_ID"));

		// driver.get(Config.getProperty("testsiteurl"))
		System.out.println(Config.getProperty("testsiteurl"));

		if (Config.getProperty("browser").equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			// System.setProperty("webdriver.chrome.driver", "");
			driver = new ChromeDriver();
			log.info("Chrome browser launched !!!");

		} else if (Config.getProperty("browser").equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("Firefox browser launched !!!");

		}

		driver.get(Config.getProperty("testsiteurl"));
		log.info("Navigated to : " + Config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);

		type("username_ID", "trainer@way2automation.com");
		click("nextBtn_XPATH");

		driver.quit();
		log.info("Test execution completed !!!");

	}
	
}
