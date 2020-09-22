package testpackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserElement {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//WebDriverWait wait = new WebDriverWait(driver,5);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://qa.way2automation.com");


		//driver.navigate().to("http://way2automation.com/way2auto_jquery/index.php");
		
		driver.findElement(By.name("name")).sendKeys("Rishi123456");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/label")).getText());

		driver.findElement(By.name("phone")).sendKeys("899879849161636");		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[2]/label")).getText());
		
		driver.findElement(By.name("email")).sendKeys("rahularaora1234569@gmail.com");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[3]/label")).getText());
		
		driver.findElement(By.name("city")).sendKeys("Noida12345");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[5]/label")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")).sendKeys("rahul123456789");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/label")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).sendKeys("rahul12345698366369");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/label")).getText());
		
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")).click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input"))).click();
		
		//driver.findElement(By.cssSelector("#load_form > div > div.span_1_of_4 > input")).click();
		
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input"))).click();
		

		//driver.findElement(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input")).click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("username"))).sendKeys("rishabh123");

		//driver.findElement(By.name("password")).sendKeys("asdasdasdasd");
		
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("name"))).sendKeys("rishabh");
		
		//driver.quit();
		
	}

}
