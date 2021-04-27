package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.Pages.BlogFirstPostPage;

public class BlogThirdPostStepDefs extends Base {

    BlogFirstPostPage blogPage = new BlogFirstPostPage();

    @When("User clicks on Blog")
    public void userClicksOnBlog() {
        moveToElement(blogPage.blog);
        waitSomeTime(1000L);
        click(blogPage.blog);
    }

    @And("User opens third post")
    public void userOpensThirdPost() {
    }

    @When("Third Post title is present")
    public void thirdPostTitleIsPresent() {
    }

    @When("The Previous Post title is present")
    public void thePreviousPostTitleIsPresent() {
    }

    @Then("The Previous post arrow is present")
    public void thePreviousPostArrowIsPresent() {
    }

    @When("The Next post title is present")
    public void theNextPostTitleIsPresent() {
    }

    @Then("The Next post arrow is present")
    public void theNextPostArrowIsPresent() {
    }

    @When("Related posts title is present")
    public void relatedPostsTitleIsPresent() {
    }

    @Then("First and Second Posts are present")
    public void firstAndSecondPostsArePresent() {
    }
}
