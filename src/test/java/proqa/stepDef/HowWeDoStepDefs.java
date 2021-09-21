package proqa.stepDef;

import io.cucumber.java.en.Then;
import proqa.pages.HowWeDoPage;

public class HowWeDoStepDefs extends Base{

    HowWeDoPage howWeDoPage = new HowWeDoPage();

    @Then("Elements under How We Do section are displayed")
    public void elementsUnderHowWeDoSectionAreDisplayed() {

        scrollDown(howWeDoPage.howWeDoIcon);

        waitSomeTime(2000L);

        textIsDisplayedAndEnabled("How We Do", howWeDoPage.howWeDoHeading);

        imageIsDisplayedAndEnabled(howWeDoPage.fileIcon);

        imageIsDisplayedAndEnabled(howWeDoPage.firstNumber);

        textIsDisplayedAndEnabled("Scope Analysis", howWeDoPage.scopeAnalysisHeading);

        textIsDisplayedAndEnabled("Determine what it is you need to be tested", howWeDoPage.scopeAnalysisExplanation);

        imageIsDisplayedAndEnabled(howWeDoPage.clockIcon);

        imageIsDisplayedAndEnabled(howWeDoPage.secondNumber);

        textIsDisplayedAndEnabled("Plan", howWeDoPage.planHeading);

        textIsDisplayedAndEnabled("Allocate resources, plan the duration and frequency of testing", howWeDoPage.planExplanation);

        imageIsDisplayedAndEnabled(howWeDoPage.rocketIcon);

        imageIsDisplayedAndEnabled(howWeDoPage.thirdNumber);

        textIsDisplayedAndEnabled("Test", howWeDoPage.testHeading);

        textIsDisplayedAndEnabled("Running tests and reporting bugs", howWeDoPage.testExplanation);

        imageIsDisplayedAndEnabled(howWeDoPage.chartIcon);

        imageIsDisplayedAndEnabled(howWeDoPage.forthNumber);

        textIsDisplayedAndEnabled("Report", howWeDoPage.reportHeading);

        textIsDisplayedAndEnabled("Receive your in-depth reports", howWeDoPage.reportExplanation);

        textIsDisplayedAndEnabled("Improve time to market with continuous delivery and test automation, and dramatically reduce your cost per change by detecting bugs early",
                howWeDoPage.lastDescription);




    }
}
