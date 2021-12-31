package titleurlsc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class titleurlsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String src = driver.getPageSource();
		System.out.println(src);
	}

}
