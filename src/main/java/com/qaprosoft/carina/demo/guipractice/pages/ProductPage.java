package com.qaprosoft.carina.demo.guipractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ProductPage extends AbstractPage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class = 'btn btn-success btn-lgn']")
	private ExtendedWebElement addToCartButton;
	
}


