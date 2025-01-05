package TestBase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;

public class TC_002_LogIn extends BaseClass {

	@Test(dataProvider = "LoginData",groups = {"Regression","Master"})
	public void VerifyLogin(String username,String Pwd,String exp)
	{
		try {
		HomePage hp=new HomePage(driver);
		
		hp.MyAccount();
		hp.clickOnLogin();
		LoginPage lg=new LoginPage(driver);
		lg.setEmail(username);
		lg.SetPassword(Pwd);
		lg.clicOnlogin();
		
		MyAccountPage mp=new MyAccountPage(driver);
		boolean targetPage = mp.isMyAccountPageExist();
		System.out.println(targetPage);
		
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{
				mp.logOut();
				org.testng.Assert.assertTrue(true);
			}
			else
			{
				org.testng.Assert.assertTrue(false);
			}
		}
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetPage=true)
			{  mp.logOut();
				org.testng.Assert.assertTrue(false);	
			}
			else {
				
				org.testng.Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e){
			org.testng.Assert.fail();
		}
	}
}
