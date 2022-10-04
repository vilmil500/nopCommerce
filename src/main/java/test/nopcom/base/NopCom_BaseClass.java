package test.nopcom.base;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCom_BaseClass 
   {
	 public WebDriver driver;
	 public ResourceBundle rb;
	 
	 public NopCom_BaseClass()
	{
	  System.out.println("in super constructor");
	
	/*FileInputStream fis=new FileInputStream(System.getProperty("user.dir"+"\\resources\\config.properties"));
		Properties prop=new Properties();
		prop.load(fis);

		String browser = prop.getProperty("browsername");  
		*/
		//Approach 2
		
	
		 rb=ResourceBundle.getBundle("config");
		
		
		
		
	}
		public void initialize()
		{
			String browser=rb.getString("browsername");
			String url=rb.getString("url");
		System.out.println(url);
		if(browser.equals("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtompe\\Desktop\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get(url);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 driver.get(url);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
		}else if(browser.equals("firefox"))
		{
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 driver.get(url);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
		}
		}
	}

