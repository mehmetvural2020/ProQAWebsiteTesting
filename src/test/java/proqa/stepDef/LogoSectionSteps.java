package proqa.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import proqa.pages.LogoSection;
import proqa.utils.ConfigurationReader;
import proqa.utils.MyDriver;

public class LogoSectionSteps extends Base{

    LogoSection logoSection = new LogoSection();

    Logger logger = LoggerFactory.getLogger(LogoSectionSteps.class);

    @Given("User is on Landing page")
    public void userIsOnLandingPage() {
        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        String expected = "proqa.dev-Ensuring Quality";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected,actual);
        logger.info("proqa.dev website title is {}", actual);
    }

    @When("Verifies that {string} are present")
    public void verifiesThatArePresent(String value) {

       if(value.equals(logoSection.seleniumLogo.getAttribute("alt"))){

           imageIsDisplayedAndEnabled(logoSection.seleniumLogo);
       }
       else if(value.equals(logoSection.bitbucketLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.bitbucketLogo);
       }
       else if(value.equals(logoSection.cucumberLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.cucumberLogo);
       }
       else if(value.equals(logoSection.jiraSoftwareLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.jiraSoftwareLogo);
       }
       else if(value.equals(logoSection.jenkinsLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.jenkinsLogo);
       }
       else if(value.equals(logoSection.appiumLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.appiumLogo);
       }
       else if(value.equals(logoSection.mavenLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.mavenLogo);
       }
       else if(value.equals(logoSection.azureLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.azureLogo);
       }
       else if(value.equals(logoSection.javaLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.javaLogo);
       }
       else if(value.equals(logoSection.restAssuredLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.restAssuredLogo);
       }
       else if(value.equals(logoSection.apacheJMeterLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.apacheJMeterLogo);
       }
       else if(value.equals(logoSection.testNGLogo.getAttribute("alt"))){
           imageIsDisplayedAndEnabled(logoSection.testNGLogo);
       }


    }
}
