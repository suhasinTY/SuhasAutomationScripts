package ELF29;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecomm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaafashion.com/");
		String homepage = driver.getWindowHandle();
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("X")).click();
		//To Perform Click Action on Different Links
		driver.findElement(By.xpath("//span[text()='Men']")).click();
		driver.findElement(By.xpath("//span[text()='Women']")).click();
		driver.findElement(By.xpath("//span[text()='Kids']")).click();
		//To get all window id's
		Set<String> linkedpages = driver.getWindowHandles();
		linkedpages.remove(homepage);
		Thread.sleep(5000);
		//To remove parent window id from the all window id's
		for (String loop : linkedpages) {
			driver.switchTo().window(loop);
		Thread.sleep(3000);
		//To select products in men along with size and click on add to cart
			driver.findElement(By.xpath("//div[text()='Men Dark Green Printed Slim Fit Cotton T-Shirt']")).click();
			driver.findElement(By.xpath("//button[text()='XL']")).click();
			driver.findElement(By.xpath("//button[text()='Add to bag']")).click();
			Thread.sleep(5000);
			//To select products in women along with size and click on add to cart
	
			driver.findElement(By.xpath("//a[@aria-label='Shaily - White Printed Kurta With Sharara (Set of 2)']")).click();
		driver.findElement(By.xpath("//button[text()='S']")).click();
		driver.findElement(By.xpath("//button[text()='Add to bag']")).click();
		Thread.sleep(5000);
		//To select products in kids along with size and click on add to cart
		driver.findElement(By.xpath("//div[text()='Green Spaghetti Kurta and Sharara Set with Hand bag (Set of 4)']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='5-6 Years']")).click();
		driver.findElement(By.xpath("//button[text()='Add to bag']")).click();
		Thread.sleep(5000);
	}
		//To perform click action on cart
		driver.findElement(By.xpath("//div[text()='Cart']")).click();
	}	
}
