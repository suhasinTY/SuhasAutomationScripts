package calendarPopup;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ToHandleCalendarPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		LocalDateTime Systemtymanddate = LocalDateTime.now();
		String month = Systemtymanddate.getMonth().toString();
		String monthname = month.substring(0,3);
		String currentmonth = month.substring(0,1).toUpperCase()+month.substring(1,3).toLowerCase();
		int date = Systemtymanddate.getDayOfMonth();
		int year = Systemtymanddate.getYear();
		driver.get("https://www.makemytrip.com");
		Actions a=new Actions(driver);
		a.click().perform();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollby(0,105);");
		selectcalendarDate(driver,month,date,year);
		
	}

	private static void selectcalendarDate(WebDriver driver, String month, int date, int year) {
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[@aria-label='"+date+" "+month+" "+year)).click();
				break;		
			}catch(NoSuchElementException ex) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}
