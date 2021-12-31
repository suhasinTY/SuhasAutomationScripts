package tasks;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getWindowHandle());
	}

}
