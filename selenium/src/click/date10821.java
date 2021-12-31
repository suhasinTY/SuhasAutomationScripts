package click;

import org.openqa.selenium.chrome.ChromeDriver;

public class date10821 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/how.html");
		Thread.sleep(1000);
		driver.findElementByTagName("a").click();
		driver.close();
			}

}
