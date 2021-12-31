package pageObjectModuleRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckingTheWorkingOfIndustryDropdown {
	public CheckingTheWorkingOfIndustryDropdown(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
@FindBy(linkText = "Organizations") private WebElement Organizationslink;
@FindBy(xpath = "//img[@title='Create Organization...']") private WebElement PlusIcon;
@FindBy(name = "industry") private WebElement IndustryDropdown;
public WebElement getOrganizationslink() {
	return Organizationslink;
}
public WebElement getPlusIcon() {
	return PlusIcon;
}
public WebElement getIndustryDropdown() {
	return IndustryDropdown;
}

}
