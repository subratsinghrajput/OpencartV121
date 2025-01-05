package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Baseclass {
public MyAccountPage(WebDriver driver)
{
super(driver);	
}

@FindBy(xpath="//h2[normalize-space()='My Account']")
WebElement Myaccount;



@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") 
WebElement logout;


public void logOut()
{
	logout.click();
}
public boolean isMyAccountPageExist()
{
	try {
		return (Myaccount.isDisplayed());
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
	
}

}
