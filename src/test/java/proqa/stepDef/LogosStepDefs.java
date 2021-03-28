package proqa.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import proqa.pages.LogosPage;
import proqa.utils.ConfigurationReader;
import proqa.utils.MyDriver;

public class LogosStepDefs extends Base {

    LogosPage logoSection = new LogosPage();

    @Given("User is on Landing page")
    public void userIsOnLandingPage() {

        String expected = "https://www.proqa.dev/";
        String actual = MyDriver.get().getCurrentUrl();
        Assert.assertEquals(expected, actual);
        logger.info("proqa.dev website url is {}", actual);
        waitSomeTime(3000L);
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
