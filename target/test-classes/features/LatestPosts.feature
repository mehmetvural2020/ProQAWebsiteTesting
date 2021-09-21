Feature: Functionality of Latest Post

  Background: User is on home page

    @dateOrder
  Scenario: Checking order of date
    When user scrolls down to Latest Posts and checks the header date
    Then user gets the second date by order
    And user checks the insertion order is right by date

    @relatedPost
  Scenario: Checking relevant post
    When The user gets the first post title
    Then user clicks on the first post and lands to the relevant post page
    And verifies the page title

    @facebook
  Scenario: Facebook Post
    When The user gets the first post title
    Then The user clicks on the “Facebook“ icon
    And and lands on to Facebook page and verifies the text on Facebook page and closes the page

  @linkedin
  Scenario: Linkedin Post
    When The user gets the first post title
    Then The user clicks on the “Linkedin“ icon
    And and lands on to Linkedin page and verifies the text on Linkedin page and closes the page

  @readBlog
  Scenario: Read full Blog Post
    When The user gets the first post title
    Then The user clicks on the Read full blog link
    And and lands on to Blog page and verifies the text on page and closes the page

  @text
  Scenario Outline: Text check
    When The user gets the first post title
    Then The user checks "<MainText>","<EinsteinText>","<BottomText>"
    Examples:
      | MainText                                                        | EinsteinText                                                                                    | BottomText                                                                                  |
      |Expand your knowledge in Software Testing with our latest content.|The significant problems we face cannot be solved by the same level of thinking that created them.|Insights to help you do what you do better. Read our blog to enhance level of your thinking! Read Full Blog|



