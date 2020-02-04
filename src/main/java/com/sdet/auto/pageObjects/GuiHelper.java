package com.sdet.auto.pageObjects;

import com.sdet.auto.seleniumExtensions.WebDriverBase;
import com.sdet.auto.testHelper.ConfigSettings;
import org.openqa.selenium.WebDriver;

import static com.sdet.auto.seleniumExtensions.WebDriverBase.*;

public class GuiHelper {

    public static void openWebBrowser(){
        getWebDriver(ConfigSettings.getWebBrowser());
    }

    public static void closeWebBrowser(){
        driver.close();
        driver.quit();
    }
}