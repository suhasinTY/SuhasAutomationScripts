package browsertopic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./selenium_starting/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver=new FirefoxDriver();

	}

}
