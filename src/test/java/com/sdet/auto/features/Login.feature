@TestSetup @LoginTest @TestCleanup
Feature: Application Login

  # prereq that runs before each test
  Background:
    Given Browser is opened
    Then Navigate to the Heroku landing page
    And Check if page is ready

  Scenario: TC0001_ForgetPasswordTest
    Given User clicks forget password link
    And Enters email "sdet.testautomation@gmail.com" and clicks retrieve button
    Then Verify email is sent message "Your e-mail's been sent!" is displayed

  Scenario: TC0002_FormAuthentication
    Given User clicks form authentication link
    And Enters userid "tomsmith" and password "SuperSecretPassword!"
    Then Verify SecureAreaPage message "You logged into a secure area!" is displayed
    And User clicks logout button
    Then Verify LoginPage message "You logged out of the secure area!" is displayed

  Scenario: TC0003_FormAuthenticationBadInfo
    Given User clicks form authentication link
    And Enters userid "sdetAutomatiom" and password "pass@word"
    Then Verify LoginPage message "Your username is invalid!" is displayed
