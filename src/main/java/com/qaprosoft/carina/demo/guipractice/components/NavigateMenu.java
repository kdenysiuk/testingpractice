package com.qaprosoft.carina.demo.guipractice.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.guipractice.pages.CartPage;

public class NavigateMenu extends AbstractUIObject {

	public NavigateMenu(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "signin2")
	private ExtendedWebElement signinButton;
	
	@FindBy(id = "sign-username")
	private ExtendedWebElement usernameField;
	
	@FindBy(id = "sign-password")
	private ExtendedWebElement signinPasswordField;
	
	@FindBy(xpath = "//div[@class = 'btn btn-primary']")
	private ExtendedWebElement signinConfirmButton;
	
	@FindBy(id = "login2")
	private ExtendedWebElement loginButton;
	
	@FindBy(id = "loginusername")
	private ExtendedWebElement loginUsernameField;
	
	@FindBy(id = "loginpassword")
	private ExtendedWebElement loginPasswordField;
	
	@FindBy(xpath = "//div[@class = 'btn btn-primary']")
	private ExtendedWebElement loginButton2;
	
	@FindBy(id = "logout2")
	private ExtendedWebElement logoutButton;
	
	@FindBy(id = "cartur")
	private ExtendedWebElement cartButton;
	
	public CartPage openCart() {
		cartButton.click();
		return new CartPage(driver);
	}

}
