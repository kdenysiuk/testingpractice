package com.qaprosoft.carina.demo.guipractice.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.guipractice.pages.ProductPage;

public class Product extends AbstractUIObject {

	@FindBy(xpath = "//h4[@class = 'card-title']/a")
	private ExtendedWebElement productTitle;

	@FindBy(xpath = "//div[@class = 'card-block']/h5")
	private ExtendedWebElement productPrice;

	public Product(WebDriver driver) {
		super(driver);
	}

	public String getProductTitle() {
		return productTitle.getText();
	}

	public String getPrice() {
		return productPrice.getText();
	}

	public ProductPage clickProductTitle() {
		productTitle.click();
		return new ProductPage(driver);
	}

}