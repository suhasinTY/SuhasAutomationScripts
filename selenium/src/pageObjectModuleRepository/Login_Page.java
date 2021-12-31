package pageObjectModuleRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
public Login_Page(WebDriver driver) {
	 {
		PageFactory.initElements(driver,this);
	}
	
	}
	@FindBy(name="user_name") private WebElement UserNameTextfield;
	@FindBy(name = "user_password") private WebElement PasswordTextfield;
	@FindBy(id = "submitButton") private WebElement LoginButton;
	public WebElement getUserNameTextfield() {
		return UserNameTextfield;
	}
	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	}

