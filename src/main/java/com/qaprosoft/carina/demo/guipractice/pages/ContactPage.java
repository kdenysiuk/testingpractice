package com.qaprosoft.carina.demo.guipractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ContactPage extends AbstractPage {

	@FindBy(xpath = "//input[@id = 'recipient-email']")
	private ExtendedWebElement emailField;

	@FindBy(xpath = "//input[@id = 'recipient-name']")
	private ExtendedWebElement nameField;

	@FindBy(xpath = "//textarea[@id = 'message-text']")
	private ExtendedWebElement messageField;

	@FindBy(xpath = "//button[@onclick = 'send()']")
	private ExtendedWebElement sendMessageButton;

	public ContactPage(WebDriver driver) {
		super(driver);
	}

	public void fillEmailField(String email) {
		emailField.type(email);
	}

	public void fillNameField(String name) {
		nameField.type(name);
	}

	public void fillMessageField(String message) {
		messageField.type(message);
	}

	public void clickSendMessageButton() {
		sendMessageButton.click();
	}

}
