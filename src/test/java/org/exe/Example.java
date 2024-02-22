package org.exe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example {
	
	@Test
	private void tc2() {
		System.out.println("Test 2");
		Assert.assertTrue(true);
		System.out.println("Test 222");
	}
	@Test
	private void tc1() {
		System.out.println("Test 1");
		Assert.assertTrue(false,"Check tc 1");
		System.out.println("Test 111");
	}
	@Test
	private void tc3() {
		System.out.println("Test 3");
		Assert.assertTrue(false);
		System.out.println("Test 333");
	}
}
