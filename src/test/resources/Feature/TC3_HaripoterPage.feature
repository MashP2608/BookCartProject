Feature: BookCart page  Automation

  Scenario: First Page Automation book one
    Given User Select the browser
    When User Vist the given URL
    And User click First the book in list
    Then User should valid the success message1 "HP1"

  Scenario: First Page Automation book second
    Given User Select the browser
    When User Vist the given URL
    And User click the Second book in list
    Then User should valid the success message2 "HP2"

  Scenario: First Page Automation book third
    Given User Select the browser
    When User Vist the given URL
    And User click the Third book in list
    Then User should valid the success message3 "HP3"

  Scenario: First Page Automation book fourth
    Given User Select the browser
    When User Vist the given URL
    And User click the Four book in  list
    Then User should valid the success message4 "HP4"

  Scenario: First Page Automation book five
    Given User Select the browser
    When User Vist the given URL
    And User click the Five book list
    Then User should valid the success message5 "HP5"

  Scenario: First Page Automation book six
    Given User Select the browser
    When User Vist the given URL
    And User click the Six book list
    Then User should valid the success message6 "HP6"

  Scenario: First Page Automation book seven
    Given User Select the browser
    When User Vist the given URL
    And User click the Seven book list
    Then User should valid the success message7 "HP7"
