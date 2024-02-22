package org.test.ng;

import org.loc.LoginPojo;
import org.openqa.selenium.WebElement;
import org.testing.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParaData extends BaseClass{
	
	@Test
	public void tc3() throws InterruptedException {
	
		LoginPojo l = new LoginPojo();
		WebElement user = l.getTxtEmail();
		fillTextBox(user,"greens123@gmail.com");
		Assert.assertEquals(user.getAttribute("value"), "greens123@gmail.com","Check email id..");
		
		WebElement pass = l.getTxtPass();
		fillTextBox(pass, "Greens@123");
		Assert.assertEquals(pass.getAttribute("value"), "Greens@123","Check password..");
		
		System.out.println("Both username and password entered successfully");

	}
	@Test
	public void tc1() {
		String url = pageUrl();
		Assert.assertTrue(url.startsWith("https"), "Check url..");
		System.out.println(url);
		
		String title = pageTitle();
		Assert.assertEquals(title,"Facebook – log in or sign up","Check title..");
		System.out.println(title);
	}
	
	@BeforeMethod
	private void bef() {
		date();
	}
	@AfterMethod
	private void aft() {
		date();
	}
	@BeforeClass
	private void befCls() {
		chromeBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxWindow();
	}
	@AfterClass
	private void aftCls() {
		closeBrowser();
	}
	@DataProvider(name="TestData")
	public Object[][] data() {
		return new Object[][] {
			{"python","python123"},
			{"manual","manual123"},
			{".dot",".dot123"},
			{"cucu","cucu123"}
		};
	}
}
