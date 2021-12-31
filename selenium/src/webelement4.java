import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/USER/Desktop/tag.html");
		WebElement ele = driver.findElement(By.xpath("//input[@value='abc']"));
		WebElement ele1 = driver.findElement(By.xpath("//input[@value='xyz']"));
		ele.sendKeys(Keys.CONTROL+"ac");
		ele1.sendKeys(Keys.CONTROL+"av");
				
	}

}
