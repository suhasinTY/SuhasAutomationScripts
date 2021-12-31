package ELF29;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingEmptyFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

	}

}
