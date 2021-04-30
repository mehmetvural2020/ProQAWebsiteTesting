package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.Pages.BlogSecondPostPage;

public class BlogSecondPostStepDefs extends Base {

    BlogSecondPostPage blogSecondPostPage = new BlogSecondPostPage();

    @And("User clicks on second post")
    public void userClicksOnSecondPost() {
        moveToElement(blogSecondPostPage.secondPostImage);
        waitSomeTime(2000L);
        click(blogSecondPostPage.arrow2);
    }

    @When("Second Post title is present")
    public void secondPostTitleIsPresent() {
        textIsDisplayedAndEnabled("What is Software Testing?",blogSecondPostPage.secondPostTitle);
    }

    @When("Previous Post heading is present")
    public void previousPostHeadingIsPresent() {
        String expected = "PREVIOUS POST";
        textIsDisplayedAndEnabled(expected,blogSecondPostPage.previousPost);
    }

    @Then("Previous Post arrow is present")
    public void previousPostArrowIsPresent() {
        moveToElement(blogSecondPostPage.previousPostPhoto);
        waitSomeTime(3000L);
        imageIsDisplayedAndEnabled(blogSecondPostPage.previousPostArrow);
    }

    @Then("Next Post Arrow is present")
    public void nextPostArrowIsPresent() {
        moveToElement(blogSecondPostPage.nextPostPhoto);
        waitSomeTime(3000L);
        imageIsDisplayedAndEnabled(blogSecondPostPage.nextPostArrow);
    }

    @Then("First and third posts are present")
    public void firstAndThirdPostsArePresent() {
        textIsDisplayedAndEnabled("The Need for Test Automation",blogSecondPostPage.firstPost);
        textIsDisplayedAndEnabled("What is SDLC?",blogSecondPostPage.secondPost);
    }



}
