Feature: Verifying Email

  @Email
  Scenario:Email Verification
    Given User is on home page
    When user clicks to “email” default email editor must be opened

  @Address
  Scenario:Address Verification
    Given User is on home page
    When User verifies that address is displayed on the home page
  Address is “Chicago, IL“

