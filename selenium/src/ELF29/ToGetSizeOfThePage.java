package ELF29;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://instagram.com");
		Options Options = driver.manage();
	 Window window = Options.window();
	 Dimension size = window.getSize();
	 System.out.println(size);
	}

}
