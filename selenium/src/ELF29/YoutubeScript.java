package ELF29;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kannada");
		driver.findElement(By.id("search")).sendKeys("kannada");
	}

}
