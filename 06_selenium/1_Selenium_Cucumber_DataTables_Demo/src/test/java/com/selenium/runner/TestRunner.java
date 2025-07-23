package com.selenium.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    //    features = { "./src/test/java/feature" },
    features = { "./src/test/java/feature/AllTypesDataAccessing.feature" },
    //    features = { "./src/test/java/feature/Login.feature" },
    //    features = { "./src/test/java/feature/UserSettings.feature" },
    //    features = { "./src/test/java/feature/UserProfile.feature" },
    glue = { "stepdefinitions"},// "apphooks" },
    dryRun = false
    )

public class TestRunner {
}