package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class PracticeTesting extends AbstractPage {

	//constructor
	public PracticeTesting(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "signin2")
	private ExtendedWebElement signinButton;
	
	@FindBy(id = "sign-username")
	private ExtendedWebElement usernameField;
	
	@FindBy(id = "sign-password")
	private ExtendedWebElement signinPasswordField;
	
	@FindBy(className = "btn btn-primary")
	private ExtendedWebElement signinConfirmButton;
	
	@FindBy(id = "login2")
	private ExtendedWebElement loginButton;
	
	@FindBy(id = "loginusername")
	private ExtendedWebElement loginUsernameField;
	
	@FindBy(id = "loginpassword")
	private ExtendedWebElement loginPasswordField;
	
	@FindBy(className = "btn btn-primary")
	private ExtendedWebElement loginButton2;
	
	@FindBy(id = "logout2")
	private ExtendedWebElement logoutButton;
	
	@FindBy(className = "hrefch")
	private ExtendedWebElement productButton;
	
	void openProduct() {
		productButton.click();
	}
	
	@FindBy(className = "btn btn-success btn-lg")
	private ExtendedWebElement addToCartButton;
	
	@FindBy(id = "cartur")
	private ExtendedWebElement cartButton;
	
	void openCart() {
		cartButton.click();
	}
	
	@FindBy(className = "btn btn-success")
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
	
	@FindBy(className = "btn btn-primary")
	private ExtendedWebElement purchaseButton;
	
	@FindBy(className = "confirm btn btn-lg btn-primary")
	private ExtendedWebElement okButton;
	
	
}
