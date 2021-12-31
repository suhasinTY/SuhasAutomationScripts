import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelementtopic {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/USER/Desktop/selenium1.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='123']"));
		boolean b=ele.isDisplayed();
		if(b) {
			System.out.println("element is displayed");
		}
		else
		{
			System.out.println("element is  not displayed");
		}
				
		
	}

}
