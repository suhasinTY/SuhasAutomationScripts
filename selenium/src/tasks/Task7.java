package tasks;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.close();
	
	}

}
