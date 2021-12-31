package yt;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ytcheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.youtube.com");
driver.findElementByClassName("ytd-searchbox").click();
driver.findElementByClassName("ytd-searchbox");
System.out.println("done");
driver.findElementById("search-icon-legacy").click();
driver.close();
	}
}
