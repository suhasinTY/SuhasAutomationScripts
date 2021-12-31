package chromebrowsertopic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chrome {
public static void main(String[] args) {
	String key="webdriver.chrome.driver";
	String value="./selenium_starting/chromedriver.exe";
	System.setProperty(key,value);
	ChromeDriver ChromeDriver = new ChromeDriver();
	String key1="webdriver.gecko.driver";
	String value1="./selenium_starting/geckodriver.exe";
	System.setProperty(key1,value1);
	FirefoxDriver FirefoxDriver = new FirefoxDriver();
}
}
