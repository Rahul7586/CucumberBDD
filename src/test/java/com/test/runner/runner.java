package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features", glue= {"testdefinations"},
monochrome=true,
plugin= {"html:Reports\\htmlreports", "json:Reports\\jsonReport\\jsonreport.json", "junit:Reports\\junitreport\\cucumber.xml"},
dryRun = false
		)

public class runner {

}
