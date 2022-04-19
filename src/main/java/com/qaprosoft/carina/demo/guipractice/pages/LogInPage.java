package com.qaprosoft.carina.demo.guipractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class LogInPage extends AbstractPage {


	@FindBy(xpath = "//*[@id = 'loginusername']")
	private ExtendedWebElement loginUsernameField;
	
	@FindBy(xpath = "//*[@id = 'loginpassword']")
	private ExtendedWebElement loginPasswordField;
	
	@FindBy(xpath = "//*[@onclick = 'logIn()']")
	private ExtendedWebElement loginButton2;
	
	public LogInPage(WebDriver driver) {
		super(driver);
	}
	
	public void fillFields(String username, String password) {
        loginUsernameField.type(username);
        loginPasswordField.type(password);
    }
	
	public void acceptPurchase() {
    	loginButton2.click();
    }

}
