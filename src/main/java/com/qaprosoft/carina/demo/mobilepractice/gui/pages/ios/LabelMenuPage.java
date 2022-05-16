package com.qaprosoft.carina.demo.mobilepractice.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobilepractice.gui.pages.common.LabelMenuPageBase;
import org.openqa.selenium.WebDriver;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LabelMenuPageBase.class)
public class LabelMenuPage extends LabelMenuPageBase {

    @ExtendedFindBy(accessibilityId = "Done")
    private ExtendedWebElement doneButton;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeCollectionView")
    private List<ExtendedWebElement> groupList;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == 'Hide All Contacts'`]")
    private ExtendedWebElement hideAllContactsButton;

    public LabelMenuPage(WebDriver driver) {
        super(driver);
    }
}
