package com.ntiit.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerTestNG {
	@CucumberOptions(
			features = {"Features"},
			glue = {"com.ntiit.stepdefs"}
			)
	public class Testrunner extends AbstractTestNGCucumberTests{}
}
