Feature:Blog Homepage Testing
Background:
  Given user is in landing page
  When user verifies Home link

  Scenario: Home link verification
    And user clicks on Home
    Then user verifies Homepage url


  Scenario Outline: Single post verification
    And user clicks on <PostLink>
    Then user verifies  "<PostTitle>"
    Examples:
      | PostLink | PostTitle                                  |
      | 1        |  The Need for Test Automation – proqa.dev|
      | 2        |  What is Software Testing? – proqa.dev|
      | 3        |  What is SDLC? – proqa.dev|


  Scenario Outline: Post social media icon test
    And user verifies <postOrder> and "<SocialMediaAttribute>" and click on it
    Then user verifies SM "<SocialMediaPageTitle>"
    Examples:
      | postOrder | SocialMediaAttribute | SocialMediaPageTitle |
      | 1         | https://www.facebook.com/sharer/sharer.php?u=https://www.proqa.dev/2021/01/25/the-need-for-test-automation/         | Facebook              |
      | 1         | https://www.linkedin.com/shareArticle?mini=true&url=https://www.proqa.dev/2021/01/25/the-need-for-test-automation/  | LinkedIn Login, Sign in \| LinkedIn|
      | 1         | https://twitter.com/intent/tweet?url=https://www.proqa.dev/2021/01/25/the-need-for-test-automation/                 | Twitter                      |
      | 2         | https://www.facebook.com/sharer/sharer.php?u=https://www.proqa.dev/2021/01/21/what-is-software-testing/         | Facebook              |
      | 2         | https://www.linkedin.com/shareArticle?mini=true&url=https://www.proqa.dev/2021/01/21/what-is-software-testing/  | LinkedIn Login, Sign in \| LinkedIn|
      | 2         | https://twitter.com/intent/tweet?url=https://www.proqa.dev/2021/01/21/what-is-software-testing/                 | Twitter                      |
      | 3         | https://www.facebook.com/sharer/sharer.php?u=https://www.proqa.dev/2021/01/21/what-is-sdlc/         | Facebook              |
      | 3         | https://www.linkedin.com/shareArticle?mini=true&url=https://www.proqa.dev/2021/01/21/what-is-sdlc/  | LinkedIn Login, Sign in \| LinkedIn|
      | 3         | https://twitter.com/intent/tweet?url=https://www.proqa.dev/2021/01/21/what-is-sdlc/                 | Twitter                      |


