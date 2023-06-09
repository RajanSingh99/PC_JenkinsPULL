package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Class2 {
	 @Test
	    public void scenario2() throws MalformedURLException
	    {
	        DesiredCapabilities dc=new DesiredCapabilities();
	        dc.setBrowserName("MicrosoftEdge");
	       
	        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.204:4444"), dc);
	        driver.get("https://www.google.com");
	       
	       
	    }
}
