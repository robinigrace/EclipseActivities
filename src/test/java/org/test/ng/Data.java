package org.test.ng;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data {
	static WebDriver driver;
	@Test
	public void tc22() {
		System.out.println("Test 22");
	}
	@Test
	public void tc23() {
		System.out.println("Test 23");
	}
	@Test
	public void tc24() {
		System.out.println("Test 24");
	}
	@BeforeClass
	private  void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	private void startTime() {
		Date d =new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);

	}
	@AfterClass
	private  void closeBrowser() {
		driver.close();

	}
}
