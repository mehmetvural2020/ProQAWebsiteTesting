package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.Pages.Footer;

public class FooterStepdefs extends Base {
    Footer footer = new Footer();

    @Given("user is on landing page")
    public void userIsOnLandingPage() {

    }

    @When("About Us title is present")
    public void aboutUsTitleIsPresent() {
        textIsDisplayedAndEnabled("About Us" ,footer.AboutUs);
    }


    @When("Subscribe title is present")
    public void subscribeTitleIsPresent() {
        textIsDisplayedAndEnabled("Subscribe" , footer.Subscribe);

    }

    @And("User enters an email address and clicks on the arrow")
    public void userEntersAnEmailAddressAndClicksOnTheArrow() {
        waitSomeTime(2000L);
        sendKeysValue("esum@gmail.com", footer.EnterEmail);
        waitSomeTime(2000L);
        click(footer.Arrow);

    }

    @Then("A message displays as Thanks for contacting us! We will be in touch with you shortly")
    public void aMessageDisplaysAsThanksForContactingUsWeWillBeInTouchWithYouShortly() {
        textIsDisplayedAndEnabled("Thanks for contacting us! We will be in touch with you shortly." ,footer.Message);

    }

    @And("The email is recorded to the system")
    public void theEmailIsRecordedToTheSystem() {
    }

    @When("User clicks to Twitter icon")
    public void userClicksToTwitterIcon() {
    }

    @Then("Correct Twitter page is opened")
    public void correctTwitterPageIsOpened() {
    }

    @When("User clicks to Linkedin icon")
    public void userClicksToLinkedinIcon() {
    }

    @Then("Correct Linkedin page is opened")
    public void correctLinkedinPageIsOpened() {
    }

    @Then("The address Chicago,IL is present on home screen")
    public void theAddressChicagoILIsPresentOnHomeScreen() {
    }


}
