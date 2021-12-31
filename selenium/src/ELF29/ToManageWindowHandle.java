package ELF29;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
	}

}
