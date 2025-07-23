package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

code is not working in java project

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"E:\\Software Files\\eclipse-workspace\\06_selenium\\1_Selenium_Cucumber\\Features\\Test.feature"},
    glue = {"E:\\Software Files\\eclipse-workspace\\06_selenium\\1_Selenium_Cucumber\\src\\stepdefinition\\Test.java", "E:\\Software Files\\eclipse-workspace\\06_selenium\\1_Selenium_Cucumber\\src\\apphooks\\Hooks.java"},
    plugin = {"pretty"},
    monochrome = true
    )

public class TestRunner {}