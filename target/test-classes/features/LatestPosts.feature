Feature: Functionality of Latest Post

  Background: User is on home page

  Scenario: Checking order of date
    When user scrolls down to Latest Posts and checks the header date
    Then user gets the second date by order
    And user checks the insertion order is right by date
