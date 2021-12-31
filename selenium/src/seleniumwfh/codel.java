package seleniumwfh;

import org.openqa.selenium.firefox.FirefoxDriver;

public class codel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		System.out.println("del");

	}

}
