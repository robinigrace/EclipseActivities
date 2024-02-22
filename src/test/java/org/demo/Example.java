package org.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example {
	@Test(retryAnalyzer=Failed.class)
	private void tc2() {
		System.out.println("Test 11");
		Assert.assertTrue(true);
		System.out.println("Test 111");

	}
	@Test
	private void tc1() {
		System.out.println("Test 12");
		Assert.assertTrue(false,"Check tc 1");
		System.out.println("Test 222");

	}
	@Test(retryAnalyzer=Failed.class)
	private void tc3() {
		System.out.println("Test13");
		Assert.assertTrue(false);
		System.out.println("Test 333");

	}
	
}
