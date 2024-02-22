package org.loc;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testing.BaseClass;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id = "email")
	private WebElement txtEmail;
	
	@CacheLookup
	@FindBy(name = "pass")
	private WebElement txtPass;
	
	
	@FindBy(xpath="//button[@name='login']")
	private List<WebElement> btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public List<WebElement> getBtnLogin() {
		return btnLogin;
	}
}
