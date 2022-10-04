package test.nopcom.pageobj; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.nopcom.base.NopCom_BaseClass;

public class HomePage extends NopCom_BaseClass 
{    
	WebDriver driver;
	// page factory init
	public HomePage(WebDriver driver)
	{ 
		
		this.driver=driver;
	   System.out.println("in HomePage Constructor");
	    PageFactory.initElements(driver,this);
	    
			
	}
	// page factory
	@FindBy(xpath="//img[@alt='nopCommerce demo store']")
	WebElement logo;       
	


	// action method
	public boolean validateLogo()
	{
		
		System.out.println("in validLogo method of HomePage");
		return logo.isDisplayed();
		

	}
	
	
}

	
	
