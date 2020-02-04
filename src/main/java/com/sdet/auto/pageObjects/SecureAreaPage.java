package com.sdet.auto.pageObjects;

import com.sdet.auto.testHelper.LoggingLibrary;
import com.sdet.auto.testHelper.TestAssert;

import static com.sdet.auto.seleniumExtensions.WebDriverExtensions.getElementBySelector;

public class SecureAreaPage {

    private final static String lblMessage = "#flash";
    private final static String btnLogout = ".icon-2x.icon-signout";

    public static void verifyMessage(TestAssert testAssert, String expectedMsg){

        testAssert.setPass(LoggingLibrary.CompareResultContains(getElementBySelector(lblMessage).getText(), expectedMsg));
    }

    public static void clickLogoutButton(){

        getElementBySelector(btnLogout).click();
    }
}
