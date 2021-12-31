package seleniumwfh;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mmtss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		driver.close();
	}

}
