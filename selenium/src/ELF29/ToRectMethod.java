package ELF29;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Rectangle username = driver.findElement(By.id("email")).getRect();
		int hu = username.height;
		int hw = username.width;
		System.out.println(hu);
		System.out.println(hw);
		int xaxis = username.x;
		int yaxis = username.y;
		System.out.println(xaxis);
		System.out.println(yaxis);
		Rectangle password = driver.findElement(By.id("pass")).getRect();
		int hp = password.height;
		int pw = password.width;
		int xp = password.x;
		int yp = password.y;
		System.out.println(hp);
		System.out.println(pw);
		System.out.println();
		
	}

}
