package ELF29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotakeScreenshotOfWebelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io");
//		driver.findElement(By.xpath("//input[@type='submit']")).getScreenshotAs(File);
	}

}
