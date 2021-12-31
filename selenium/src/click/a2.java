package click;

import org.openqa.selenium.firefox.FirefoxDriver;

public class a2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("file:///C:/Users/USER/Desktop/a2.html");
Thread.sleep(1000);
driver.findElementByClassName("c1").sendKeys("hai");
Thread.sleep(2000);
driver.findElementByClassName("c1").click();
Thread.sleep(2000);
driver.findElementByClassName("c2").click();
Thread.sleep(2000);
driver.close();
	}

}
