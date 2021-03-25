package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import proqa.pages.SlidePage;
import proqa.utils.MyDriver;

public class SlideStepDefs extends Base {
    SlidePage slidePage = new SlidePage();

    @Given("user is in landing page and verify")
    public void userIsInLandingPageAndVerify() {
        String expected = MyDriver.get().getCurrentUrl();
        String actual = "https://www.proqa.dev/";
        verifyTheText(expected, actual);
    }

    @When("user verifies that surfing man image is present")
    public void userVerifiesThatSurfingManImageIsPresent() {
        imageIsDisplayedAndEnabled(slidePage.slideImage1);
    }

    @And("user verifies that main slide title is present")
    public void userVerifiesThatMainSlideTitleIsPresent() {
        String expected = "agile testing";
        moveToElement(slidePage.slideTitle1);
        waitSomeTime(2000L);
        textIsDisplayedAndEnabled(expected, slidePage.slideTitle1);
    }

    @Then("user clicks on right arrow and verify contact slide")
    public void userClicksOnRightArrowAndVerifyContactSlide() {
        moveToElement(slidePage.rightArrow);
        waitSomeTime(3000L);
        click(slidePage.rightArrow);
        waitSomeTime(2000L);
        imageIsDisplayedAndEnabled(slidePage.slideImage2);
    }

    @Given("user is in landing page and click next arrow button")
    public void userIsInLandingPageAndClickNextArrowButton() {
    }

    @When("user verifies that meeting table image is present")
    public void userVerifiesThatMeetingTableImageIsPresent() {
    }

    @And("user verifies that contact slide title is present")
    public void userVerifiesThatContactSlideTitleIsPresent() {
    }

    @And("user clicks Contact Now and verifies")
    public void userClicksContactNowAndVerifies() {
    }

    @Then("user clicks on right arrow and verify the last slide")
    public void userClicksOnRightArrowAndVerifyTheLastSlide() {
    }

    @Given("user is in landing page and click next button two times")
    public void userIsInLandingPageAndClickNextButtonTwoTimes() {
    }

    @When("user verifies that smiling girl image is present")
    public void userVerifiesThatSmilingGirlImageIsPresent() {
    }

    @And("user verifies that the last slide title is present")
    public void userVerifiesThatTheLastSlideTitleIsPresent() {
    }

    @Then("user clicks on right arrow and verify main slide")
    public void userClicksOnRightArrowAndVerifyMainSlide() {
    }
}
