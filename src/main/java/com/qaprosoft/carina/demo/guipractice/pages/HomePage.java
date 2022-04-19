package com.qaprosoft.carina.demo.guipractice.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.guipractice.components.NavigateMenu;
import com.qaprosoft.carina.demo.guipractice.components.Product;

public class HomePage extends AbstractPage {
	
	@FindBy(xpath = "//nav[@id = 'narvbarx']")
	private NavigateMenu navigateMenu;
	
	@FindBy(xpath = "//*[@id = 'tbodyid']")
	private List<Product> products;

	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
	}
	
	public ProductPage openProduct(String productString) {
		for (Product product : products) {
            String currentProduct = product.getTitle();
            if ((productString).equalsIgnoreCase(currentProduct)) {
                product.click();
                return new ProductPage(driver);
            }
        }
		throw new RuntimeException(productString);
	}
	
	public NavigateMenu getNavigateMenu() {
		return new NavigateMenu(driver);
	}

}
