package com.qaprosoft.carina.demo.guipractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class CartPage extends AbstractPage {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath  = "//div[@class = 'btn btn-success']")
	private ExtendedWebElement placeOrderButton;
	
	@FindBy(id = "name")
	private ExtendedWebElement nameField;
	
	@FindBy(id = "country")
	private ExtendedWebElement countryField;
	
	@FindBy(id = "city")
	private ExtendedWebElement cityField;
	
	@FindBy(id = "card")
	private ExtendedWebElement cardField;
	
	@FindBy(id = "month")
	private ExtendedWebElement monthField;
	
	@FindBy(id = "year")
	private ExtendedWebElement yearField;
	
	@FindBy(xpath = "//div[@class = 'btn btn-primary']")
	private ExtendedWebElement purchaseButton;
	
	@FindBy(xpath = "//div[@class = 'confirm btn btn-lg btn-primary']")
	private ExtendedWebElement okButton;
}
