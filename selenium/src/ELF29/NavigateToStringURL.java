package ELF29;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToStringURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.instagram.com");
	}

}
