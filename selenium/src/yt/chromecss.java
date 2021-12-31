package yt;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

class chromecss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.youtube.com");
driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf 2 trailer");
System.out.println("done1");

driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
System.out.println("done2");


	}

}
