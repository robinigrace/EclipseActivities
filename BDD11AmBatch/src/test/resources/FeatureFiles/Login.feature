@Login
Feature: To validate facebook login functionality using chrome browser

  Background: 
    Given User have to validate the login functionality using chrome browser

  @Smoke @Regression
  Scenario: To validate the login page in valid emailAdd and invalid Password
    When User have to enter valid emailAdd and invalid PassWord
      | username | anitha           |
      | password |           876565 |
      | email    | Greens@gmail.com |
    And User have to click the login button
    Then User have to check is in invalid credential page

  @Sanity @Smoke
  Scenario: To validate the login page with Invalid usernameAdd and invalid password
    When User have to enter Invalid usernameAdd and invalid password
      | Username  | Email            | Password |
      | Selenium  | greens@gmail.com | 54545454 |
      | java123   | Greens           | uytr566  |
      | pythonsel | Pythonsel        |  0998087 |
    And User have to click the login button
    Then User have to check is in invalid credential page
