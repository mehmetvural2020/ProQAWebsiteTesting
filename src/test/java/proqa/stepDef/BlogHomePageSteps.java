package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import proqa.Pages.BlogHomePage;

public class BlogHomePageSteps extends Base{
    BlogHomePage blogHomePage = new BlogHomePage();

    @Given("user is in landing page")
    public void userIsInLandingPage() {
    }

    @When("user verifies Home link")
    public void userVerifiesHomeLink() {
    }

    @And("user clicks on Home")
    public void userClicksOnHome() {
    }
}
