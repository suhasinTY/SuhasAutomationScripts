package ELF29;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPossitionOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://instagram.com");
		Options manage = driver.manage();
		Window window = manage.window();
		Point position = window.getPosition();
		System.out.println(position);
	}

}
