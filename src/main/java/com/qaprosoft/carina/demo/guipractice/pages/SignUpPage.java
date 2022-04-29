package com.qaprosoft.carina.demo.guipractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class SignUpPage extends AbstractPage {

	@FindBy(xpath = "//*[@id = 'sign-username']")
	private ExtendedWebElement usernameField;

	@FindBy(xpath = "//*[@id = 'sign-password']")
	private ExtendedWebElement passwordField;

	@FindBy(xpath = "//*[@onclick = 'register()']")
	private ExtendedWebElement signinButton;

	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	public void fillUsernameField(String username) {
		usernameField.type(username);
	}

	public void fillPasswordField(String password) {
		passwordField.type(password);
	}

	public void clickSigninButton() {
		signinButton.click();
	}

}
