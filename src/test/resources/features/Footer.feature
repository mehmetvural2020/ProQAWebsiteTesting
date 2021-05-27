Feature:Footer Testing

  Background:
    Given user is on landing page

  @AboutUs
  Scenario:About Us Verification
    When About Us title is present
    Then Subtitle under About Us is present

  @Subscribe
  Scenario:Subscribe Function Verification
    When Subscribe title is present
    And User enters an email address and clicks on the arrow
    Then A message displays as Thanks for contacting us! We will be in touch with you shortly
#    And The email is recorded to the system  ==> not able to see in UI if email recorded in system or not


  @Twitter
  Scenario:Twitter Verification
    When User clicks to Twitter icon
    Then Correct Twitter page is opened

  @Linkedin
  Scenario:Linkedin Verification
    When User clicks to Linkedin icon
    Then Correct Linkedin page is opened

  @Address
  Scenario:Address Verification
    When The address Chicago,IL is present on home screen

