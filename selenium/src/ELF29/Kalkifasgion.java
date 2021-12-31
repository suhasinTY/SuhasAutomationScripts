package ELF29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Kalkifasgion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/");
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.findElementByLinkText("Gowns").click();
		driver.findElement(By.xpath("//a[contains(text(),'Fabric With Cut Dana Emb...')]")).click();
		driver.findElement(By.xpath("//div[text()='S']")).click();
		driver.findElement(By.id("select_168252")).click();
		driver.findElement(By.id("select_168252")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("select_168252")).sendKeys(Keys.ENTER);
		//driver.findElement(By.id("bio_ep_close")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Green Drape...')]")).click();
		driver.findElement(By.xpath("//div[text()='42']")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		WebElement price = driver.findElement(By.xpath("//strong[text()='Grand Total']/../..//span[@class='price']"));
		System.out.println(price.getText());
		//driver.quit();
		
	}

}
