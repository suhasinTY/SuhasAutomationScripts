package seleniumwfh;

import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class draging {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Point p = new Point(250, 500);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);

	}

}
