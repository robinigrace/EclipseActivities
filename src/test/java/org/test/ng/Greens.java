package org.test.ng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Greens {
	@Test
	public void tc11() {
		Assert.assertTrue(false, "Check tc 11 again..");
		System.out.println("Test 11");
	}
	@Test
	public void tc12() {
		Assert.assertTrue(false);
		System.out.println("Test 12");
	}
	@Test
	public void tc13() {
		Assert.assertTrue(true, "tc 13 should be verified");
		System.out.println("Test 13");
	}
	
}
