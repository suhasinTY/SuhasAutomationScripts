package testscriptsForVTiger_Organization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_1 {

	public static void main(String[] args) throws InterruptedException {
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

		String expectedpage = "Organizations";
		System.out.println(expectedpage);
//		String actualpage = organization.getText();
//		organization.click();
//		if(expectedpage.equals(actualpage)) {
//			System.out.println("page found");
//		}else {
//			System.err.println("page not found");
//		}
//
//
//		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click(); 
//		String expectepageorg = driver.getTitle();
//		String actualpageorg = driver.getTitle();
//		if(expectepageorg.equals(actualpageorg)) {
//			System.out.println("create new organization page is displayed");
//		}else {
//			System.err.println("create new organization page is not displayed");
//		}
//		//To create a organization with mandatory fields
//		WebElement mandatoryfield1 = driver.findElement(By.name("accountname"));
//		mandatoryfield1.sendKeys("user");
//		String givendataforMF1 = mandatoryfield1.getAttribute("value");
//		String actualdataforMF1 = "user";
//		if(actualdataforMF1.equals(givendataforMF1)) {
//			System.out.println("entered data for Mandatory field1 is valid");
//		}else {
//			System.err.println("entered data for mandatory field1 is invalid");
//		}
//		//To click on save button
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		String ExpectedTitleAfterSaveAction = driver.getTitle();
//		String ActualTitleAfterSaveAction = driver.getTitle();
//		
//		if(ExpectedTitleAfterSaveAction.equals(ActualTitleAfterSaveAction)) {
//			System.out.println("save action is performed");
//		}else {
//			System.err.println("save action is not performed");
//		}
//		//To perform logout action
//		Actions ac1 = new Actions(driver);
//		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		ac1.moveToElement(ele).perform();
//		driver.findElement(By.partialLinkText("Sign Out")).click();
//		if(actualresult.equals(expectedresult)) {
//			System.out.println("logout is successfull");
//		}else {
//			System.err.println("logout is not successfull");		}
	}

}
