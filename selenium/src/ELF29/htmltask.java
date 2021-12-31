package ELF29;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class htmltask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,06);
		driver.get("file:///C:/Users/USER/Desktop/task.html");
		WebElement find = driver.findElement(By.id("m_m1"));
		Select s=new Select(find);
		for(int i=0;i<=6;i++) {
		s.selectByIndex(i);
	}
	}
}
