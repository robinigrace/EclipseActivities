package org.locators;

import org.maven.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrgtPassPojo extends BaseClass{
	
	public FrgtPassPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Forgotten password']")
	private WebElement frgtPass;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement txtSearchBox;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement btnSearch;

	public WebElement getFrgtPass() {
		return frgtPass;
	}

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
}
