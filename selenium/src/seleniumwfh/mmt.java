package seleniumwfh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mmt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From' and @type='text']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='From' and @type='text']")).sendKeys("bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To' and @type='text']")).sendKeys("mangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Mangalore, India']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Tue Dec 14 2021']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		List<WebElement> c = driver.findElements(By.xpath("//div[@class='makeFlex simpleow']"));
		int count = c.size();
		for (WebElement s : c) {
			System.out.println(s.getText());
	System.out.println(s.getSize());
		}
		driver.close();
	}

}
