package PageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Baseclass {

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="//input[@id='input-email']")
WebElement emailText;

@FindBy(xpath="//input[@id='input-password']")
WebElement passwordTextElement;

@FindBy(xpath="//input[@value='Login']")
WebElement loginLink;


@FindBy(xpath="//h2[normalize-space()='My Account']")  
WebElement myAccount;

public void setEmail(String Email)
{
	emailText.sendKeys(Email);
}

public void SetPassword(String pwd) {
	passwordTextElement.sendKeys(pwd);
}
 
public void clicOnlogin()
{
	loginLink.click();
}


}
