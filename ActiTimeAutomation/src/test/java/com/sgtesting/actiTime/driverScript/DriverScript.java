package com.sgtesting.actiTime.driverScript;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/resources/FeatureFiles",
        glue = "com.sgtesting.actitime.stepdefinitions"
)
public class DriverScript extends AbstractTestNGCucumberTests {
}
