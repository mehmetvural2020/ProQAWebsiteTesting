Feature: Verifying SecondaryMenu

  Background:
    Given User is on home page

  @Email
  Scenario:Email Verification
#    Given User is on home page
    When user clicks to “email”
    Then user verifies that default email editor opened

  @Address
  Scenario:Address Verification
#    Given User is on home page
    When User verifies that address “Chicago, IL“ is displayed on the home page

  @Twitter
  Scenario:Twitter Verification
#    Given User is on home page
    When User clicks to “Twitter“ icon
    Then User lands to “https://twitter.com/proqadev“

  Scenario:Linkedin Verification
#    Given User is on home page
    When User clicks to “Linkedin“ icon
    Then User lands to “https://twitter.com/proqadev“











