package com.qaprosoft.carina.demo.mobilepractice.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobilepractice.gui.pages.common.AddContactPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AddContactPageBase.class)
public class AddContactPage extends AddContactPageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == 'First name'`]")
    private ExtendedWebElement firstNameField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == 'Last name'`]")
    private ExtendedWebElement lastNameField;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeTextField[`name == 'Company'`]")
    private ExtendedWebElement companyField;

    @ExtendedFindBy(accessibilityId = "Insert add phone")
    private ExtendedWebElement addPhoneButton;

    @ExtendedFindBy(accessibilityId = "Insert add email")
    private ExtendedWebElement addEmailButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == 'Add Photo'`]")
    private ExtendedWebElement addPhotoButton;

    @ExtendedFindBy(accessibilityId = "Cancel")
    private ExtendedWebElement cancelButton;

    @ExtendedFindBy(accessibilityId = "Done")
    private ExtendedWebElement doneButton;

    public AddContactPage(WebDriver driver) {
        super(driver);
    }
}
