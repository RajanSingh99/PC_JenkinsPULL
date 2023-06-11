package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;


public class Prac {

	 WebDriver driver;
	 String nodeURL;
	    
	    
	    public WebDriver setUp(String Port) throws MalformedURLException
	    {     
	        if(Port.equalsIgnoreCase("5555"))
	        {
	            nodeURL = "http://192.168.1.206:4444/wd/hub";
	            System.out.println("Chrome Browser Initiated");
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();            
	            capabilities.setBrowserName("chrome");
	            capabilities.setPlatform(Platform.WINDOWS);
	            
	            driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
	            
	            driver.get("https://demowebshop.tricentis.com/");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
	        
	        else
	            if(Port.equalsIgnoreCase("6666"))
	            {
	                nodeURL = "http://192.168.1.206:4444/wd/hub";
	                System.out.println("Microsoft Edge Browser Initiated");
	                DesiredCapabilities capabilities1 = DesiredCapabilities.firefox();
	                capabilities1.setBrowserName("MicrosoftEdge");
	                capabilities1.setPlatform(Platform.WINDOWS);
	                
	                driver = new RemoteWebDriver(new URL(nodeURL),capabilities1);   
	                
	                driver.get("https://demowebshop.tricentis.com/");
	                driver.manage().window().maximize();
	                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            }
	        
	       return driver;
	    }
	    
//	    public void appleSite() throws InterruptedException
//	    {
//	        try
//	        {
//	        
//	        driver.findElement(By.xpath("//*[@id=\'ac-globalnav\']/div/ul[2]/li[3]")).click();
//	        Thread.sleep(2000);
//
//	        driver.findElement(By.cssSelector("#chapternav > div > ul > li.chapternav-item.chapternav-item-ipad-air > a > figure")).click();
//	        Thread.sleep(2000);
//
//	        driver.findElement(By.linkText("Why iPad")).click();
//	        Thread.sleep(2000);
//	        }
//	        
//	        catch(Exception e)
//	        {
//	            System.out.println(e.getMessage());
//	        }
//	    }

	    
	}
