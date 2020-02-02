Feature: Application Login

#### *** Not able to use Backgroud and Hooks on the same feature file.  Can only use one or the other. **** ####
#  # prereq that runs before the test
#  Background:
#    Given Validate the browser
#    When Browser is triggered
#    Then Check if browser is started

  #dynamic feature
  @AcctTest
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "test_user" and "1234"
    Then Home page is populated
    And Cards displayed "true"

  #dynamic feature
  @MobileTest
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "bad_user" and "4321"
    Then Home page is populated
    And Cards displayed "false"

  #dynamic feature
  @WebTest
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "bad_user" and "4321"
    Then Home page is populated
    And Cards displayed "false"