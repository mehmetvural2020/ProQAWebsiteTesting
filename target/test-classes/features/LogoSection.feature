Feature: Verifying Logo Section

  Scenario Outline:Logo Section Verification

    Given User is on Landing page
    When Verifies that "<Logos>" are present
    Examples:
      | Logos       |
      |Selenium     |
      |BitBucket    |
      |cucumber     |
      |Jira Software|
      |Jenkins      |
      |appium       |
      |Maven        |
      |Azure        |
      |Java         |
      |Rest-assured |
      |Apache jMeter|
      |TestNG       |