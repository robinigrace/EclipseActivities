package org.stepdefinition;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

		@Before
		public void bef() {
			System.out.println(" scenario started..");
			chromeBrowser();
			maxWindow();
			applyImplicitWait();
		}
		@Before(order=1)
		public void bef1() {
			System.out.println("bef1 started");
		}
		@Before(order=2)
		public void bef3() {
			System.out.println("bef3 started");
		}
		@Before(order=3)
		public void bef2() {
			System.out.println("bef2 started");
		}
		@After
		public void aft() {
			System.out.println(" scenario ended..");
		}
		
		@AfterClass
		public static void aftExecute(Scenario s) {
			
			if (s.isFailed()) {
				
				TakesScreenshot t = (TakesScreenshot)driver;
				byte[] screen = t.getScreenshotAs(OutputType.BYTES);
				s.embed(screen, "image/png");
			}
			closeBrowser();
		}
		
}
