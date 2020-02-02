package com.sdet.auto.stepDefinitions;

import cucumber.api.java.en.*;

public class Background {

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("00a-validate_the_browser executed");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("00b-browser_is_triggered executed");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_stared() throws Throwable {
        System.out.println("00c-check_if_browser_is_stared executed");
    }

}
