@Login
Feature: To check the facebook login functionality using chrome browser

  Background: 
    Given To login facebook using chrome browser

  @Smoke @Sanity
  Scenario: To check the invalid username and invalid password
    When User have to Enter valid username and valid password
      | username | Greens           |
      | password |        123455454 |
      | email    | greens@gmail.com |
    And User have to Click login button
    Then User have to reach the invalid credential page

  @Smoke @Regression
  Scenario: To check the valid UserName and Invalid Pass
    When User have to Enter Invalid emailadd and Invalid password
      | email              | password   | username  |
      | greens@gmail.com   | 5565777889 | selenium  |
      | rocky@gmail.com    | 7909887899 | java123   |
      | selenium@gmail.com | 9887590090 | javasel5  |
      | python@gmail.com   | 7686786888 | python123 |
    And User have to Click login button
    Then User have to reach the invalid credential page
