package proqa.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.pages.SecondaryMenuPage;
import proqa.utils.MyDriver;

public class SecondaryStepDef extends Base {

    SecondaryMenuPage secondaryMenu = new SecondaryMenuPage();

    @Given("User is on home page")
    public void userIsOnHomePage() {
    }


    @When("User clicks and verifies “email”")
    public void userClicksAndVerifiesEmail() {
       textIsDisplayedAndEnabled("info@proqa.dev", secondaryMenu.emailText);
       // waitSomeTime(200L);
        click(secondaryMenu.email);
    }

//    @Then("default email editor is opened")
//    public void defaultEmailEditorIsOpened() {
////        String defEmailAddress = MyDriver.get().getCurrentUrl();
////        verifyTheText(defEmailAddress, " https://mail.google.com/mail/u/0/?fs=1&tf=cm&source=mailto&to=info@proqa.dev" );
//      //textIsDisplayedAndEnabled("New Message" , secondaryMenu.newMessage);
//      //textIsDisplayedAndEnabled("info@proqa.dev", secondaryMenu.defaultEmail);
//    }

    @Then("the address in Chicago,IL is displayed on home screen")
    public void theAddressInChicagoILIsDisplayedOnHomeScreen() {
        textIsDisplayedAndEnabled("Chicago, IL" , secondaryMenu.address);
    }


    @When("User clicks to “Twitter“ icon")
    public void userClicksToTwitterIcon() {
        click(secondaryMenu.twitter);
        waitSomeTime(500L);
    }

    @Then("correct Twitter page is opened")
    public void correctTwitterPageIsOpened() {
        textIsDisplayedAndEnabled("ProQA", secondaryMenu.twitterText);
        String twitterUrl = MyDriver.get().getCurrentUrl();
        verifyTheText(twitterUrl, "https://twitter.com/proqadev" );

    }

    @When("User clicks to “Linkedin“ icon")
    public void userClicksToLinkedinIcon() {
        click(secondaryMenu.linkedin);

    }

    @Then("correct Linkedin page is opened")
    public void correctLinkedinPageIsOpened() {
        textIsDisplayedAndEnabled("ProQA", secondaryMenu.linkedinText);
        String linkedinUrl = MyDriver.get().getCurrentUrl();
        verifyTheText(linkedinUrl, "https://www.linkedin.com/company/proqa" );

    }


}
