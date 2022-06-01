package com.qaprosoft.carina.demo.mobilepractice.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobilepractice.gui.pages.common.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(id = "android:id/list")
    private ExtendedWebElement contactList;

    @FindBy(id = "com.android.contacts:id/toolbar")
    private ExtendedWebElement navigateMenu;

    @FindBy(id = "com.android.contacts:id/floating_action_button")
    private ExtendedWebElement addContactButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private ExtendedWebElement hamburgerMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

}
