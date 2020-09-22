package testpackages;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice14 {

	static int targetDay = 0, 
			targetMonth = 0,
			targetYear = 0;


static int currentDay = 0, 
			currentMonth = 0,
			currentYear = 0;

static int jumpMonthsBy=0;

static boolean increment = true;

public static void main(String[] args) throws InterruptedException {
	
	
	String dateToSet = "25/12/2020";
	
	//get current date
	getCurrentDateMonthAndYear();
	System.out.println(currentDay + " "+currentMonth + " "+currentYear);
	
	//get target date
	GetTargetDateMonthAndYear(dateToSet);
	System.out.println(targetDay + " "+targetMonth + " "+targetYear);
	
	//Get Jump month
	CalculateHowManyMonthsToJump();
	
	System.out.println(jumpMonthsBy);
	System.out.println(increment);

 	 
	WebDriverManager.chromedriver().setup();
	
	WebDriver  driver = new ChromeDriver();		
	
	driver.get("https://www.goibibo.com/");
	
	
	//WebDriverWait wait = new WebDriverWait(driver,5);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//Implicit Wait

	
	driver.manage().window().maximize();	
		
	

    //Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
	
	
	for(int i = 0 ;i<jumpMonthsBy;i++) {

		if(increment) {
			
			//wait.until(ExpectedConditions.elementToBeClickable(By.className("DayPicker-NavButton DayPicker-NavButton--next"))).click();
			//driver.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--next")).click();
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[5]/div/div/div[1]/span[2]")).click();
			
			//driver.findElement(By.cssSelector("div.gws-travel-header__wrapper div.gws-travel-header__main-content.gws-flights__side_nav.gws-flights__main.gws-flights__flex-column.gws-flights__flex-grow.flt-body1:nth-child(2) div.gws-flights__flex-column.gws-flights__flex-grow.r-i_g_uXIGJpkQ div.gws-flights__flex-column.gws-flights__flex-grow div.gws-flights__flex-column.gws-flights__flex-grow.gws-flights__app-root.gws-flights__modal-dialog-open div.gws-flights__modal-dialog:nth-child(5) div:nth-child(1) two-month-calendar.qcXwoe.Khzb3b:nth-child(5) div.GKOGGf calendar-flippers.cSISZc > div.njjicd.rSFy9b:nth-child(2)")).click();
			
		}else {
	
			//wait.until(ExpectedConditions.elementToBeClickable(By.className("DayPicker-NavButton DayPicker-NavButton--prev"))).click();
		
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[5]/div/div/div[1]/span[1]")).click();
		
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[5]/div/div/div[1]/span[1]"))).click();
			
			//driver.findElement(By.cssSelector("div.gws-travel-header__wrapper div.gws-travel-header__main-content.gws-flights__side_nav.gws-flights__main.gws-flights__flex-column.gws-flights__flex-grow.flt-body1:nth-child(2) div.gws-flights__flex-column.gws-flights__flex-grow.r-i_g_uXIGJpkQ div.gws-flights__flex-column.gws-flights__flex-grow div.gws-flights__flex-column.gws-flights__flex-grow.gws-flights__app-root.gws-flights__modal-dialog-open div.gws-flights__modal-dialog:nth-child(5) div:nth-child(1) two-month-calendar.qcXwoe.Khzb3b:nth-child(5) div.GKOGGf calendar-flippers.cSISZc > div.njjicd.U0gh4b:nth-child(1)")).click();
			
		}
	
		Thread.sleep(1000);
	}	
	
     	driver.findElement(By.linkText(Integer.toString(targetDay))).click();
	
		}
	
	


	
	public static void getCurrentDateMonthAndYear() {
		
		Calendar cal = Calendar.getInstance();
		
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear  = cal.get(Calendar.YEAR);
		
	}


	public static void GetTargetDateMonthAndYear(String dateString)
	{
		
		int firstIndex = dateString.indexOf("/");
		int lastIndex = dateString.lastIndexOf("/");
		
		String day = dateString.substring(0, firstIndex); 
		targetDay = Integer.parseInt(day);
		
		String month =  dateString.substring(firstIndex+1, lastIndex);
		targetMonth = Integer.parseInt(month);
		
		String year = dateString.substring(lastIndex+1, dateString.length());
	
		targetYear = Integer.parseInt(year);
		
	}

	
	
	public static void CalculateHowManyMonthsToJump() {
		
		if((targetMonth-currentMonth)>0){
			
			jumpMonthsBy = (targetMonth-currentMonth);
		}else {

			jumpMonthsBy = (currentMonth-targetMonth);
			increment = false;
		}
	
}

}




		