package testScriptsForVtigerAppUsingPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectModuleRepository.Login_Page;

public class TC_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium_starting/chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//navigate to application and to validate the same
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");

		String expectedresult = driver.getCurrentUrl();
		String actualresult = driver.getCurrentUrl();
		if(actualresult.equals(expectedresult)) {
			System.out.println("login page is displayed");
		}else {
			System.err.println("login page is not displayed");
		}
		//to enter data in user name and password textFiled and to validate the same
		Login_Page loginpage=new Login_Page(driver);
		WebElement loginpagevalue = loginpage.getUserNameTextfield();
		loginpagevalue.sendKeys("admin");
		String actualusername = "admin";
		String enteredusername = loginpagevalue.getAttribute("value");
		if(actualusername.equals(enteredusername)) {
			System.out.println("enterd name is valid");
		}else {
			System.err.println("enter name is invalid");
		}
		WebElement passwordvalue = loginpage.getPasswordTextfield();
		passwordvalue.sendKeys("root");
		String actualpassword = "root";
		String enteredpassword = passwordvalue.getAttribute("value");
		if(actualpassword.equals(enteredpassword)) {
			System.out.println("entered password is valid");
		}else {
			System.err.println("entered password is invalid");
		}
		//to click on login button 
		loginpage.getLoginButton().click();
		expectedresult=driver.getCurrentUrl();
		actualresult="http://localhost:8888/index.php?action=index&module=Home";
		if(expectedresult.equals(actualresult)) {
			System.out.println("home page is dispalyed");
		}else {
			System.err.println("home page is not displayed");
		}

	}

}
