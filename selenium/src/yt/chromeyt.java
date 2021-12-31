package yt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeyt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium_starting/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.youtube.com");
System.out.println("done1");
driver.findElementByClassName("ytd-searchbox").click();
System.out.println("done2");
driver.findElementByTagName("input").sendKeys("kgf chapter2");
System.out.println("done3");
driver.findElementById("search-icon-legacy").click();
driver.findElementByCssSelector("").click();
Thread.sleep(5000);
System.out.println("done4");
driver.close();
	}

}