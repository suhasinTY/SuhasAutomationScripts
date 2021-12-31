package ELF29;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChangeThePositionOfThePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		Point point = new Point(50,70);
		driver.manage().window().setPosition(point);
	}

}
