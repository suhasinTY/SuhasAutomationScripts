package seleniumwfh;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class foreach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/USER/Desktop/cb.html");
List<WebElement> c = driver.findElements(By.xpath("//input[@type='checkbox']"));
int count = c.size();
for (WebElement b : c) {
	b.click();
	b.click();
	
}
	}
	

}
