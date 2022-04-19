package com.qaprosoft.carina.demo.guipractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class PurchasePage extends AbstractPage {

	public PurchasePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id = 'name']")
	private ExtendedWebElement nameField;
	
	@FindBy(xpath = "//*[@id = 'country']")
	private ExtendedWebElement countryField;
	
	@FindBy(xpath = "//*[@id = 'city']")
	private ExtendedWebElement cityField;
	
	@FindBy(xpath = "//*[@id = 'card']")
	private ExtendedWebElement cardField;
	
	@FindBy(xpath = "//*[@id = 'month']")
	private ExtendedWebElement monthField;
	
	@FindBy(xpath = "//*[@id = 'year']")
	private ExtendedWebElement yearField;
	
	@FindBy(xpath = "//*[@onclick = 'purchaseOrder()']")
	private ExtendedWebElement purchaseButton;
	
	@FindBy(xpath = "//*[@class = 'confirm btn btn-lg btn-primary']")
	private ExtendedWebElement okButton;
	
    public void confirmPurchase() {
    	purchaseButton.click();
    }
    
	public void fillFields(String name, String country, String city, String card, String month, String year) {
        nameField.type(name);
        countryField.type(country);
        cityField.type(city);
        cardField.type(card);
        monthField.type(month);
        yearField.type(year);
    }
	
	public void acceptPurchase() {
    	okButton.click();
    }

}
