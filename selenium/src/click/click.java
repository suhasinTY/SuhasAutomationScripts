package click;

import org.openqa.selenium.chrome.ChromeDriver;

final class click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium_starting/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/USER/Desktop/click.html");
Thread.sleep(3000);
driver.findElementByTagName("a").click();
driver.close();
	}

}
