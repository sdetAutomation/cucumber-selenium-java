package com.sdet.auto.cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/sdet/auto/features",
        glue = "com.sdet.auto.stepDefinitions",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cucumber.xml"} )
public class TestRunner {

}
