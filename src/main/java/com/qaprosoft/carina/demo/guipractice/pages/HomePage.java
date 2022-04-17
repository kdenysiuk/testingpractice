package com.qaprosoft.carina.demo.guipractice.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class HomePage extends AbstractPage {

	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
	}
	
	@FindBy(xpath = "//*(@id, 'tbodyid')")
	private List<ExtendedWebElement> products;
	
	public ProductPage openProduct(String productString) {
		for (ExtendedWebElement product : products) {
            String currentProduct = product.getText();
            if ((productString).equalsIgnoreCase(currentProduct)) {
                product.click();
                return new ProductPage(driver);
            }
        }
		throw new RuntimeException("Unable to open brand: " + productString);
	}

}
