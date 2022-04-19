package com.qaprosoft.carina.demo.guipractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class SignUpPage extends AbstractPage {

	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id = 'sign-username']")
	private ExtendedWebElement usernameField;
	
	@FindBy(xpath = "//*[@id = 'sign-password']")
	private ExtendedWebElement signinPasswordField;
	
	@FindBy(xpath = "//*[@onclick = 'register()']")
	private ExtendedWebElement signinConfirmButton;

}
