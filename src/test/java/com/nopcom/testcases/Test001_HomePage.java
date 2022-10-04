package com.nopcom.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import test.nopcom.base.NopCom_BaseClass;
import test.nopcom.pageobj.HomePage;

public class Test001_HomePage extends NopCom_BaseClass
{   

	 	
	@BeforeClass
	void setup() 
	{
	  initialize();
	  System.out.println("Before class");
	}
	@Test
	void testLogo()  
	{
		 HomePage homepage=new HomePage(driver);
		 System.out.println(homepage.validateLogo());
		  Assert.assertTrue(homepage.validateLogo());
		
	}
	
	@AfterClass
	void tearDown()
	{
		
		driver.quit();
	}
	
	

    
}
