import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/USER/Desktop/selenium1.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean b= ele.isSelected();
		if(b)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("deselected");
		}
			
	}

}

