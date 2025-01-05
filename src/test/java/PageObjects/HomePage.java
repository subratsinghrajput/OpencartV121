package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Baseclass{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement MyAccountlink;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement RegistrationLink;
	
	@FindBy(xpath=("//a[normalize-space()='Login']"))
	WebElement LoginButton;
	
	public void MyAccount()
	{
		MyAccountlink.click();
	}
	
	public void RegistrationButton()
	{
		RegistrationLink.click();
	}
	
	public void clickOnLogin()
	{
		LoginButton.click();
	}
}
