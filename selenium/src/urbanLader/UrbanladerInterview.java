package urbanLader;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanladerInterview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		//WebDriverWait wait= new WebDriverWait(driver,06);
		Actions ac= new Actions(driver);
		ac.moveByOffset(303,143).perform();
		//wait.until(ExpectedConditions.visibilityOf(null))
		driver.findElement(By.xpath("//span[text()='Lounge Chairs']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Close")).click();
		driver.findElement(By.xpath("//ul[@class='productlist withdivider clearfix lounge_chairs productgrid']//li[3]")).click();
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow);
		childwindow.remove(parentwindow);
		for (String loop : childwindow) {
			driver.switchTo().window(loop);
		}
		driver.findElement(By.linkText("Close")).click();
		
		driver.findElement(By.xpath("//button[@name='button' and @data-id='92667']")).click();
		WebElement rate = driver.findElement(By.xpath("//div[@class='order-amt upfront-payment']"));
		System.out.println(rate.getText());
		
	}

}
