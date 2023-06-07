package org.DemoWorkshop.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerMenu {
	WebDriver driver;
	Actions act;
	public ComputerMenu(WebDriver driver) {
		this.driver=driver;
		this.act = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@href='/computers'])[1]")
	public WebElement computersMenuLbl;
	
	@FindBy(xpath = "(//*[@href='/desktops'])[1]")
	public WebElement desktopSubmMenuLbl;
	
	public void menuNavigation() {
		
		act.moveToElement(computersMenuLbl).build().perform();
		desktopSubmMenuLbl.click();
	}
	
}
