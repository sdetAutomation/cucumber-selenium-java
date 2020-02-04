package com.sdet.auto.stepDefinitions;

import com.sdet.auto.pageObjects.GuiHelper;
import com.sdet.auto.testHelper.ConfigSettings;
import com.sdet.auto.testHelper.TestAssert;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Assert;

import java.io.IOException;

public class Hooks {

    public static TestAssert testAssert;

    @Before("@TestSetup")
    public void testSetup(Scenario scenario) throws IOException {
//        // printout test name
//        System.out.println("------------------------------");
//        System.out.println("Starting - " + scenario.getName());
//        System.out.println("------------------------------");
        // load config for test
        ConfigSettings configSettings = new ConfigSettings();
        configSettings.getConfigSettings();
        // creating new instance of test assertion for test run
        testAssert = new TestAssert();
    }

    @After("@TestCleanup")
    public void afterValidation(Scenario scenario){
        System.out.println("------------------------------");
        System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
        System.out.println("------------------------------");
        // close browser each time
        GuiHelper.closeWebBrowser();
        // check if assert passed
        Assert.assertTrue(testAssert.getPass());
    }
}
