Feature: feature to test google search

  Scenario: Validate google search
    Given Browser is open
    And user on search page
    When user enters text in search
    And hits Enter
    Then user navigated to search result
