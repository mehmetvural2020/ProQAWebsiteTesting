package proqa.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.pages.ServicesPage;

public class ServicesStepDefs extends Base {

    ServicesPage servicesPage = new ServicesPage();

    @Then("Services Images are displayed on the homepage")
    public void servicesImagesAreDisplayedOnTheHomepage() {

        scrollDown(servicesPage.services);

        waitSomeTime(2000L);

        imageIsDisplayedAndEnabled(servicesPage.mainText);

        imageIsDisplayedAndEnabled(servicesPage.webTestingImage);

        imageIsDisplayedAndEnabled(servicesPage.mobileTestingImage);

        imageIsDisplayedAndEnabled(servicesPage.qaConsultingImage);

        imageIsDisplayedAndEnabled(servicesPage.performanceTestingImage);

        imageIsDisplayedAndEnabled(servicesPage.manualTestingImage);

        imageIsDisplayedAndEnabled(servicesPage.automatedTestingImage);

        imageIsDisplayedAndEnabled(servicesPage.bottomText);
    }

    @Then("Services texts are displayed on the homepage")
    public void servicesTextsAreDisplayedOnTheHomepage() {

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
