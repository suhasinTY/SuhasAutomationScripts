package click;

import org.openqa.selenium.firefox.FirefoxDriver;

public class clickbyname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/USER/Desktop/click.html");
Thread.sleep(1000);
driver.findElementByClassName("h").click();
driver.close();
	}

}
