package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.Pages.BlogThirdPostPage;

public class BlogThirdPostStepDefs extends Base {

    BlogThirdPostPage blogThirdPostPage = new BlogThirdPostPage();

    @And("User clicks on third post")
    public void userClicksOnThirdPost() {
        moveToElement(blogThirdPostPage.thirdPostImage);
        waitSomeTime(2000L);
        click(blogThirdPostPage.arrow3);
    }

    @When("Third Post title is present")
    public void thirdPostTitleIsPresent() {
        textIsDisplayedAndEnabled("What is SDLC?", blogThirdPostPage.thirdPostTitle);
    }

    @When("Previous Post Heading is present")
    public void previousPostHeadingIsPresent() {
        String expected = "PREVIOUS POST";
        textIsDisplayedAndEnabled(expected,blogThirdPostPage.previousPost);
    }

    @Then("Previous Post Arrow is present")
    public void previousPostArrowIsPresent() {
        moveToElement(blogThirdPostPage.previousPostPhoto);
        waitSomeTime(3000L);
        imageIsDisplayedAndEnabled(blogThirdPostPage.previousPostArrow);
    }

    @Then("First and second posts are present")
    public void firstAndSecondPostsArePresent() {
        textIsDisplayedAndEnabled("The Need for Test Automation",blogThirdPostPage.firstPost);
        textIsDisplayedAndEnabled("What is Software Testing?",blogThirdPostPage.secondPost);
    }



}
