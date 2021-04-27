package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.Pages.BlogHomePage;
import proqa.utils.MyDriver;

public class BlogHomePageSteps extends Base{
    BlogHomePage blogHomePage = new BlogHomePage();

    @Given("user is in landing page")
    public void userIsInLandingPage() {
        click(blogHomePage.blog);
        waitSomeTime(2000L);
//        click(blogHomePage.arrow1);
//        waitSomeTime(3000L);
//        moveToElement(blogHomePage.previous1);
//        waitSomeTime(2000L);
//        click(blogHomePage.previous1);
//        moveAndClickToElement(blogHomePage.previous1);
//        waitSomeTime(3000L);
    }

    @When("user verifies Home link")
    public void userVerifiesHomeLink() {
        verifyTheText("HomeBlog", blogHomePage.homeBlogText.getText());
    }

    @And("user clicks on Home")
    public void userClicksOnHome() {
        waitSomeTime(2000L);
        click(blogHomePage.homeBlog);
    }

    @Then("user verifies Homepage url")
    public void userVerifiesHomepageUrl() {
        waitSomeTime(2000L);
        String expected = "https://www.proqa.dev/";
        String actual =  MyDriver.get().getCurrentUrl();

        verifyTheText(expected, actual);
        waitSomeTime(1000L);
    }
}
