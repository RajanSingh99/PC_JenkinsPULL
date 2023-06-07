package org.DemoWorkshop.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {
	
	WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="add-to-cart-button-72")
	public WebElement addToCartButton;
	
	public void verifyButton() {
		Assert.assertTrue(addToCartButton.isDisplayed(), "Add to Cart Button not Displayed");
	}
}
