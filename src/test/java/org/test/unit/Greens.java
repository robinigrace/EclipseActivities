package org.test.unit;

import org.junit.Assert;
import org.junit.Test;

public class Greens {

	@Test
	public void tc33() {
		Assert.assertTrue(true);
		System.out.println("Tc 33");

	}
	@Test
	public void tc32() {
		Assert.assertTrue("check tc 32 again", false);	
		System.out.println("Tc 32");

	}
	@Test
	public void tc31() {
		Assert.assertTrue("check tc 31", false);	
		System.out.println("Tc 31");

	}
}
