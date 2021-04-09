package proqa.stepDef;

import io.cucumber.java.en.And;
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
    @And("User opens first post")
    public void userOpensFirstPost() {

        moveToElement(blogPage.firstPostImage);
        waitSomeTime(3000L);
        click(blogPage.firstPostImage);

    }


}
