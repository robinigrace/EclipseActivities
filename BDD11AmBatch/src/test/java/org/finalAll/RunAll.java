package org.finalAll;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\workspace\\BDD11AmBatch\\src\\test\\resources\\FeatureFiles"
,glue="org.stepdefinition",dryRun=false,monochrome=true,strict=true,plugin= {"pretty",
		"html:C:\\workspace\\BDD11AmBatch\\AllReport\\HtmlReport",
		"json:C:\\workspace\\BDD11AmBatch\\AllReport\\JsonReport\\fb.json",
		"junit:C:\\workspace\\BDD11AmBatch\\AllReport\\JunitReport\\face.xml",
		 "rerun:C:\\workspace\\BDD11AmBatch\\Rerun\\failed.txt"})
public class RunAll {
		
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport(System.getProperty("user.dir"+"\\AllReport\\JsonReport\\fb.json"));

	}
}
