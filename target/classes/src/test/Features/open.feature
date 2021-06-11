Feature: open webpage
  Scenario: Type in number on airtel
    Given user is on airtel page
    When user enters his number
    Then user is taken to the recharge page
