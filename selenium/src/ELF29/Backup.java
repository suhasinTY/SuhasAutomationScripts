package ELF29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Backup {

	public static void main(String[] args) {
		//Script for launching empty browser
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to maximize
		driver.manage().window().maximize();
		
		//to navigate to url
		driver.get("https://www.naukri.com/");
		//to get url where driver control is present
		String url = driver.getCurrentUrl();
		System.out.println(url);
		 //to get title where driver control is present
		String title = driver.getTitle();
		System.out.println(title);
		//to print page source
	System.out.println(driver.getPageSource());
	
	driver.manage().window().fullscreen();
		
	//to quit or close
	driver.close();
		
		
		
	}

}
