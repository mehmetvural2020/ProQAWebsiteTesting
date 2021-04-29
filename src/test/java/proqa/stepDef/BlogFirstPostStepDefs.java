package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.Pages.BlogFirstPostPage;

public class BlogFirstPostStepDefs extends Base {
    BlogFirstPostPage blogPage = new BlogFirstPostPage();


    @And("User opens first post")
    public void userOpensFirstPost() {

        moveToElement(blogPage.firstPostImage);
        waitSomeTime(3000L);
        click(blogPage.arrow1);

    }
    @When("First Post title is present")
    public void firstPostTitleIsPresent() {
        textIsDisplayedAndEnabled("The Need for Test Automation",blogPage.firstPostTitle);
    }

    @When("Previous Post is present")
    public void previousTitleIsPresent() {
        String expected = "PREVIOUS POST";
        textIsDisplayedAndEnabled(expected,blogPage.previousPost);
    }

    @Then("Previous post arrow is present")
    public void previousPostArrowIsPresent() {
        moveToElement(blogPage.previousPostImage);
        waitSomeTime(3000L);
        imageIsDisplayedAndEnabled(blogPage.previousPostArrow);

    }

    @When("Next Post is present")
    public void nextPostTitleIsPresent() {
        textIsDisplayedAndEnabled("NEXT POST",blogPage.nextPost);
    }

    @Then("Next Post arrow is present")
    public void nextPostArrowIsPresent() {
        moveToElement(blogPage.nextPostImage);
        waitSomeTime(2000L);
        imageIsDisplayedAndEnabled(blogPage.nextPostArrow);
    }

    @When("Related Posts title is present")
    public void relatedPostsTitleIsPresent() {
        textIsDisplayedAndEnabled("Related Posts",blogPage.relatedPosts);

    }

    @Then("Second and third posts are present")
    public void secondAndThirdPostsArePresent() {
        textIsDisplayedAndEnabled("What is Software Testing?",blogPage.secondPost);
        textIsDisplayedAndEnabled("What is SDLC?",blogPage.thirdPost);
    }

    @When("User writes and posts a comment")
    public void userWritesAndPostsAComment() {
        sendKeysValue("ozen",blogPage.nameBox);
        sendKeysValue("zenn.diamond@gmail.com",blogPage.emailBox);
        sendKeysValue("There is typo in newsletter heading ", blogPage.commentField);
        click(blogPage.postButton);
        textIsDisplayedAndEnabled("Comments", blogPage.comments);
    }

    @When("User makes a search")
    public void userMakesASearch() {
        sendKeysValue("test automation",blogPage.searchBox);
        click(blogPage.searchButton);
        textIsDisplayedAndEnabled("Search",blogPage.searchResultPage);
    }

    @When("Newsleter is present")
    public void newsleterIsPresent() {
        textIsDisplayedAndEnabled("Newsleter",blogPage.newsleter);
    }

    @When("Recent Posts is present")
    public void recentPostsTitleIsPresent() {
        textIsDisplayedAndEnabled("Recent Posts",blogPage.recentPosts);
    }

    @Then("Recent posts are present")
    public void recentPostsArePresent() {
        textIsDisplayedAndEnabled("The Need for Test Automation\n" +
                "Jan 25 2021",blogPage.recentPost_1);
        textIsDisplayedAndEnabled("What is Software Testing?\n" +
                "Jan 21 2021",blogPage.recentPost_2);
        textIsDisplayedAndEnabled("What is SDLC?\n" +
                "Jan 21 2021",blogPage.recentPost_3);
    }

    @When("Tags are present")
    public void tagsArePresent() {
        textIsDisplayedAndEnabled("Tag",blogPage.tag);
        textIsDisplayedAndEnabled("functional testing",blogPage.tag_1);
        textIsDisplayedAndEnabled("functional testing non-functional testing Software Software Development Life Cycle Software Development Process software testing", blogPage.tag_2);
    }


}
