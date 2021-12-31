package ELF29;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToViewInFullScreenMode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().fullscreen();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kannada");
		driver.findElement(By.id("search")).sendKeys("kannada");
	}

}
