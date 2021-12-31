package click;

import org.openqa.selenium.firefox.FirefoxDriver;

public class clickbyid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/USER/Desktop/click.html");
Thread.sleep(5000);
driver.findElementById("s").click();
driver.close();
	}

}
