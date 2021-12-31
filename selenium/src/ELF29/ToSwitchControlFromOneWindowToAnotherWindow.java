package ELF29;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchControlFromOneWindowToAnotherWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String ParentWindow = driver.getWindowHandle();
		Set<String> ChildWindow = driver.getWindowHandles();
		ChildWindow.remove(ParentWindow);
		for (String handle : ChildWindow) {
			driver.switchTo().window(handle);
			driver.close();
			driver.switchTo().window(ParentWindow);
			Thread.sleep(2000);
			driver.manage().window().fullscreen();
		
			
			
		}
		
	}

}
