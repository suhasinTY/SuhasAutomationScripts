package ELF29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Q3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.id("cricbuzz-plus-main-menu-anchor")).click();
		driver.quit();
	}

}
