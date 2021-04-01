@Slider
Feature: Verifying slider web elements
  @Slider-1
  Scenario: Verifying main slide
  Given user is in landing page and verify
  When user verifies that surfing man image is present
  And user verifies that main slide title is present
  Then user clicks on right arrow and verify contact slide

  @Slider-2
  Scenario: Verifying contact slide
    Given user is in landing page and click next arrow button
    When user verifies that meeting table image is present
    And user verifies that contact slide title is present
    And user clicks Contact Now and verifies
    Then user clicks on right arrow and verify the last slide

  @Slider-3
  Scenario: Verifying the last slide
    Given user is in landing page and click next button two times
    When user verifies that smiling girl image is present
    And user verifies that the last slide title is present
    Then user clicks on right arrow and verify main slide

  Scenario: Scenario: Verifying left arrow on slider
    Given user is in landing page
    When user clicks on the left arrow on slider
    And user verifies that third slide title is present
    And user clicks on the left arrow and verify the second slide title is present
    Then user clicks on the left arrow and verify the first slide title is present

#  Image “Surfing man“
#  Main text “Agile Testing“
#  Secondary Text “Promoting consistent project momentum“
#  Test “Left, Right“ rows to switch the slides


#  Image “Meeting Table“
#  Main text “free consultation“
#    When user clicks “Contact Now“ buton user lands to “Free Consultation“ section.
#  Test “Left, Right“ rows to switch the slides


#  Image “Smiling Girl“
#  Main text “fast delivery“
#  Secondary text “we offer premium QA services to ensure your app meet the highest quality standards  in the market“
#  Test “Left, Right“ rows to switch the slides