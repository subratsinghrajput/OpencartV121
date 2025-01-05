package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;
public class RC_001_Registration extends BaseClass {




@Test(groups = {"Sanity","Master"})
public void verifyRegistration() throws InterruptedException
{
	HomePage hp=new HomePage(driver);
	hp.MyAccount();
	hp.RegistrationButton();
	RegistrationPage R=new RegistrationPage(driver);
	R.setFirstName(generatedString());
	R.setLastName(generatedString()+"Singh");
	R.setEmail(generatedString()+"@gmail.com");
	R.settelephone(GeneratedNumber());
	String pwd=generatedString()+"@!"+GeneratedNumber();
	R.setPassword(pwd);
	R.setConfirmPassword(pwd);
	R.clickCheck();
	R.pressContinue();
	
}

}

