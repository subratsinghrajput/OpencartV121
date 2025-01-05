package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Baseclass {

	 public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath=("//input[@id='input-firstname']"))
WebElement FirstName;

@FindBy(xpath=("//input[@id='input-lastname']"))
WebElement LastName;
@FindBy(xpath=("//input[@id='input-email']"))
WebElement Email;
@FindBy(xpath=("//input[@id='input-telephone']"))
WebElement Telephone;
@FindBy(xpath=("//input[@id='input-password']"))
WebElement Password;
@FindBy(xpath=("//input[@id='input-confirm']"))
WebElement ConfirmPassword;

@FindBy(xpath=("//input[@name='agree']"))
WebElement checkBox;


@FindBy(xpath=("//input[@value='Continue']"))
WebElement continueButton;

public void setFirstName( String Username)
{
	FirstName.sendKeys(Username);
}
public void setLastName(String Lastname)
{
	LastName.sendKeys(Lastname);
}

public void setEmail(String email)
{
	Email.sendKeys(email);
}

public void settelephone(String numeric)
{
	Telephone.sendKeys(numeric);
}

public void setPassword(String pass) {
	Password.sendKeys(pass);
}
public void setConfirmPassword(String password) {
	ConfirmPassword.sendKeys(password);
}

public void clickCheck()
{
	checkBox.click();
}

public void pressContinue() throws InterruptedException {
	continueButton.click();
	Thread.sleep(2000);
}


}
