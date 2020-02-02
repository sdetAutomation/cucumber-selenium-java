package com.sdet.auto.stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before("@MobileTest")
    public void beforeValidation(){
        System.out.println("Hooks-beforeValidation");
    }

    @After("@MobileTest")
    public void afterValidation(){
        System.out.println("Hooks-afterValidation");
    }

    @Before("@WebTest")
    public void beforeWebValidation(){
        System.out.println("Hooks-beforeWebValidation");
    }

    @After("@WebTest")
    public void afterWebValidation(){
        System.out.println("Hooks-afterWebValidation");
    }
}
