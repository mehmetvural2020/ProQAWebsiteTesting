Feature: Functionality of Latest Post

  Background: User is on home page

  Scenario: Checking order of date
    When user scrolls down to Latest Posts
    Then user clicks on first post's date
    And user checks the header date