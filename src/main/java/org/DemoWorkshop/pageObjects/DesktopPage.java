package org.DemoWorkshop.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage {
	WebDriver driver;
	public DesktopPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@value='Add to cart'])[1]")
	public WebElement addToCartButton;
	
	public void buttonClick() {
		addToCartButton.click();
	}
}
