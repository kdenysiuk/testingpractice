package com.qaprosoft.carina.demo.mobilepractice.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobilepractice.gui.pages.common.AddContactPageBase;
import com.qaprosoft.carina.demo.mobilepractice.gui.pages.common.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class AddContactPage extends AddContactPageBase {

    @FindBy(xpath = "//android.widget.EditText[@text = 'First name']")
    private ExtendedWebElement nameField;

    @FindBy(xpath = "//android.widget.EditText[@text = 'Last name']")
    private ExtendedWebElement lastNameField;

    @FindBy(xpath = "//android.widget.EditText[@text = 'Phone']")
    private ExtendedWebElement phoneField;

    @FindBy(xpath = "//android.widget.Spinner[@content-desc='Phone']")
    private ExtendedWebElement typePhoneField;

    @FindBy(id = "com.android.contacts:id/editor_menu_save_button")
    private ExtendedWebElement saveButton;

    @FindBy(id = "com.android.contacts:id/photo_icon")
    private ExtendedWebElement photoButton;

    @FindBy(xpath = "//android.widget.ImageButton")
    private ExtendedWebElement cancelButton;

    public AddContactPage(WebDriver driver) {
        super(driver);
    }
}
