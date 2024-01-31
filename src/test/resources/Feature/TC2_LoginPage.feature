Feature: LoginPage Automation

  Scenario: Login Page Automation  with login status
    Given User Select the browser
    When User Vist the given URL
    And User click the login
    Then User should  validate the success messge after click "Login"

  @Login
  Scenario Outline: To Automate the registration block
    Given User Select the browser
    When User Vist the given URL
    And User click the login
    And User click the register
    Then User shoul validate the success msg "User Registration"
    When User enter  the first name "<firstname>","<lastname>","<usenrame>","<password>" and "<confirmationPassword>"
    And User select the gender
    And User select the register button

    Examples: 
      | firstname | lastname | username    | password     | confirmationPassword |
      | Mahesh    | P        | maheshp1803 | Mnbvcxz@1230 | Mnbvcxz@1230         |

  Scenario Outline: LoginPage Automation with valid credential
    Given User Select the browser
    When User Vist the given URL
    And User click the login
    Then User enter the valid credential "<username>" and  "<password>"
    And User select the click login  option
    Then User should verify the user name

    Examples: 
      | username    | password       |
      | maheshp1803 | Mnbvcxz@123456 |
