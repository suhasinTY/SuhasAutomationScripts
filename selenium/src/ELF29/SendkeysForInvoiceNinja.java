package ELF29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysForInvoiceNinja {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.invoiceninja.com/login");
		WebElement Emailtextfield = driver.findElement(By.id("email"));
		Emailtextfield.sendKeys("suhas");
		Thread.sleep(2000);
		WebElement PasswordTextfield = driver.findElement(By.id("password"));
		PasswordTextfield.sendKeys("elf@06");
		Thread.sleep(2000);
		WebElement Login = driver.findElement(By.id("loginButton"));
		Login.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
