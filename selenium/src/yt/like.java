package yt;

import org.openqa.selenium.firefox.FirefoxDriver;

public class like {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com");
		driver.findElementByCssSelector("input[id='search']").sendKeys("rcb");
		driver.findElementById("serach-icon-legacy").click();
		driver.close();
		
	}

}
