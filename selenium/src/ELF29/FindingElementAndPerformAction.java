package ELF29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementAndPerformAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement UsernameTextfield = driver.findElement(By.id("username"));
		UsernameTextfield.sendKeys("hai");
		WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		passwordtextfield.sendKeys("bye");
		
	}

}
