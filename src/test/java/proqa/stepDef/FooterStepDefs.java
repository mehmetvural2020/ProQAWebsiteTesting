package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.Pages.FooterPage;
import proqa.utils.MyDriver;

public class FooterStepDefs extends Base {
    FooterPage footer = new FooterPage();

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

//    @And("The email is recorded to the system")
//    public void theEmailIsRecordedToTheSystem() {
//
//    }

    @When("User clicks to Twitter icon")
    public void userClicksToTwitterIcon() {
        click(footer.Twitter);
    }

    @Then("Correct Twitter page is opened")
    public void correctTwitterPageIsOpened() {

        waitSomeTime(2000L);
        String expected = "https://twitter.com/proqadev";
        String actual =  MyDriver.get().getCurrentUrl();
        verifyTheText(expected, actual);
        waitSomeTime(1000L);
        logger.info("{} is displayed.", expected);

    }

    @When("User clicks to Linkedin icon")
    public void userClicksToLinkedinIcon() {
        click(footer.Linkedin);
    }

    @Then("Correct Linkedin page is opened")
    public void correctLinkedinPageIsOpened() {
        waitSomeTime(2000L);
        String expected = "https://www.linkedin.com/company/proqa";      //https://www.linkedin.com/company/proqa/about/  BUG??
        String actual =  MyDriver.get().getCurrentUrl();
        verifyTheText(expected, actual);
        waitSomeTime(1000L);
        logger.info("{} is displayed.", expected);


    }

    @Then("The address Chicago,IL is present on home screen")
    public void theAddressChicagoILIsPresentOnHomeScreen() {
        textIsDisplayedAndEnabled("Chicago, IL", footer.Address);
    }


}
