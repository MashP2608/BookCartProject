Feature: Automation to the valid credentials

  Scenario Outline: LoginPage Automation with valid credential
    Given User Select the browser
    When User Vist the given URL
    And User click the login
    Then User enter the valid credential "<username>" and  "<password>"
    And User select the click login  option
    Then User should verify the user name after login

    Examples: 
      | username    | password       |
      | maheshp1803 | Mnbvcxz@123456 |
