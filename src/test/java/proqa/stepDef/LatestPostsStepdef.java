package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.Pages.LatestPostPage;

public class LatestPostsStepdef extends Base {

    LatestPostPage latest = new LatestPostPage();

    @When("user scrolls down to Latest Posts and checks the header date")
    public void userScrollsDownToLatestPostsAndChecksTheHeaderDate() {
        moveToElement(latest.firstPostDate);
        String firstDate = latest.firstPostDate.getText();
        System.out.println(firstDate);
    }


    @Then("user gets the second date by order")
    public void userGetsTheSecondDateByOrder() {
        moveToElement(latest.secondDate);
        String secondDate = latest.secondDate.getText();
        System.out.println(secondDate);
    }
}
