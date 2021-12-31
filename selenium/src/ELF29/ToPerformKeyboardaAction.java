package ELF29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformKeyboardaAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin",Keys.CONTROL+"ac");
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"ac");
System.out.println();
		driver.findElement(By.name("pwd")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.name("pwd")).sendKeys(Keys.ARROW_LEFT);
	}
	

}
