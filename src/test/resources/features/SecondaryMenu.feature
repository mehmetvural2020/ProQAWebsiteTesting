Feature: Verifying SecondaryMenu

  Background:
    Given User is on home page

  @Email
  Scenario:Email Verification
    When user clicks to “email” address
#    Then user verifies that default email editor is opened

  @Address
  Scenario:Address Verification
    When User verifies that address “Chicago, IL“ is displayed on the home page
  # Then the address in Chicago,IL is displayed on home screen

  @Twitter
  Scenario:Twitter Verification
    When User clicks to “Twitter“ icon
    Then User verifies that Twitter page is opened
    # Then correct Twitter page is opened

  @Linkedin
  Scenario:Linkedin Verification
    When User clicks to “Linkedin“ icon
    Then User verifies that Linkedin page is opened












