package ELF29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Q10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/");
		WebElement Cricbuzz = driver.findElement(By.xpath("//img[@title='Cricbuzz Logo']"));
		System.out.println(Cricbuzz.getAttribute("text"));
		driver.quit();
	}

}
