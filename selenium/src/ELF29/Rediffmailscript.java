package ELF29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmailscript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthelfbatch@rediffmail.com");
		//driver.findElement(By.id("TO_IDcmp2")).sendKeys(Keys.TAB);
		//driver.switchTo().activeElement();
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("suhas");
	//	Thread.sleep(3000);
		WebElement Frameelement = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(Frameelement);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("hi sir good evening its working");
		driver.switchTo().defaultContent();
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[@title='suhas']/..//cite[@class='rd_mail_tickbox']")).click();
		driver.findElement(By.xpath("//span[@class='rd_fil_del']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();

	}

}

