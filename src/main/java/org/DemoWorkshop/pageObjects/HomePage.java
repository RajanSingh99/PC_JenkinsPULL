package org.DemoWorkshop.pageObjects;

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
	
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	public WebElement demoShopLogo;
	
	@FindBy(linkText="Register")
	WebElement registerLink;
	
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	@FindBy(xpath="(//*[text()='Shopping cart'])[1]")
	WebElement shoppingCartLink;

	@FindBy(xpath="(//*[text()='Wishlist'])[1]")
	WebElement wishlistLink;
	
	public void verifyItems() {
		Assert.assertTrue(demoShopLogo.isDisplayed(), "Demo shop Logo not displayed");
		Assert.assertTrue(registerLink.isDisplayed(), "register link not displayed");
		Assert.assertTrue(loginLink.isDisplayed(), "Login link not displayed");
		Assert.assertTrue(shoppingCartLink.isDisplayed(), "shopping cart link not displayed");
		Assert.assertTrue(wishlistLink.isDisplayed(), "wishlist link not displayed");
		
	}

}
