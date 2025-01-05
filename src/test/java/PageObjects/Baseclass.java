package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Baseclass {
 WebDriver driver;
public Baseclass(WebDriver driver)
{this.driver=driver;
PageFactory.initElements(driver, this);	
}
}
