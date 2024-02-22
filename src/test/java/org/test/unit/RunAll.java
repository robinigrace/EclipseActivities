package org.test.unit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class RunAll {

	@Test
	public void tc() {
		Result r = JUnitCore.runClasses(Greens.class,Data.class);
		System.out.println("Execution Results:\n");
		
		System.out.println("Run count : "+r.getRunCount());
		System.out.println("\nIgnore count : "+r.getIgnoreCount());
		System.out.println("\nFailure count : "+r.getFailureCount());
		System.out.println("\nStatus : "+r.wasSuccessful());
		System.out.println("\nRun Time : "+r.getRunTime());
	
		List<Failure> allFail = r.getFailures();
		System.out.println("\nFailed testCases : ");
		for (Failure fail : allFail) {
			System.out.println(fail);
		}
	}
}
