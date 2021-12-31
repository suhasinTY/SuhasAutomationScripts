import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locationss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenium_starting/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		Point l = ele.getLocation();
		System.out.println(l);
		int s = l.getX();
		System.out.println(s);
		int u = l.getY();
		System.out.println(u);
	}

}
