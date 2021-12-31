package ELF29;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSizeOfThePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\suhas\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		Dimension dimension = new Dimension(10, 20);
		driver.manage().window().setSize(dimension);
		Dimension dimen = new Dimension(20, 35);
		driver.manage().window().setSize(dimen);
	
	}

}
