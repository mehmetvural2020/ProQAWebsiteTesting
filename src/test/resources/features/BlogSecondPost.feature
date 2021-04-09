Feature:Blog Single Post Testing

  Background:
    Given user is in landing page

  Scenario: Single Post Verification
    When User clicks on Blog
    And User opens second post

  Scenario: Second Post Title Verification
    When Second Post title is present

  Scenario: Previous Post Verification
    When SDLC title is verified
    Then The Previous Post arrow is present

  Scenario: Next Post Verification
    When The Next Post title is present
    Then The Next Post arrow is present

  Scenario: Related Post Verification
    When Related Posts title is present
    Then First and third posts are present

  Scenario: Write a Comment Verification
    When User writes and posts a comment

  Scenario: Search Function Verification
    When User clears search box
    Then User makes a search

  Scenario: Recent Post Verification
    When Recent Posts title is present
    Then Recent posts are present

  Scenario: Tags Verification
    When Tags are present