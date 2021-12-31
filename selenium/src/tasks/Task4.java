package tasks;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Point position = new Point(100,50);
		driver.manage().window().setPosition(position);
		driver.quit();
	}

}
