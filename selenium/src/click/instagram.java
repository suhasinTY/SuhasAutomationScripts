package click;

import org.openqa.selenium.firefox.FirefoxDriver;

public class instagram {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com");
		driver.findElementByCssSelector("input[type='text']").sendKeys("hai");
		driver.findElementByCssSelector("input[type='password']").sendKeys("byehsjhkahkhakd");
		driver.findElementByCssSelector("button[type='submit']").click();

	}

}
