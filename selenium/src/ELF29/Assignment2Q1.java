package ELF29;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Q1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./seelnium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//div[text()='Grocery']")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//div[text()='Travel']")).click();
		Set<String> Newtabs = driver.getWindowHandles();
		
		driver.switchTo().window(null);
	}

}
