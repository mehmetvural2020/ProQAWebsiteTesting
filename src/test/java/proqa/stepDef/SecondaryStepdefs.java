package proqa.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.pages.SecondaryMenu;
import proqa.stepDef.Base;

public class SecondaryStepdefs extends Base {

    SecondaryMenu secondaryMenu = new SecondaryMenu();

    @Given("User is on home page")
    public void userIsOnHomePage() {
    }

    @When("user clicks to “email”")
    public void userClicksToEmail() {
    }

    @Then("user verifies that default email editor opened")
    public void userVerifiesThatDefaultEmailEditorOpened() {
    }

    @When("User verifies that address “Chicago, IL“ is displayed on the home page")
    public void userVerifiesThatAddressChicagoILIsDisplayedOnTheHomePage() {
    }

    @When("User clicks to “Twitter“ icon")
    public void userClicksToTwitterIcon() {
    }

    @Then("User verifies the open page for Twitter")
    public void userVerifiesTheOpenPageForTwitter() {
    }

    @When("User clicks to “Linkedin“ icon")
    public void userClicksToLinkedinIcon() {
    }

    @Then("User verifies the open page for Linkedin")
    public void userVerifiesTheOpenPageForLinkedin() {
    }
}
