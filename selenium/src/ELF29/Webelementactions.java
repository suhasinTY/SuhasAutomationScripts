
package ELF29;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementactions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("abcdefg");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("1234567890");
		Thread.sleep(2000);
	
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("vi");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("invalid");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("password?")).click();
		Thread.sleep(2000);
		driver.get("https://accounts.snapchat.com/accounts/login?client_id=geo");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("suhas");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("create");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		driver.get("https://account.samsung.com/accounts/v1/MBR/signInGate?locale=en_IN&countryCode=IN&goBackURL=https:%2F%2Faccount.samsung.com%2Fmembership%2Fintro&returnURL=https:%2F%2Faccount.samsung.com%2Fmembership%2Fintro&redirect_uri=https:%2F%2Faccount.samsung.com%2Fmbr-svc%2Fauth%2FregistAuthentication&tokenType=OAUTH&response_type=code&client_id=k2jxgrvd6k&state=AoknsSRffAXMtXymfHaKLBjSnMjWMERB");
		Thread.sleep(2000);
		driver.findElement(By.id("iptLgnPlnID")).sendKeys("j8");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create")).click();
		driver.quit();
		
	}

}
