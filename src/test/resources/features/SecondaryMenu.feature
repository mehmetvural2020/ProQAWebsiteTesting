Feature: Verifying SecondaryMenu

  Background:
    Given User is on home page

  @Email
  Scenario:Email Verification
    When user clicks to “email” address and verifies
#    Then default email editor is opened

  @Address
  Scenario:Address Verification
    Then the address in Chicago,IL is displayed on home screen

  @Twitter
  Scenario:Twitter Verification
    When User clicks to “Twitter“ icon
    Then correct Twitter page is opened

  @Linkedin
  Scenario:Linkedin Verification
    When User clicks to “Linkedin“ icon
    Then correct Linkedin page is opened












