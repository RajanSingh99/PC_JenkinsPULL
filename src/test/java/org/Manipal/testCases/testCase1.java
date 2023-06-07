package org.Manipal.testCases;

import org.Manipal.base.BaseConfiguartions;
import org.Manipal.pageObjects.HomePage;
import org.Manipal.pageObjects.MenuPage;
import org.Manipal.pageObjects.MobilePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCase1 extends BaseConfiguartions {
	
	public HomePage homeObj;
	public MenuPage menuObj;
	public MobilePage mobileObj;
	WebDriver driver;
	
	@BeforeClass
	public void initialSetup() {
		driver = getDriver();
		homeObj = new HomePage(driver);
		menuObj = new MenuPage(driver);
		mobileObj = new MobilePage(driver);
	}
	
	@Test
	public void scenario1() {
		homeObj.verifyHomeLaunchSuccess();
		menuObj.menuNavigation();
		mobileObj.verifyLabel();
	}
	
}
