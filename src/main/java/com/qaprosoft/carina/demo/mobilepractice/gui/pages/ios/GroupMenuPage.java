package com.qaprosoft.carina.demo.mobilepractice.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobilepractice.gui.pages.common.GroupMenuPageBase;
import org.openqa.selenium.WebDriver;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = GroupMenuPageBase.class)
public class GroupMenuPage extends GroupMenuPageBase {

    @ExtendedFindBy(accessibilityId = "Done")
    private ExtendedWebElement doneButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeCollectionView")
    private List<ExtendedWebElement> groupList;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == 'Hide All Contacts'`]")
    private ExtendedWebElement hideAllContactsButton;

    public GroupMenuPage(WebDriver driver) {
        super(driver);
    }
}
