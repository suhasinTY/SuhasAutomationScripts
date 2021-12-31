package ELF29;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToAnyApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.invoiceninja.com/");
		driver.get("https://www.instagram.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
