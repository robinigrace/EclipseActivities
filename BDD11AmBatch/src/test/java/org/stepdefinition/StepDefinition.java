package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.locators.ForgotPassPojo;
import org.locators.LoginPojo;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	public static LoginPojo l;
	public static ForgotPassPojo f;
	@Given("User have to validate the login functionality using chrome browser")
	public void user_have_to_validate_the_login_functionality_using_chrome_browser() {
	  
	   launchUrl("https://en-gb.facebook.com/");
	  
	}

	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String email, String password) {
	   l = new LoginPojo();
	   
	   WebElement txtEmail = l.getTxtEmail();
	   fillTextBox(txtEmail, email);
	   
	   fillTextBox(l.getTxtPass(), password);
	}
	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() throws InterruptedException {
		List<WebElement> login = l.getBtnLogin();
		btnClick(login.get(0));
		Thread.sleep(3000);
	}
	//1-D list
	@When("User have to enter valid email and invalid PassWord")
	public void user_have_to_enter_valid_email_and_invalid_PassWord(io.cucumber.datatable.DataTable d) {
	    List<String> allData = d.asList();
	    String email = allData.get(0);
	    String pass = allData.get(2);
	    System.out.println(email);
	    System.out.println(pass);
	    
	    l = new LoginPojo();
	    WebElement user = l.getTxtEmail();
	    fillTextBox(user, email);
	    
	    WebElement pwd = l.getTxtPass();
	    fillTextBox(pwd, pass);
	}
	//2-D list
	@When("User have to enter invalid email and invalid password")
	public void user_have_to_enter_invalid_email_and_invalid_password(io.cucumber.datatable.DataTable d) {
		List<List<String>> lis = d.asLists();
		String email = lis.get(1).get(0);
	    String pass = lis.get(1).get(2);
	    
	    System.out.println(email);
	    System.out.println(pass);
	    
	    l = new LoginPojo();
	    WebElement user = l.getTxtEmail();
	    fillTextBox(user, email);
	    
	    WebElement pwd = l.getTxtPass();
	    fillTextBox(pwd, pass);
	}
	//1-D map
	@When("User have to enter valid emailAdd and invalid PassWord")
	public void user_have_to_enter_valid_emailAdd_and_invalid_PassWord(io.cucumber.datatable.DataTable d) {
	    Map<String, String> mp = d.asMap(String.class, String.class);
	    String email = mp.get("email");
	    String pass = mp.get("username");
	    System.out.println(email);
	    System.out.println(pass);
	    
	    l = new LoginPojo();
	    WebElement user = l.getTxtEmail();
	    fillTextBox(user, email);
	    
	    WebElement pwd = l.getTxtPass();
	    fillTextBox(pwd, pass);
	}
	//2-D map
	@When("User have to enter Invalid usernameAdd and invalid password")
	public void user_have_to_enter_Invalid_usernameAdd_and_invalid_password(io.cucumber.datatable.DataTable d) {
	    List<Map<String, String>> mp = d.asMaps();
	    String email = mp.get(2).get("Email");
	    String pass = mp.get(1).get("Password");
	    System.out.println(email);
	    System.out.println(pass);
	    
	    l = new LoginPojo();
	    WebElement user = l.getTxtEmail();
	    fillTextBox(user, email);
	    
	    WebElement pwd = l.getTxtPass();
	    fillTextBox(pwd, pass);
	}

	@When("User have to enter Invalid email and valid password")
	public void user_have_to_enter_Invalid_email_and_valid_password() {
	   l = new LoginPojo();
	   fillTextBox(l.getTxtEmail(),"dev@gmail.com");
	   fillTextBox(l.getTxtPass(), "devops123");
	}
	@Then("User have to check is in invalid credential page")
	public void user_have_to_check_is_in_invalid_credential_page() {
	    String url = driver.getCurrentUrl();
	    if (url.contains("privacy_mutation_token")) {
			System.out.println("User is in Invalid credential page");
		} else {
			System.out.println("User is not in Invalid credential page");
		}
	}
	@Given("User have to enter facebook login through chrome browser")
	public void user_have_to_enter_facebook_login_through_chrome_browser() {
	    
	    launchUrl("https://en-gb.facebook.com/");
	   
	}

	@Given("User have to click forgotten password")
	public void user_have_to_click_forgotten_password() {
	   f = new ForgotPassPojo();
	   btnClick(f.getBtnFrgtPass());
	}

	@When("User have to enter email or phoneNo")
	public void user_have_to_enter_email_or_phoneNo() {
	    f = new ForgotPassPojo();
	    fillTextBox(f.getTxtSearchBox(), "9898989890");
	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
	    f = new ForgotPassPojo();
	    btnClick(f.getBtnSearch());
	}
}
