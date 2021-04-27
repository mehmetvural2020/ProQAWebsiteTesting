Feature:Blog Single Post Testing

  Background:
    Given user is in landing page
    When User clicks on Blog
    And User opens first post

  Scenario: Post Title Verification
    When First Post title is present

  Scenario: Previous Post Verification
    When Previous Post is present
#   Then Previous post arrow is present

  Scenario: Next Post Verification
    When Next Post is present
#   Then Next Post arrow is present

  Scenario: Related Post Verification
    When Related Posts title is present
    Then Second and third posts are present

  Scenario: Write a Comment Verification
    When User writes and posts a comment

  Scenario: Search Function Verification
    When User makes a search
#
  Scenario: Newsleter Verification
    When Newsleter is present

  Scenario: Recent Post Verification
    When Recent Posts is present
    Then Recent posts are present

  Scenario: Tags Verification
    When Tags are present
