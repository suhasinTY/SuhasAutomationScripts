package yahooautomation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahooautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://login.yahoo.com");
Thread.sleep(2000);
driver.findElementByXPath("//input[@type='text']").sendKeys("testuser0.1");
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pwdforusera");
driver.findElementByXPath("//button[@type='submit']").click();

	}

}
