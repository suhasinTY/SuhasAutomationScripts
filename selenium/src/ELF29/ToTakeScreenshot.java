package ELF29;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		TakesScreenshot t= (TakesScreenshot) driver;
		 File temp = t.getScreenshotAs(OutputType.FILE);
		 File screenshot = new File("./screenshots/screenshot.jpeg");
		 FileUtils.copyFile(temp, screenshot);
		 driver.get("https://www.google.com/maps/@12.9311737,77.5504773,15z");
		 TakesScreenshot t1= (TakesScreenshot) driver;
		  File temp1 = t1.getScreenshotAs(OutputType.FILE);
		 File screenshot1 = new File("./screenshots/screenshot.png");
		 FileUtils.copyFile(temp1, screenshot1);
		 
		 
		 
	}

}
