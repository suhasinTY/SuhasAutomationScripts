package ELF29;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String ParentWindow = driver.getWindowHandle();
		Set<String> ChildWindow = driver.getWindowHandles();
		ChildWindow.remove(ParentWindow);
		for (String Perform : ChildWindow) {
			driver.switchTo().window(Perform);
			driver.close();
			
			
			
		}
		
	}

}
