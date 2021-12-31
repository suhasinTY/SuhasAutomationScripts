package ELF29;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/Chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
