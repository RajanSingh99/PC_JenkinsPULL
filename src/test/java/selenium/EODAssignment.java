package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EODAssignment {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91983\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		System.out.println(driver.findElement(By.xpath("(//*[text()='Sign in'])[1]")).isDisplayed());
		driver.findElement(By.xpath("//*[@aria-label='Open Menu']")).click();
		driver.findElement(By.xpath("(//*[@data-menu-id= '8'])[1]")).click();
		driver.findElement(By.linkText("All Mobile Phones")).click();
		System.out.println(driver.findElement(By.xpath("(//*[text()='Mobiles & Accessories'])[3]")).isDisplayed());
	}

}
