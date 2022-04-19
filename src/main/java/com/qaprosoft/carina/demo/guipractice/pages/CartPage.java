package com.qaprosoft.carina.demo.guipractice.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.guipractice.components.ProductInCart;

public class CartPage extends AbstractPage {

	@FindBy(xpath = "//*[@id = 'tbodyid']")
	private List<ProductInCart> products;

	@FindBy(xpath = "//button[@class = 'btn btn-success']")
	private ExtendedWebElement placeOrderButton;

	public CartPage(WebDriver driver) {
		super(driver);
	}

	public PurchasePage clickPlaceOrderButton() {
		placeOrderButton.click();
		return new PurchasePage(driver);
	}

}