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

    @Then("First and second posts are present")
    public void firstAndSecondPostsArePresent() {
    }
}
