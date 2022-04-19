package com.qaprosoft.carina.demo.guipractice.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.guipractice.pages.CartPage;
import com.qaprosoft.carina.demo.guipractice.pages.LogInPage;
import com.qaprosoft.carina.demo.guipractice.pages.SignUpPage;

public class NavigateMenu extends AbstractUIObject {

	@FindBy(xpath = "//a[@id = 'login2']")
	private ExtendedWebElement loginButton;

	@FindBy(id = "//a[@id = 'signin2']")
	private ExtendedWebElement signinButton;

	@FindBy(id = "//a[@id = 'logout2']")
	private ExtendedWebElement logoutButton;

	@FindBy(id = "//a[@id = 'cartur']")
	private ExtendedWebElement cartButton;

	public NavigateMenu(WebDriver driver) {
		super(driver);
	}

	public LogInPage openLogIn() {
		loginButton.click();
		return new LogInPage(driver);
	}

	public SignUpPage openSignUp() {
		signinButton.click();
		return new SignUpPage(driver);
	}

	public void logOut() {
		logoutButton.click();
	}

	public CartPage openCart() {
		cartButton.click();
		return new CartPage(driver);
	}

}