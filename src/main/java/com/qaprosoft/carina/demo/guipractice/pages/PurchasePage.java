package com.qaprosoft.carina.demo.guipractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class PurchasePage extends AbstractPage {

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

	@FindBy(xpath = "//div[10]/h2")
	private ExtendedWebElement gratitudeLabel;

	public PurchasePage(WebDriver driver) {
		super(driver);
	}

	public void clickPurchaseButton() {
		purchaseButton.click();
	}

	public void fillNameField(String name) {
		nameField.type(name);
	}

	public void fillCountryField(String country) {
		countryField.type(country);
	}

	public void fillCityField(String city) {
		cityField.type(city);
	}

	public void fillCardField(String card) {
		cardField.type(card);
	}

	public void fillMonthField(String month) {
		monthField.type(month);
	}

	public void fillYearField(String year) {
		yearField.type(year);
	}

	public void clickOkButton() {
		okButton.click();
	}

	public boolean isGratitudeLabelPresent() {return gratitudeLabel.isPresent();}

}