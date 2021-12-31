package ELF29;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com");
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("bsnl landline phone",Keys.ENTER);


		driver.findElement(By.linkText("Beetel C11 SCHEME Corded Landline Phone")).click();
		driver.findElement(By.linkText("Beetel M59 Corded Landline Phone")).click();
		driver.findElement(By.linkText("Beetel X70 Cordless Landline Phone")).click();


		//driver.findElement(By.linkText("2")).click();

		Set<String> childwindow = driver.getWindowHandles();
		childwindow.remove(parentwindow);
		for (String loop : childwindow) {  
			driver.switchTo().window(loop);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		//driver.findElement(By.xpath("//div[text()='1']")).click();

		JavascriptExecutor j=(JavascriptExecutor) driver;	
		//	j.executeScript("window.scrollby(0,document.body.scrollHeight");
		driver.findElement(By.xpath("//a[text()='Beetel X70 Cordless Landline Phone']/../../../..//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//div[text()='Remove Item']/..//div[text()='Remove']")).click();
	}

}
