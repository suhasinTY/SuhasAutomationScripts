package yt;

import org.openqa.selenium.firefox.FirefoxDriver;

public class fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElementByCssSelector("input[id='email']").sendKeys("sachin3");
		driver.findElementByCssSelector("input[id='pass']").sendKeys("password");
		driver.findElementByCssSelector("button[name='login']").click();
			}

}
//write a script to login to fb using css selector (this is the question try in ff only)