package proqa.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import proqa.pages.LogosPage;

public class LogosStepDefs extends Base {

    LogosPage logoSection = new LogosPage();

    @Given("User is on Landing page")
    public void userIsOnLandingPage() {
    }

    @When("Verifies that Logos are present")
    public void verifiesThatLogosArePresent() {
        waitSomeTime(3000L);
        scrollDown(logoSection.seleniumLogo);
        imageIsDisplayedAndEnabled(logoSection.seleniumLogo);
        imageIsDisplayedAndEnabled(logoSection.bitbucketLogo);
        imageIsDisplayedAndEnabled(logoSection.cucumberLogo);
        imageIsDisplayedAndEnabled(logoSection.jiraSoftwareLogo);
        imageIsDisplayedAndEnabled(logoSection.jenkinsLogo);
        imageIsDisplayedAndEnabled(logoSection.appiumLogo);
        imageIsDisplayedAndEnabled(logoSection.mavenLogo);
        imageIsDisplayedAndEnabled(logoSection.azureLogo);
        imageIsDisplayedAndEnabled(logoSection.javaLogo);
        imageIsDisplayedAndEnabled(logoSection.restAssuredLogo);
        imageIsDisplayedAndEnabled(logoSection.apacheJMeterLogo);
        imageIsDisplayedAndEnabled(logoSection.testNGLogo);

    }


}
