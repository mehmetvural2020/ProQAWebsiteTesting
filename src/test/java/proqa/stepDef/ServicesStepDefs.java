package proqa.stepDef;

import io.cucumber.java.en.When;
import proqa.pages.ServicesPage;

public class ServicesStepDefs extends Base {

    ServicesPage servicesPage = new ServicesPage();

    @When("User verifies that Services Images are present")
    public void userVerifiesThatServicesImagesArePresent() {

        scrollDown(servicesPage.services);

        waitSomeTime(2000L);

        imageIsDisplayedAndEnabled(servicesPage.webTestingImage);

        imageIsDisplayedAndEnabled(servicesPage.mobileTestingImage);

        imageIsDisplayedAndEnabled(servicesPage.qaConsultingImage);

        imageIsDisplayedAndEnabled(servicesPage.performanceTestingImage);

        imageIsDisplayedAndEnabled(servicesPage.manualTestingImage);

        imageIsDisplayedAndEnabled(servicesPage.automatedTestingImage);
    }

    @When("User verifies that Services Texts are present")
    public void userVerifiesThatServicesTextsArePresent() {

        scrollDown(servicesPage.services);

        waitSomeTime(2000L);

        textIsDisplayedAndEnabled("Web Testing", servicesPage.webTestingText);

        textIsDisplayedAndEnabled("Mobile Testing", servicesPage.mobileTestingText);

        textIsDisplayedAndEnabled("QA Consulting", servicesPage.qaConsultingText);

        textIsDisplayedAndEnabled("Performance Testing", servicesPage.performanceTestingText);

        textIsDisplayedAndEnabled("Manual Testing", servicesPage.manualTestingText);

        textIsDisplayedAndEnabled("Automated Testing", servicesPage.automatedTestingText);

    }
}
