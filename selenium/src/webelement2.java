import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/USER/Desktop/selenium1.html");
		WebElement ele = driver.findElement(By.xpath("//input"));
		boolean b= ele.isEnabled();
		if(b)
		{
			System.out.println("text field is enabled");
		}
		else
		{
			System.out.println("text field is not enabled");
		}

	}

}
