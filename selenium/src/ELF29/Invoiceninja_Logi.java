package ELF29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Invoiceninja_Logi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("chrome driver is launched successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		//Required data from the manual test case document
		String ExpectedURL="https://app.invoiceninja.com/login";
		String ExpectedUserName="vikasragothamarao@gmail.com";
		String ExpectedPassword="Vikas@123";
		String ExtpectedHomePageURL = "https://app.invoiceninja.com/dashboard?q=%2Fdashboard";
		
		
		
		//To enter valid URL
		driver.get(ExpectedURL);
		String URL = driver.getCurrentUrl();
		if(ExpectedURL.equals(URL)) {
			System.out.println("Login page is displayed successfully");
		}else {
			System.err.println("Login page is not displayed");
		}
		//To enter valid user name
		 WebElement ActualUsername = driver.findElement(By.id("email"));
		 ActualUsername.clear();
		 ActualUsername.sendKeys(ExpectedUserName);
		 String EnteredUsername = ActualUsername.getAttribute("value");
		
		if(ExpectedUserName.equals(EnteredUsername)){
			System.out.println("enter user name is valid");
		}else{
			System.err.println("user name entered is not valid");
		}
		
		//To enter valid password
		WebElement ActualPassword = driver.findElement(By.id("password"));
		ActualPassword.clear();
		ActualPassword.sendKeys(ExpectedPassword);
		String EnteredPassword = ActualPassword.getAttribute("value");
		if(ExpectedPassword.equals(EnteredPassword)) {
			System.out.println("password entered is valid");
		}else {
			System.err.println("password entered is invalid");
		}
		//To perform click action on login button and to check home page is displayed or not
		driver.findElement(By.id("loginButton")).click();
		wait.until(ExpectedConditions.urlMatches(ExtpectedHomePageURL));
		String HomepageURL = driver.getCurrentUrl();
		
		if(ExtpectedHomePageURL.equals(HomepageURL)) {
			System.out.println("home page is displayed");
		}else {
			System.err.println("home page is not displayed");
		}
		
	}

}
