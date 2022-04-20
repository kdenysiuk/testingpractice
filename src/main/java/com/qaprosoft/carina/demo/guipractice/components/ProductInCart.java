package com.qaprosoft.carina.demo.guipractice.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class ProductInCart extends AbstractUIObject {

	@FindBy(xpath = "//tbody[@id='tbodyid']/tr/td[2]")
	private ExtendedWebElement productTitle;

	@FindBy(xpath = "//tbody[@id='tbodyid']/tr/td[3]")
	private ExtendedWebElement productPrice;

	@FindBy(xpath = "//tbody[@id='tbodyid']/tr/td/a")
	private ExtendedWebElement deleteButton;

	public ProductInCart(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public String getProductTitle() {
		return productTitle.getText();
	}

	public String getProductPrice() {
		return productPrice.getText();
	}

	public void clickDeleteButton() {
		deleteButton.click();
	}
}
