package ELF29;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.close();
	}

}
