package ELF29;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOnlyParentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.close();
	
	}

}
