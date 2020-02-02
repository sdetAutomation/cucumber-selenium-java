package com.sdet.auto.pageObjects;

import com.sdet.auto.testHelper.ConfigSettings;

import static com.sdet.auto.seleniumExtensions.WebDriverBase.driver;

public class Navigation {

    public static void navToWebPageUnderTest(){
        driver.navigate().to(ConfigSettings.getWebUrl());
    }
}
