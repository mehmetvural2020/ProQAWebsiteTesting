package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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

    @Then("Subtitle under About Us is present")
    public void subtitleUnderAboutUsIsPresent() {
        String expected = "ProQA offers independent software QA and testing services across multiple industries. Our team has diverse technology stack experience and our customers come from diverse industries. Whatever the problem, we can solve it efficiently.\n" +
                "\n" +
                "Whether you have desktop or mobile applications, our software testing specialists work with a focused approach to help you get more out of your testing efforts and improve time to market, and thus, your ROI.\n" +
                "\n" +
                "We believe that strong business relationships are built on trust and reliability. That’s why ProQA offers fair, transparent pricing at every stage of your project. With an emphasis on time-bound delivery and customized solutions, our quality assurance services help our partners manage the quality of their deliverables while keeping costs low.";
       String actual =  footer.Subtitle.getText();
        logger.info(actual);
        logger.info("{} is displayed.", expected);
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
        String expected = "https://www.linkedin.com/company/proqa";
        String actual =  MyDriver.get().getCurrentUrl();
        verifyTheText(expected, actual);
        waitSomeTime(1000L);
        logger.info("{} is displayed.", expected);


    }

    @When("The address Chicago,IL is present on home screen")
    public void theAddressChicagoILIsPresentOnHomeScreen() {
        textIsDisplayedAndEnabled("Chicago, IL", footer.Address);
    }

}
