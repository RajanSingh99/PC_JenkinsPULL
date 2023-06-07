package org.Manipal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-link-accountList")
	public WebElement signInButton;
	
	
	public void verifyHomeLaunchSuccess() {
		signInButton.isDisplayed();
		Assert.assertTrue(signInButton.isDisplayed(), "Sign in Button is not Displayed");
	}

}
