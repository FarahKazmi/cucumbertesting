package com.selenium.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "features",glue ={"stepDefinition"}

,tags = {"@test"},


plugin = { "html:target/cucumber-htmlreport", "json:target/cucumber-report.json","usage:target/cucumber-usage.json" })

public class Runner extends AbstractTestNGCucumberTests {
	
}
	