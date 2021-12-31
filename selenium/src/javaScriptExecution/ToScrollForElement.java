package javaScriptExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollForElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://https://meesho.com/");
		WebElement Targetloc = driver.findElement(By.xpath("//div[text()='Trending now']"));
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scr",Targetloc);
		j.executeScript("arguments[0].scrollIntoView(true);",Targetloc);
	}

}
