package org.finalAll;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\workspace\\BDDFrameWork2pm\\src\\test\\resources\\FeatureFiles",
glue="org.stepdefinition",dryRun=false,monochrome=true,strict=true,
plugin= {"pretty","html:C:\\workspace\\BDDFrameWork2pm\\AllFolders\\HtmlReport",
		"json:C:\\workspace\\BDDFrameWork2pm\\AllFolders\\JsonReport\\fb.json",
		"junit:C:\\workspace\\BDDFrameWork2pm\\AllFolders\\JunitReport\\face.xml",
		"rerun:C:\\workspace\\BDDFrameWork2pm\\Rerun\\failed.txt"})
								
public class RunAll {
		
	@AfterClass
	public static  void report() {
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\AllFolders\\JsonReport\\fb.json");

	}
}
