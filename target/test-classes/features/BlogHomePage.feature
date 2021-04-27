Feature:Blog Homepage Testing

  Scenario: Home link verification
    Given user is in landing page
    When user verifies Home link
    And user clicks on Home
    Then user verifies Homepage url

  Scenario: First post verification
    Given user is in landing page
    When user verifies Home link
    And user clicks on first post
    Then user verifies first post

  Scenario: Second post verification
    Given user is in landing page
    When user verifies Home link
    And user clicks on second post
    Then user verifies second post

  Scenario: Third post verification
    Given user is in landing page
    When user verifies Home link
    And user clicks on third post
    Then user verifies third post