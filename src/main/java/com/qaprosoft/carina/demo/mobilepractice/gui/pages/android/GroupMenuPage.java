package com.qaprosoft.carina.demo.mobilepractice.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobilepractice.gui.pages.common.GroupMenuPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GroupMenuPageBase.class)
public class GroupMenuPage extends GroupMenuPageBase {

    @FindBy(id = "android:id/list")
    private ExtendedWebElement labelList;

    @FindBy(id = "com.android.contacts:id/nav_create_label")
    private ExtendedWebElement createLabelButton;

    @FindBy(id = "com.android.contacts:id/nav_settings")
    private ExtendedWebElement settingsButton;

    public GroupMenuPage(WebDriver driver) {
        super(driver);
    }
}
