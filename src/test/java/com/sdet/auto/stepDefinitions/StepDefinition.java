package com.sdet.auto.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import java.util.List;

public class StepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() {
        System.out.println("01-This is user_is_on_landing_page method executed");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_and(String arg1, String arg2) {
        if(arg1.equals("test_user")){
//            throw new Exception("FAIL: throw exception");
            System.out.println("02a-good_user_login_into_application_with_and user: " + arg1 + "| password: " + arg2);
        } else if (arg1.equals("bad_user")) {
            System.out.println("02b-bad_user_login_into_application_with_and user: " + arg1 + "| password: " + arg2);
        } else {
            System.out.println("02c-no_user_info_was_passed_in");
        }
    }

    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) {
        // convert from datatable to list
        List<List<String>> obj = data.raw();
        // first get() is row number, 2nd get() is column number
        System.out.println("02-user_sign_up_with_following_details arg: " + obj.get(0).get(0));
        System.out.println("02-user_sign_up_with_following_details arg: " + obj.get(0).get(1));
        System.out.println("02-user_sign_up_with_following_details arg: " + obj.get(0).get(2));
        System.out.println("02-user_sign_up_with_following_details arg: " + obj.get(0).get(3));
        System.out.println("02-user_sign_up_with_following_details arg: " + obj.get(0).get(4));
    }

    @When("^User login into application with user(.+) and pass(.+)$")
    public void user_login_into_application_with_user_and_pass(int arg1, int arg2) {
        System.out.println("02-user_login_into_application_with_user_and_pass user: " + arg1 + "| password: " + arg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("03-This is home_page_is_populated method executed");
    }

    @Then("^Cards displayed \"([^\"]*)\"$")
    public void cards_displayed(String arg1) {
        if(arg1.equals("true")){
            System.out.println("04a-This is cards_displayed method executed result: " + arg1);
        } else if (arg1.equals("false")){
            System.out.println("04b-This is cards_displayed method executed result: " + arg1);
        } else {
            System.out.println("04c-This is cards_displayed method executed result: " + arg1);
        }
    }
}
