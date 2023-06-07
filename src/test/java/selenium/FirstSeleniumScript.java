package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91983\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.calculator.net/calorie-calculator.html");
		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys("75");
    	Select activity = new Select(driver.findElement(By.id("cactivity")));
    	activity.selectByIndex(6);
//		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
//		driver.findElement(By.name("login")).click();
		
	}

}
