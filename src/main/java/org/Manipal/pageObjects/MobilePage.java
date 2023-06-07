package org.Manipal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MobilePage {
WebDriver driver;
	
	public MobilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@aria-label='Mobiles & Accessories']/span[1]")
	 public WebElement allMobilePhonesLbl;
	
	public void verifyLabel() {
		Assert.assertEquals(allMobilePhonesLbl.isDisplayed(), true);
	}
}
