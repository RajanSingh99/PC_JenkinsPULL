package org.DemoWorkShop.testCases;

import org.DemoWorkshop.base.BaseConfigurations;
import org.DemoWorkshop.pageObjects.ComputerMenu;
import org.DemoWorkshop.pageObjects.DesktopPage;
import org.DemoWorkshop.pageObjects.HomePage;
import org.DemoWorkshop.pageObjects.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase1 extends BaseConfigurations {
	
	HomePage homeObj;
	ComputerMenu computerObj;
	DesktopPage desktopObj;
	ProductPage productObj;
	WebDriver driver;
	
	@BeforeClass
	public void initialSetup() {
		driver = getDriver();
		homeObj = new HomePage(driver);
		computerObj = new ComputerMenu(driver);
		desktopObj = new DesktopPage(driver);
		productObj = new ProductPage(driver);
	}
	
	@Test
	public void scenario1() {
		homeObj.verifyItems();
		computerObj.menuNavigation();
		desktopObj.buttonClick();
		productObj.verifyButton();
	}
	
}
