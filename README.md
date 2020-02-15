```                                                                      
#             .___      __     _____          __                         __  .__               
#    ______ __| _/_____/  |_  /  _  \  __ ___/  |_  ____   _____ _____ _/  |_|__| ____   ____  
#   /  ___// __ |/ __ \   __\/  /_\  \|  |  \   __\/  _ \ /     \\__  \\   __\  |/  _ \ /    \ 
#   \___ \/ /_/ \  ___/|  | /    |    \  |  /|  | (  <_> )  Y Y  \/ __ \|  | |  (  <_> )   |  \
#  /____  >____ |\___  >__| \____|__  /____/ |__|  \____/|__|_|  (____  /__| |__|\____/|___|  /
#       \/     \/    \/             \/                         \/     \/                    \/ 
```

# cucumber-java
starter project for cucumber using selenium and Java

[![Build Status](https://travis-ci.org/sdetAutomation/cucumber-selenium-java.svg?branch=master)](https://travis-ci.org/sdetAutomation/cucumber-selenium-java)

[![Java CI](https://github.com/sdetAutomation/cucumber-selenium-java/workflows/Java%20CI/badge.svg)](https://github.com/sdetAutomation/cucumber-selenium-java/actions)

Introduction
------------
This project is made for anyone who is looking for a starting point for writing functional tests using Cucumber and Java.

This project was written using IntelliJ IDEA Community Edition.   

Project Packages
-----
* PageObjects:  
Contains class files for each web page being tested.  Page element definitions / mappings, and functions for interacting with page elements.
 
* SeleniumExtensions:  
Contains helper function to instantiate WebDriver to the appropriate browser type.  WebDriverExtensions class contains helper functions to handle driver waits for page elements conditions. 

* TestHelper:  
    - ConfigSettings: contains helper functions for reading config.properties.  
    - IoLibrary: contains helper functions used across tests.  
    - LoggingLibrary: contains custom functions for comparing actual to expected conditions.  
    - TestAssert: Is a custom assert, used to track if a verification point has failed.  The class variable is latched, once set to false it will remain false for the remainder of the test run. 

* CucumberOptions:
Contains the test runner class and function to execute all tests

* Features:  
Feature file containing test scenarios  

* StepDefinitions:  
Contains backgroun, hooks, and step definitions for executing tests


Test web page
-----
    http://the-internet.herokuapp.com/      


Selenium WebDriver
------------
This project is configured to use Firefox & Chrome WebDriver's.  The default is set to Chrome.  The WebDriver's added to this project will only work on macos.  


Page Object Model
-----
Page object model is used in this framework.  Each web page will have its own java.class and within each class contains page element mappings and functions / methods used to interact /verify a specific web page under test.  


Maven Java Project / Maven Wrapper
-----
This project is written in Java and tests can be executed using Maven commands. 

    ./mvnw clean install  


Code Gen Step Definitions
-----
Used [Tidy Gherkin - (Chrome extension)](https://chrome.google.com/webstore/detail/tidy-gherkin/nobemmencanophcnicjhfhnjiimegjeo?hl=en-GB) to code gen Step Definitions.  Just 
cut and paste feature file content to Tidy Gherkin and it will auto gen the Java code for Step Definitions   

   
Continuous Integration(CI)
------------
A web hook has been setup with Travis CI for all Push and Pull Requests.
 
A web hook has also been setup with Github Actions for all Push and Pull Requests.


Questions / Contact / Contribute
------------
Feel free to fork this repo, add to it, and create a pull request if you like to contribute.  

If you have any questions, you can contact me via email: `sdet.testautomation@gmail.com`
