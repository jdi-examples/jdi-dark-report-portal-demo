package com.epam.jdi.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"},
        features = "src/test/resources/features/",
        glue = {"com/epam/jdi/tests/steps", "com/epam/jdi/http/stepdefs/en"})
public class CucumberTestsRunner extends AbstractTestNGCucumberTests {
}
