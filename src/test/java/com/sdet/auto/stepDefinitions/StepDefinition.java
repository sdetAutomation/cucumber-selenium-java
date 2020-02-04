package com.sdet.auto.stepDefinitions;

import com.sdet.auto.pageObjects.*;
import cucumber.api.java.en.*;

import static com.sdet.auto.stepDefinitions.Hooks.testAssert;

public class StepDefinition {

    @Given("^User clicks forget password link$")
    public void user_clicks_forget_password_link() {
        HomePage.ClickForgetPassword();
    }

    @And("^Enters email \"([^\"]*)\" and clicks retrieve button$")
    public void enters_email_and_clicks_retrieve_button(String email) {
        ForgetPasswordPage.EnterEmail(email);
        ForgetPasswordPage.ClickRetrieveButton();
    }

    @Then("^Verify email is sent message \"([^\"]*)\" is displayed$")
    public void verify_email_is_sent_message_is_displayed(String expectedMsg) {
        EmailSentPage.VerifyEmailSent(testAssert, expectedMsg);
    }

    @Given("^User clicks form authentication link$")
    public void user_clicks_form_authentication_link()  {
        HomePage.clickFormAuthentication();
    }

    @Given("^Enters userid \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enters_userid_and_password(String userId, String password) {
        LoginPage.enterCredentials(userId, password);
    }

    @Then("^Verify SecureAreaPage message \"([^\"]*)\" is displayed$")
    public void verify_SecureAreaPage_message_is_displayed(String expectedMsg) {
        SecureAreaPage.verifyMessage(testAssert, expectedMsg);
    }

    @Then("^Verify LoginPage message \"([^\"]*)\" is displayed$")
    public void verify_LoginPage_message_is_displayed(String expectedMsg) {
        LoginPage.verifyMessage(testAssert, expectedMsg);
    }

    @Then("^User clicks logout button$")
    public void user_clicks_logout_button() {
        SecureAreaPage.clickLogoutButton();
    }
}
