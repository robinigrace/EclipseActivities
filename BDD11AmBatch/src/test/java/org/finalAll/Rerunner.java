package org.finalAll;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun\\failed.txt",glue="org.stepdefinition",dryRun=false,monochrome=true,
plugin= {"rerun:C:\\workspace\\BDD11AmBatch\\Rerun\\failed.txt"})
public class Rerunner {
		
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\AllReport\\JsonReport\\fb.json");

	}
}
