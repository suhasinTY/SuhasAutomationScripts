package click;

import org.openqa.selenium.chrome.ChromeDriver;

public class clickbyname1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/USER/Desktop/click.html");
Thread.sleep(1000);
driver.findElementByName("u").click();
driver.close();

	}

}
