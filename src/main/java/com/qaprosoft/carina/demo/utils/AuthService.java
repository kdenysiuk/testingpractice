package com.qaprosoft.carina.demo.utils;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.qaprosoft.carina.demo.guipractice.components.NavigateMenu;
import com.qaprosoft.carina.demo.guipractice.pages.HomePage;
import com.qaprosoft.carina.demo.guipractice.pages.LogInPage;
import com.qaprosoft.carina.demo.guipractice.pages.SignUpPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.Random;

public class AuthService implements IDriverPool {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public void login(String username, String password) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        NavigateMenu navigateMenu = homePage.getNavigateMenu();
        LogInPage logInPage = navigateMenu.clickLogInButton();
        logInPage.fillUsernameField(username);
        logInPage.fillPasswordField(password);
        logInPage.clickLoginButton();
    }

    public void signup(String username, String password) {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        NavigateMenu navigateMenu = homePage.getNavigateMenu();
        SignUpPage signUpPage = navigateMenu.clickSigninButton();
        signUpPage.fillUsernameField(username);
        signUpPage.fillPasswordField(password);
        signUpPage.clickSigninButton();
        getDriver().switchTo().alert().accept();
    }

    public void signup() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        NavigateMenu navigateMenu = homePage.getNavigateMenu();
        SignUpPage signUpPage = navigateMenu.clickSigninButton();
        signUpPage.fillUsernameField(R.TESTDATA.get("user_profile") + new Random().nextInt());
        signUpPage.fillPasswordField(R.TESTDATA.get("user_password"));
        signUpPage.clickSigninButton();
        getDriver().switchTo().alert().accept();
    }
}
