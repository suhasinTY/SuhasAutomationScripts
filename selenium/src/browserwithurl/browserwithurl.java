package browserwithurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserwithurl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		driver.quit();
	}

}
