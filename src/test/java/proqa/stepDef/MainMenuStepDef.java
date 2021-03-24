package proqa.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import proqa.pages.MainMenuPage;

public class MainMenuStepDef extends Base {

    MainMenuPage mainMenuPage=new MainMenuPage();

    @Given("user is on Homepage")
    public void userIsOnHomepage() {

    }

    @Then("verifies the logo and texts on main menu")
    public void verifiesTheLogoAndTextsOnMainMenu() {

       mainMenuPage.mainLogo.isDisplayed();
       textIsDisplayedAndEnabled("Home", mainMenuPage.homeText);
       click(mainMenuPage.homeText);

       textIsDisplayedAndEnabled("Services",mainMenuPage.servicesText);
       click(mainMenuPage.servicesText);
       mainMenuPage.serviceDiv.isDisplayed();

       textIsDisplayedAndEnabled("How We Do", mainMenuPage.howWeDo);
       click(mainMenuPage.howWeDo);
       mainMenuPage.howWeDoText.isDisplayed();

        textIsDisplayedAndEnabled("Principles", mainMenuPage.principles);
        click(mainMenuPage.principles);
        mainMenuPage.proqaPrinciplesText.isDisplayed();

        textIsDisplayedAndEnabled("Blog", mainMenuPage.blog);
        click(mainMenuPage.blog);
        mainMenuPage.blogText.isDisplayed();

        textIsDisplayedAndEnabled("Contact", mainMenuPage.contact);
        click(mainMenuPage.contact);
        mainMenuPage.freeConsultationText.isDisplayed();


    }

}
