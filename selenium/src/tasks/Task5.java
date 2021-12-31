package tasks;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Set<String> childwindow = driver.getWindowHandles();
		for (String handle : childwindow) {
			driver.switchTo().window(handle);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
	}
		
		
	}

