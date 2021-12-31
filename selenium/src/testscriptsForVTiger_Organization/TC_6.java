package testscriptsForVTiger_Organization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_6 {

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
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		String actualusername = "admin";
		String enteredusername = username.getAttribute("value");
		if(actualusername.equals(enteredusername)) {
			System.out.println("enterd name is valid");
		}else {
			System.err.println("enter name is invalid");
		}

		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("root");
		String actualpassword = "root";
		String enteredpassword = password.getAttribute("value");
		if(actualpassword.equals(enteredpassword)) {
			System.out.println("entered password is valid");
		}else {
			System.err.println("entered password is invalid");
		}
		//to click on login button 
		driver.findElement(By.id("submitButton")).click();
		expectedresult=driver.getCurrentUrl();
		actualresult="http://localhost:8888/index.php?action=index&module=Home";
		if(expectedresult.equals(actualresult)) {
			System.out.println("home page is dispalyed");
		}else {
			System.err.println("home page is not displayed");
		}
		//navigate to organization page and to verify the same

		WebElement organization = driver.findElement(By.linkText("Organizations"));

		String expectedpage = organization.getText();
		String actualpage = organization.getText();
		organization.click();
		if(expectedpage.equals(actualpage)) {
			System.out.println("page found");
		}else {
			System.err.println("page not found");
		}


		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click(); 
		String expectepageorg = driver.getTitle();
		String actualpageorg = driver.getTitle();
		if(expectepageorg.equals(actualpageorg)) {
			System.out.println("create new organization page is displayed");
		}else {
			System.err.println("create new organization page is not displayed");
		}
		//To Navigate to the new organization page via members
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		//To perform logout action
		Actions ac1 = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		ac1.moveToElement(ele).perform();
		driver.findElement(By.partialLinkText("Sign Out")).click();
		if(actualresult.equals(expectedresult)) {
			System.out.println("logout is successfull");
		}else {
			System.err.println("logout is not successfull");		}
	}


}
