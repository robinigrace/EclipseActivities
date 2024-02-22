package org.stepdefinition;


import org.maven.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	 
	@Before
	public void bef() {
		System.out.println("Bef scenario >>>");
		chromeBrowser();
		maxWindow();
		applyImplicitWait();
	}
	@Before(order=1)
	public void bef1() {
		System.out.println("bef 1 start");
	}
	@Before(order=2)
	public void bef3() {
		System.out.println("bef 3 start");
	}
	@Before(order=3)
	public void bef2() {
		System.out.println("bef 2 start");
	}
	
	@After
	public void aft() {
		System.out.println("Aft scenario >>>");

	}
	@After(order=3)
	public void aft1() {
		System.out.println("Aft 1 ended");
	}
	@After
	public void screenshot(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot t = (TakesScreenshot)driver;
			byte[] screen= t.getScreenshotAs(OutputType.BYTES);
			s.embed(screen, "image/png");
		}
		closeBrowser();
	}
	
	@After(order=1)
	public void aft2() {
		System.out.println("Aft 2 ended");
	}
	
}
