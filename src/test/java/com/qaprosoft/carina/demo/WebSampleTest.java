package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.guipractice.components.ProductInCart;
import com.qaprosoft.carina.demo.guipractice.pages.*;
import com.qaprosoft.carina.demo.utils.AuthService;
import com.qaprosoft.carina.demo.utils.ScreenshotService;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.guipractice.components.NavigateMenu;

import java.util.Random;

public class WebSampleTest implements IAbstractTest {
	@Test()
	@MethodOwner(owner = "kdenysiuk")
	public void testSignUp() {
		//Open DemoBlaze homepage and verify
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "The page is not opened");

		//Open signup label
		NavigateMenu navigateMenu = homePage.getNavigateMenu();
		Assert.assertTrue(navigateMenu.isUIObjectPresent(), "The navigate menu wasn't found.");
		Assert.assertTrue(navigateMenu.isSigninButtonPresent(), "The sign in button wasn't found.");
		SignUpPage signUpPage = navigateMenu.clickSigninButton();

		//Create an account
		signUpPage.fillUsernameField(R.TESTDATA.get("user_profile") + new Random().nextInt());
		signUpPage.fillPasswordField(R.TESTDATA.get("user_password"));
		signUpPage.clickSigninButton();

		//Assert of alert label
		Assert.assertEquals(getDriver().switchTo().alert().getText(), "Sign up successful.", "Alert is wrong");
		new ScreenshotService().makeAnScreenshot();
		getDriver().switchTo().alert().accept();
	}

	@Test
	@MethodOwner(owner = "kdenysiuk")
	public void testLogInAndLogOut() {
		//Open DemoBlaze homepage and verify
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "The page is not opened");

		//Open login label
		NavigateMenu navigateMenu = homePage.getNavigateMenu();
		Assert.assertTrue(navigateMenu.isUIObjectPresent(), "The navigate menu wasn't found.");
		Assert.assertTrue(navigateMenu.isLoginButtonPresent(), "The login button wasn't found.");
		LogInPage logInPage = navigateMenu.clickLogInButton();

		//Log in
		logInPage.fillUsernameField(R.TESTDATA.get("user_profile"));
		logInPage.fillPasswordField(R.TESTDATA.get("user_password"));
		logInPage.clickLoginButton();

		//Assert "Welcome" label and "Log out" button
		Assert.assertTrue(navigateMenu.isWelcomeLabelPresent(), "The welcome label is not present.");
		Assert.assertTrue(navigateMenu.isLogoutButtonPresent(), "The log out button is not present.");
		//the next statement was added because without it, the test crashes saying "log out button is not clickable"
		Assert.assertTrue(navigateMenu.isLogoutButtonClickable(), "The log out button is not clickable.");

		//Log out
		navigateMenu.clickLogoutButton();
		new ScreenshotService().makeAnScreenshot();
		Assert.assertTrue(navigateMenu.isLoginButtonPresent(), "The log in button is not present.");
	}

	@Test
	@MethodOwner(owner = "kdenysiuk")
	public void testDoAPurchase() {
		//Log in
		new AuthService().login(R.TESTDATA.get("user_profile"), R.TESTDATA.get("user_password"));

		//Select Product
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		ProductPage productPage = homePage.clickProduct("Samsung galaxy s6");
		//Verify specifications
		Assert.assertEquals(productPage.getProductTitle(), "Samsung galaxy s6", "Incorrect Specification");
		Assert.assertEquals(productPage.getProductPrice(), "$360 *includes tax", "Incorrect Specification");
		Assert.assertEquals(productPage.getProductDescription(), "The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded.", "Incorrect Specification");
		//Add to cart
		Assert.assertTrue(productPage.isPresentAddToCartButton(), "The \"Add To Cart\" is not present.");
		productPage.clickAddToCartButton();
		Assert.assertEquals(getDriver().switchTo().alert().getText(), "Product added.", "Alert is wrong");
		getDriver().switchTo().alert().accept();

		//Go to cart
		pause(2);
		CartPage cartPage = productPage.clickCartButton();
		//Verify info
		ProductInCart productInCart = cartPage.getProductInCart("Samsung galaxy s6");
		Assert.assertEquals(productInCart.getProductTitle(), "Samsung galaxy s6", "Incorrect Specification");
		Assert.assertEquals(productInCart.getProductPrice(), "360", "Incorrect Specification");
		//Place order
		Assert.assertTrue(cartPage.isPlaceOrderButtonPresent(), "The Place Order Button wasn't found.");
		PurchasePage purchasePage = cartPage.clickPlaceOrderButton();

		//Fill de fields
		purchasePage.fillNameField(R.TESTDATA.get("user_name"));
		purchasePage.fillCountryField(R.TESTDATA.get("user_country"));
		purchasePage.fillCityField(R.TESTDATA.get("user_city"));
		purchasePage.fillCardField(R.TESTDATA.get("user_card"));
		purchasePage.fillMonthField(R.TESTDATA.get("user_month"));
		purchasePage.fillYearField(R.TESTDATA.get("user_year"));
		purchasePage.clickPurchaseButton();
		new ScreenshotService().makeAnScreenshot();
		Assert.assertTrue(purchasePage.isGratitudeLabelPresent(), "The purchase wasn't completed");
		purchasePage.clickOkButton();
		Assert.assertTrue(homePage.isPageOpened(), "The page is not opened");
	}

}
