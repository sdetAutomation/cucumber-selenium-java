package com.sdet.auto.stepDefinitions;

import com.sdet.auto.pageObjects.GuiHelper;
import com.sdet.auto.pageObjects.HomePage;
import com.sdet.auto.pageObjects.Navigation;
import cucumber.api.java.en.*;

import static com.sdet.auto.stepDefinitions.Hooks.testAssert;

public class Background {

    @Given("^Browser is opened$")
    public void browser_is_opened() {
        GuiHelper.openWebBrowser();
    }

    @Then("^Navigate to the Heroku landing page$")
    public void navigate_to_the_Heroku_landing_page()  {
        Navigation.navToWebPageUnderTest();
    }

    @Then("^Check if page is ready$")
    public void check_if_page_is_ready() {
        HomePage.VerifyOnHomePage(testAssert);
    }
}
