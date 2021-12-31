package click;

import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium_starting/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/USER/Desktop/a1.html");
Thread.sleep(1000);
driver.findElementById("i").sendKeys("nenu");
Thread.sleep(1000);
driver.findElementById("i1").clear();
Thread.sleep(1000);
driver.findElementById("i2").click();
Thread.sleep(1000);
driver.close();
	}

}
