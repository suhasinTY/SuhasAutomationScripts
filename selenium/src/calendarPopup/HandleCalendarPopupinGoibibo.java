package calendarPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarPopupinGoibibo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.goibibo.com/");
	driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("banglore");
	driver.findElement(By.id("gosuggest_inputDest")).sendKeys("goa");
	driver.findElement(By.id("departureCalendar")).click();
	
	}

}
