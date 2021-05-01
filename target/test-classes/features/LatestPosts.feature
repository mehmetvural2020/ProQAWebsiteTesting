Feature: Functionality of Latest Post

  Background: User is on home page

    @dateOrder
  Scenario: Checking order of date
    When user scrolls down to Latest Posts and checks the header date
    Then user gets the second date by order
    And user checks the insertion order is right by date

    @relatedPost
  Scenario: Checking relevant post
    When The user gets the first post title
    Then user clicks on the first post and lands to the relevant post page
    And verifies the page title
      
    @facebook
  Scenario: Facebook Post
    When The user gets the first post title
    Then The user clicks on the “Facebook“ icon
    And and lands on to Facebook page and verifies the text on Facebook page and closes the page


