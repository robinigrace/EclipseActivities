package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.locators.FrgtPassPojo;
import org.locators.LoginPojo;
import org.maven.BaseClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	public static LoginPojo l;
	public static FrgtPassPojo l1;

	@Given("To login facebook using chrome browser")
	public void to_login_facebook_using_chrome_browser() {

		launchUrl("https://en-gb.facebook.com/");

	}

	@When("User have to Enter valid username and invalid password")
	public void user_have_to_Enter_valid_username_and_invalid_password() {
		l = new LoginPojo();
		WebElement txtEmail = l.getTxtEmail();
		fillTextBox(txtEmail, "greens123@gmail.com");
		WebElement txtpass = l.getTxtPass();
		fillTextBox(txtpass, "Greens");
	}

	@When("User have to Enter Invalid username and invalid password")
	public void user_have_to_Enter_Invalid_username_and_invalid_password() {
		l = new LoginPojo();
		WebElement txtEmail = l.getTxtEmail();
		fillTextBox(txtEmail, "dev");
		fillTextBox(l.getTxtPass(), "dev123");
	}

	@When("User have to Click login button")
	public void user_have_to_Click_login_button() {
		List<WebElement> login = l.getBtnLogin();
		btnClick(login.get(0));
	}

	@Then("User have to reach the invalid credential page")
	public void user_have_to_reach_the_invalid_credential_page() {
		String url = driver.getCurrentUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("User is in invalid credentials");
		} else {
			System.out.println("User is not in invalid credentials");
		}
	}

	// 1 -D list
	@When("User have to Enter Valid username and Invalid password")
	public void user_have_to_Enter_Valid_username_and_Invalid_password(io.cucumber.datatable.DataTable d) {
		List<String> allData = d.asList();

		String email = allData.get(0);
		String pass = allData.get(3);
		System.out.println(email);
		System.out.println(pass);

		l = new LoginPojo();
		WebElement user = l.getTxtEmail();
		fillTextBox(user, email);

		WebElement password = l.getTxtPass();
		fillTextBox(password, pass);
	}

	// 2 - D list
	@When("User have to Enter Invalid Email and Invalid Password")
	public void user_have_to_Enter_Invalid_Email_and_Invalid_Password(io.cucumber.datatable.DataTable d) {
		List<List<String>> lis = d.asLists();
		String email = lis.get(1).get(0);
		String pass = lis.get(1).get(2);
		l = new LoginPojo();
		WebElement user = l.getTxtEmail();
		fillTextBox(user, email);

		WebElement password = l.getTxtPass();
		fillTextBox(password, pass);
	}

	// 1-D map
	@When("User have to Enter valid username and valid password")
	public void user_have_to_Enter_valid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
		Map<String, String> mp = d.asMap(String.class, String.class);

		String email = mp.get("email");
		String pass = mp.get("username");

		System.out.println(email);
		System.out.println(pass);
		l = new LoginPojo();
		WebElement user = l.getTxtEmail();
		fillTextBox(user, email);

		WebElement password = l.getTxtPass();
		fillTextBox(password, pass);

	}

	// 2-D map
	@When("User have to Enter Invalid emailadd and Invalid password")
	public void user_have_to_Enter_Invalid_emailadd_and_Invalid_password(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> mp = d.asMaps();
		String email = mp.get(1).get("email");
		String pass = mp.get(1).get("password");
		System.out.println(email);
		System.out.println(pass);
		l = new LoginPojo();
		WebElement user = l.getTxtEmail();
		fillTextBox(user, email);

		WebElement password = l.getTxtPass();
		fillTextBox(password, pass);

	}

	@Given("User have to login facebook login through chrome browser")
	public void user_have_to_login_facebook_login_through_chrome_browser() {

		launchUrl("https://en-gb.facebook.com/");

	}

	@Given("User have to click forgotten password button")
	public void user_have_to_click_forgotten_password_button() {
		l1 = new FrgtPassPojo();
		btnClick(l1.getFrgtPass());
	}

	@When("User have to enter email or phone number")
	public void user_have_to_enter_email_or_phone_number() {
		fillTextBox(l1.getTxtSearchBox(), "8899889988");
	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
		btnClick(l1.getBtnSearch());
	}

}
