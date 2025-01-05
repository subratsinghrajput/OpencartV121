package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Properties p;


	@BeforeClass(groups = {"Sanity","Regression","Master"})
	
	@Parameters({"os","browsername"})
	public void launchBrowser(String os,String browser) throws IOException
	{
		FileInputStream file=new FileInputStream("./src//test//resources//Config.properties");
				p=new Properties();
				p.load(file);
		switch(browser.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();
	                  break;
		case "edge" : driver=new EdgeDriver();
		break;
		default: System.out.println("Invalid Browser");
		return;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("Url"));
		driver.manage().window().maximize();	
	}

	@AfterClass(groups = {"Sanity","Regression","Master"})
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

	public String generatedString()
	{
		@SuppressWarnings("deprecation")
		String generateString = RandomStringUtils.randomAlphabetic(5);
		return generateString;
	}
	
	public String GeneratedNumber()
	{
		String genNumber = RandomStringUtils.randomNumeric(7);
		return genNumber;
	}
	
	@DataProvider(name="LoginData")
	public Object[][] testData()
	{
		return new Object[][] {
			{"subratsingh10091999@gmail.com","Password@321","Valid"},
			{"ygkyiyq@gmail.com","45wyer5@321","Invalid"},
			{"SUhlkWDHAD@gmail.com","536uily@321","Invalid"},
			{"wtuyiljhgfmv@gmail.com","987654r@xhlaH","Invalid"}
		};
	}
}
