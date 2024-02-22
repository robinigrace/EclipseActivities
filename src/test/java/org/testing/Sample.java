package org.testing;

import java.io.IOException;

import org.loc.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass{
public static void main(String[] args) {
	chromeBrowser();
	launchUrl("https://en-gb.facebook.com/");
	maxWindow();
	
	LoginPojo l = new LoginPojo();
	
	WebElement txtEmail = l.getTxtEmail();
	fillTextBox(txtEmail, "rocky@gmail.com");
	
	WebElement txtPass = l.getTxtPass();
	fillTextBox(txtPass, "Rock@123");
	
	btnClick(l.getBtnLogin().get(0));
}
}
