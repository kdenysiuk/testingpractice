package com.qaprosoft.carina.demo.guipractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ProductPage extends AbstractPage {

	@FindBy(xpath = "//*[@id = 'tbodyid']//a")
	private ExtendedWebElement addToCartButton;

	@FindBy(xpath = "//div[@id = 'tbodyid']/h2")
	private ExtendedWebElement productTitle;

	@FindBy(xpath = "//div[@id = 'tbodyid']/h3")
	private ExtendedWebElement productPrice;

	@FindBy(xpath = "//div[@id = 'tbodyid']//div//div/p")
	private ExtendedWebElement productDescription;

	@FindBy(xpath = "//a[@id = 'cartur']")
	private ExtendedWebElement cartButton;

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	public boolean isPresentAddToCartButton() { return addToCartButton.isPresent(); }

	public void clickAddToCartButton() {
		addToCartButton.click();
	}

	public String getProductTitle() {
		return productTitle.getText();
	}

	public String getProductPrice() {
		return productPrice.getText();
	}

	public String getProductDescription() {
		return productDescription.getText();
	}

	public CartPage clickCartButton() {
		cartButton.click();
		return new CartPage(driver);
	}

}