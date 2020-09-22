package testpackages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTables {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);// Implicit Wait
		
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> rowNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		System.out.println("Total rows are:" + rowNum.size());
		
		List<WebElement> colNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		
		System.out.println("Total cols are:" + colNum.size());
		
		for(int rows=1;rows<=rowNum.size();rows++) {
			
			for(int cols=1;cols<=colNum.size();cols++) {
				
			System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText()+"   ");	
			
			}
		
			System.out.println();
		}
		
		
	}

}
