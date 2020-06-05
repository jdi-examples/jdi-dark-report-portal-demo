package com.epam.jdi.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"com/epam/jdi/tests/steps", "com/epam/jdi/tests/stepdefs"})
public class CucumberTestsRunner extends AbstractTestNGCucumberTests {
}
