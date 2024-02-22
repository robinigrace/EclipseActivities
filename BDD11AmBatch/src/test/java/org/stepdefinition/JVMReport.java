package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
		
	public static void generateJVMReport(String jsonPath) {
		
		//1.mention file location
		File f = new File(System.getProperty("user.dir")+"\\AllReport\\JVMReport");
		
		//2.Add details
		Configuration c = new Configuration(f, "FACEBOOK APPLICATION");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Sprint", "123");
		c.addClassifications("JDK version", "1.8");
		
		//3.Add json file path to list
		List<String> l = new ArrayList<String>();
		l.add(jsonPath);
		
		//4.
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	}
}
