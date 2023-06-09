package org.DemoWorkShop.testCases;

import java.net.MalformedURLException;

//import org.DemoWorkshop.base.BaseConfigurations;
import org.DemoWorkshop.pageObjects.ComputerMenu;
import org.DemoWorkshop.pageObjects.DesktopPage;
import org.DemoWorkshop.pageObjects.HomePage;
import org.DemoWorkshop.pageObjects.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Grid.Prac2;

public class TestCase1 extends Prac2 {
	
	HomePage homeObj;
	ComputerMenu computerObj;
	DesktopPage desktopObj;
	ProductPage productObj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void initialSetup(String Port) throws MalformedURLException {
		driver = setUp(Port);
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
