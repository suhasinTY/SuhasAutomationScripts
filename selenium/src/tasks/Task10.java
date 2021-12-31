package tasks;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		Set<String> windows = driver.getWindowHandles();
		String expectedTitle = "Cognizant";
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

