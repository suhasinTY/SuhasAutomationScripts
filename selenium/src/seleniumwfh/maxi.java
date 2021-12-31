package seleniumwfh;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maxi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Dimension d = new Dimension(259,309);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		

	}

}
