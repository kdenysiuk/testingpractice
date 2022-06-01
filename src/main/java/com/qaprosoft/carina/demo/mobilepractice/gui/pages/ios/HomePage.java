package com.qaprosoft.carina.demo.mobilepractice.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobilepractice.gui.pages.common.HomePageBase;
import org.openqa.selenium.WebDriver;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeCell")
    private List<ExtendedWebElement> contactList;

    @ExtendedFindBy (iosClassChain = "**/XCUIElementTypeNavigationBar[`name == 'Contacts'`]")
    private ExtendedWebElement navigateMenu;

    @ExtendedFindBy (iosClassChain = "**/XCUIElementTypeButton[`label == 'Add'`]")
    private ExtendedWebElement addContactButton;

    @ExtendedFindBy (iosClassChain = "**/XCUIElementTypeButton[`label == 'Groups'`]")
    private ExtendedWebElement groupsMenuButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeSearchField[`label == 'Search'`]")
    private ExtendedWebElement searchField;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
