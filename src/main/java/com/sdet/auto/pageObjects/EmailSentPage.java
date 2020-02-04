package com.sdet.auto.pageObjects;

import com.sdet.auto.testHelper.LoggingLibrary;
import com.sdet.auto.testHelper.TestAssert;

import static com.sdet.auto.seleniumExtensions.WebDriverExtensions.getElementBySelector;


public class EmailSentPage  {

    private final static String txtMessage = "#content";

    public static void VerifyEmailSent(TestAssert testAssert, String expectedMsg){

        testAssert.setPass(LoggingLibrary.CompareResult(getElementBySelector(txtMessage).getText(), expectedMsg));
    }
}
