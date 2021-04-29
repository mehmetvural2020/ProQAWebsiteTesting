Feature:Blog Single Post Testing

  Background:
    Given user is in landing page
    When User clicks on Blog
    And User clicks on second post

  Scenario: Second Post Title Verification
    When Second Post title is present

  Scenario: Previous Post Verification
    When Previous Post heading is present
    Then Previous Post arrow is present

  Scenario: Next Post Verification
    When Next Post is present
    Then Next Post arrow is present

  Scenario: Related Post Verification
    When Related Posts title is present
    Then First and third posts are present

#  Scenario: Write a Comment Verification
#    When User writes and posts a comment
#
#  Scenario: Search Function Verification
#    When User makes a search
#
#  Scenario: Newsleter Verification
#    When Newsleter is present
#
#  Scenario: Recent Post Verification
#    When Recent Posts heading is present
#    Then Recent posts are present
#
#  Scenario: Tags Verification
#    When Tags are present



