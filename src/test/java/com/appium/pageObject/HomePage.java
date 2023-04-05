package com.appium.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.base.BaseTClass;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BaseTClass {

    public static AppiumDriver appiumDriver;
    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Home')]")
    MobileElement asrtHome;

    public void assertHomePage() {
        asrtHome.isDisplayed();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Team\"]/android.view.View/android.view.View/android.view.View")
    List<MobileElement> clTeam;

    public void clickTeam(int index) {
        clTeam.get(index).click();
    }
}
