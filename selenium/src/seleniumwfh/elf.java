package seleniumwfh;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://docs.google.com/spreadsheets/d/1o7Pp7egp1nQaKchLKOshjgcrI2v_mjZFj8Zp4hMTJHM/edit#gid=89869611");
		driver.findElement(By.xpath("//input[@name='email']"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("suhas");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
