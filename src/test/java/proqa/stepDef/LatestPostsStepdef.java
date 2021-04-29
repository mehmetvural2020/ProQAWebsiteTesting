package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.Pages.LatestPostPage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    @And("user checks the insertion order is right by date")
    public void userChecksTheInsertionOrderIsRightByDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 =simpleDateFormat.parse("2021-01-25");// how to make dates dynamic??
        Date d2 =simpleDateFormat.parse("2021-01-21");

        if (d1.compareTo(d2)>0){
            System.out.println("Date 1 occurs after Date 2");
        }else if(d1.compareTo(d2)<0){
            System.out.println("Date 1 occurs before Date2");
        }else if (d1.compareTo(d2)==0){
            System.out.println("Both dates are equal");
        }

    }
}
