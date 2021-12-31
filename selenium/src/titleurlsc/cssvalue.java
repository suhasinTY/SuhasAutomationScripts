package titleurlsc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@id='pass']"));
		String f = ele.getCssValue("font-size");
		System.out.println(f);
	}

}
