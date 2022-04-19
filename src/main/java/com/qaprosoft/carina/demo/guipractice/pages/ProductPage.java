package com.qaprosoft.carina.demo.guipractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ProductPage extends AbstractPage {

	@FindBy(xpath = "//*[@id = 'tbodyid']//a")
	private ExtendedWebElement addToCartButton;

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	public void clickaddToCartButton() {
		addToCartButton.click();
	}
}