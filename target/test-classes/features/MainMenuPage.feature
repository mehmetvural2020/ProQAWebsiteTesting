
Feature: Main Menu WebElements

  @mainMenu
  Scenario: Main menu logo and texts verification
    Given user is on Homepage
    Then displayed the logo and texts on main menu

    Scenario: Sticky template functionality
      Given user scrolls down to service
      Then  user checks sticky template is enabled