Feature: To validate forgotten password functionality of facebook application
		@Regression @Sanity
		Scenario:
					To validate forgotten password
					
					Given User have to login facebook login through chrome browser
					And User have to click forgotten password button
					When User have to enter email or phone number
					Then User have to click search button
