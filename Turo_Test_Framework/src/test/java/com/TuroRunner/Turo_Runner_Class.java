package com.TuroRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/Turo_Login.feature"},
		glue = {"com.TuroStepDef", "com.TuroHooks"},
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = true,
		monochrome = true

		)
public class Turo_Runner_Class extends AbstractTestNGCucumberTests{
	
	
}