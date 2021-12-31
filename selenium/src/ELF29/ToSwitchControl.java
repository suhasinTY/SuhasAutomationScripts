package ELF29;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchControl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		Set<String> windows = driver.getWindowHandles();
		String expectedTitle = "Tech Mahindra";
		for (String handle : windows) {
			driver.switchTo().window(handle);
			if (expectedTitle.equals(driver.getTitle()))
			{
				driver.manage().window().maximize();
				driver.close();
			}
			
			
			
		}
	}

}
