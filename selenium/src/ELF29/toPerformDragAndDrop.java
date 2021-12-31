package ELF29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class toPerformDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,06);
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("suhaschandrac14@gmail.com");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("suhas@123");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[@title='Suhas']")).click();
		Actions ac= new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//h2[text()='To Do']/../..//span[text()='Selenium']"));
		WebElement target = driver.findElement(By.xpath("//h2[text()='Doing']/../..//span[text()='Add a card']"));
		ac.dragAndDrop(src, target).perform();
		
		
	}

}
