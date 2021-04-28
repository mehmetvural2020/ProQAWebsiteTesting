package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import proqa.Pages.BlogHomePage;
import proqa.utils.MyDriver;

public class SinglePostSteps extends Base {
    BlogHomePage blogHomePage = new BlogHomePage();

    // First post test

    @And("user clicks on first post")
    public void userClicksOnFirstPost() {
        click(blogHomePage.firstPost);
        waitSomeTime(2000L);
    }

    @Then("user verifies first post")
    public void userVerifiesFirstPost() {
        String expected = "The Need for Test Automation – proqa.dev";
        String actual = MyDriver.get().getTitle();
        verifyTheText(expected,actual);
        waitSomeTime(1000L);
    }

    // Second post test
    @And("user clicks on second post")
    public void userClicksOnSecondPost() {
        click(blogHomePage.secondPost);
        waitSomeTime(2000L);
    }

    @Then("user verifies second post")
    public void userVerifiesSecondPost() {
        String expected = "What is Software Testing? – proqa.dev";
        String actual = MyDriver.get().getTitle();
        verifyTheText(expected,actual);
        waitSomeTime(1000L);
    }

    // Third post test

    @And("user clicks on third post")
    public void userClicksOnThirdPost() {
        click(blogHomePage.thirdPost);
        waitSomeTime(2000L);
    }

    @Then("user verifies third post")
    public void userVerifiesThirdPost() {
        String expected = "What is SDLC? – proqa.dev";
        String actual = MyDriver.get().getTitle();
        verifyTheText(expected,actual);
        waitSomeTime(2000L);
        MyDriver.get().close();
    }
}
