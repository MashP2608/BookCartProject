Feature: BookCart page  Automation

  Scenario: First Page Automation
    Given User Select the browser
    When User Vist the given URL
    Then User should  validate the success messge after loaded url "All Categories"

  Scenario: First Page Automation
    Given User Select the browser
    When User Vist the given URL
    Then User should  validate the success messge after loaded url with message " Price Filter"

  Scenario: First Page Automation  with login status
    Given User Select the browser
    When User Vist the given URL
    And User click the login
    Then User should  validate the success messge after click "Login"
