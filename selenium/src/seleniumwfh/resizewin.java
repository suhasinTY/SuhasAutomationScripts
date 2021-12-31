package seleniumwfh;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class resizewin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Dimension d = new Dimension(250,250);
		driver.manage().window().setSize(d);

	}

}
