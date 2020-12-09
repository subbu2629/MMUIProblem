package com.mm.qa.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.mm.qa.Util.TestBase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/Features/login.feature", //the path of the feature files
			glue={"com.mm.qa.stepDefinitions"}, //the path of the step definition files
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 
	public class TestRunner {
	 
		 @AfterClass
	      public static void tearDown(){

	      TestBase.closeABrowser();
		
	}
	}
