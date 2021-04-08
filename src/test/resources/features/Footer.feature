Feature:Footer Testing

  Background:
    Given user is in landing page

  @AboutUs
  Scenario:About Us Verification
    When About Us title is verified

  @Subscribe
  Scenario:Subscribe Function Verification
    When Subscribe title is verified
    Then User enters an email address and clicks on the “arrow”
    And A message displays as “Thanks for contacting us! We will be in touch with you shortly”
    Then The email is recorded to the system


#    When the user enters an email address and clicks on the “arrow”.
#
#    Then a message appears “Thanks for contacting us! We will be in touch with you shortly.”
#
#  Check if the email is recorded to the system.

  @Twitter
  Scenario:Twitter Verification
    When User clicks to “Twitter“ icon
    Then Correct Twitter page is opened

  @Linkedin
  Scenario:Linkedin Verification
    When User clicks to “Linkedin“ icon
    Then Correct Linkedin page is opened

  @Address
  Scenario:Address Verification
    Then The address in Chicago,IL is displayed on home screen
