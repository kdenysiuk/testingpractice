package com.qaprosoft.carina.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.guipractice.components.NavigateMenu;
import com.qaprosoft.carina.demo.guipractice.pages.HomePage;
import com.qaprosoft.carina.demo.guipractice.pages.SignUpPage;

public class WebSampleTest implements IAbstractTest{
	@Test()
	@MethodOwner(owner = "kdenysiuk")
	public void testSignIn() {
		//Open DemoBlaze homepage and verify
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "The page is not opened");
		
		//Open sign in label
		NavigateMenu navigateMenu = homePage.getNavigateMenu();
		Assert.assertTrue(navigateMenu.isUIObjectPresent(), "The navigate menu wasn't found.");
		Assert.assertTrue(navigateMenu.isSigninButtonPresent(), "The sign in button wasn't found.");
		SignUpPage signUpPage = navigateMenu.clickSigninButton();
		
		//Create an account
		signUpPage.fillUsernameField("KeithDenysiukgqqqqq");
		signUpPage.fillPasswordField("12345678");
		signUpPage.clickSigninButton();
	}

}
