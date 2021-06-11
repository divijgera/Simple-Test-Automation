Feature: Search on Google
  Scenario: validate search for airtel
    Given browser is open
    And user is on google
    When user enters airtel in search box
    And hits enter
    Then user is navigated to the results
