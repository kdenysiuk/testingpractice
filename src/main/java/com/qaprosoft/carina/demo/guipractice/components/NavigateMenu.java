package com.qaprosoft.carina.demo.guipractice.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.guipractice.pages.CartPage;
import com.qaprosoft.carina.demo.guipractice.pages.ContactPage;
import com.qaprosoft.carina.demo.guipractice.pages.LogInPage;
import com.qaprosoft.carina.demo.guipractice.pages.SignUpPage;

public class NavigateMenu extends AbstractUIObject {

	@FindBy(xpath = "//a[@id = 'login2']")
	private ExtendedWebElement loginButton;

	@FindBy(xpath = "//a[@id = 'signin2']")
	private ExtendedWebElement signinButton;

	@FindBy(xpath = "//a[@id = 'logout2']")
	private ExtendedWebElement logoutButton;

	@FindBy(xpath = "//a[@id = 'cartur']")
	private ExtendedWebElement cartButton;

	@FindBy(xpath = "//a[@id = 'nameofuser']")
	private ExtendedWebElement welcomeLabel;

	@FindBy(xpath = "//a[@data-target = '#exampleModal']")
	private ExtendedWebElement contactButton;

	public NavigateMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public LogInPage clickLogInButton() {
		loginButton.click();
		return new LogInPage(driver);
	}

	public SignUpPage clickSigninButton() {
		signinButton.click();
		return new SignUpPage(driver);
	}

	public void clickLogoutButton() {
		logoutButton.click();
	}

	public CartPage clickCartButton() {
		cartButton.click();
		return new CartPage(driver);
	}

	public Boolean isLoginButtonPresent() {
		return loginButton.isPresent();
	}

	public Boolean isSigninButtonPresent() {
		return signinButton.isPresent();
	}

	public Boolean isLogoutButtonPresent() {
		return logoutButton.isPresent();
	}

	public Boolean isLogoutButtonClickable() {
		return logoutButton.isClickable();
	}

	public Boolean isWelcomeLabelPresent() {
		return welcomeLabel.isPresent();
	}

	public ContactPage clickContactButton() {
		contactButton.click();
		return new ContactPage(driver);
	}

}