package org.Manipal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	
	WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="nav-hamburger-menu")
	public WebElement hamburgerMenu;
	
	@FindBy(xpath="(//*[@data-menu-id='8'])[1]")
	public WebElement mobileComputerMenLbl;
	
	@FindBy(xpath="//*[text()='All Mobile Phones']")
	public WebElement allMobileLbl;
	
	public void menuNavigation() {
		hamburgerMenu.click();
		mobileComputerMenLbl.click();
		allMobileLbl.click();
	}

}
