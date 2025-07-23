package _15_BDDCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/feature", glue = { "stepdefinition" })
public class P237_TestRun {

}
