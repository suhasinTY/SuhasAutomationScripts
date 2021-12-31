package ELF29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Q4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
		driver.get("");
		driver.findElement(By.id("modal-close")).click();
		driver.findElement(By.id("push-modal-close")).click();
		driver.findElement(By.name("")).click();
		driver.quit();
	}

}
