package com.sdet.auto.pageObjects;

import static com.sdet.auto.seleniumExtensions.WebDriverExtensions.getElementBySelector;

public class ForgetPasswordPage {

    private final static String txtEmail = "#email";
    private final static String btnRetrievePassword = ".icon-2x.icon-signin";

    public static void EnterEmail(String email){

        getElementBySelector(txtEmail).sendKeys(email);
    }

    public static void ClickRetrieveButton(){

        getElementBySelector(btnRetrievePassword).click();
    }
}
