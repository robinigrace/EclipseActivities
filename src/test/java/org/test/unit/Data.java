package org.test.unit;

import org.junit.Assert;
import org.junit.Test;

public class Data {

	@Test
	public void tc3() {
		Assert.assertTrue(false);
		System.out.println("Tc 3");
	}
	@Test
	public void tc2() {
	Assert.assertTrue("check tc 2 again", true);	
	System.out.println("Tc 2");
	}
	@Test
	public void tc1() {
	Assert.assertTrue("check tc 1", true);	
	System.out.println("Tc 1");
	}
}
