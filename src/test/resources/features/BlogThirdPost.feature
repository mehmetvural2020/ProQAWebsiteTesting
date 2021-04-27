Feature:Blog Single Post Testing

  Background:
    Given user is in landing page

  Scenario: Single Post Verification
    When User clicks on Blog
    And User opens third post

  Scenario: Post Title Verification
    When Third Post title is present

#  Scenario: Previous Post Verification
#    When The Previous Post title is present
#    Then The Previous post arrow is present
#
#  Scenario: Next Post Verification
#    When The Next post title is present
#    Then The Next post arrow is present

  Scenario: Related Post Verification
    When Related posts title is present
    Then First and Second Posts are present

#  Scenario: Write a Comment Verification
#    When User writes and posts a comment
#
#  Scenario: Search Function Verification
#    When User clears search box
#    Then User makes a search

#  Scenario: Recent Post Verification
#    When Recent Posts title is present
#    Then Recent posts are present
#
#  Scenario: Tags Verification
#    When Tags are present