package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import proqa.Pages.LatestPostPage;
import proqa.utils.MyDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

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

    @When("The user gets the first post title")
    public void theUserGetsTheFirstPostTitle() {
        latest.firstPostText.getText();
    }

    @Then("user clicks on the first post and lands to the relevant post page")
    public void userClicksOnTheFirstPostAndLandsToTheRelevantPostPage() {
        latest.firstPostText.click();
    }

    @And("verifies the page title")
    public void verifiesThePageTitle() {
        String postTitle = latest.pageTitle.getText();
        verifyTheText(latest.firstPostText.getText(),postTitle);

    }

    @Then("The user clicks on the “Facebook“ icon")
    public void theUserClicksOnTheFacebookIcon() {
        theUserGetsTheFirstPostTitle();
       // setAttribute(latest.firstFacebookIcon); //facebook link opens in the same tab
        latest.firstFacebookIcon.click();
    }

    @And("and lands on to Facebook page and verifies the text on Facebook page and closes the page")
    public void andLandsOnToFacebookPageAndVerifiesTheTextOnFacebookPageAndClosesThePage() {
        Set<String> allWindowHandles = MyDriver.get().getWindowHandles();
        System.out.println(allWindowHandles.size());//output-->2
        Iterator<String> it = allWindowHandles.iterator();//in order to iterate through window
        String mainPageHandle = it.next();//declaring main page
        String faceHandle = it.next();// declaring facebook page
        MyDriver.get().switchTo().window(faceHandle);//Stepping forward to facebook

        String expected="Facebook";
        String actual = latest.facebookLogo.getText();
        verifyTheText(expected,actual);
        MyDriver.get().close();
        MyDriver.get().switchTo().window(mainPageHandle);//stepping forward to main page

    }

    @Then("The user clicks on the “Linkedin“ icon")
    public void theUserClicksOnTheLinkedinIcon() {
        latest.linkedinIcon.click();
    }

    @And("and lands on to Linkedin page and verifies the text on Linkedin page and closes the page")
    public void andLandsOnToLinkedinPageAndVerifiesTheTextOnLinkedinPageAndClosesThePage() {
        Set<String> allWindowHandles = MyDriver.get().getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        String mainW = iterator.next();
        String linkedinW = iterator.next();
        MyDriver.get().switchTo().window(linkedinW);
        String actualUrl = MyDriver.get().getCurrentUrl();
        String expectedUrl = "https://www.linkedin.com/uas/login?session_redirect=https%3A%2F%2Fwww.linkedin.com%2FshareArticle%3Fmini%3Dtrue%26url%3Dhttps%3A%2F%2Fwww.proqa.dev%2F2021%2F01%2F25%2Fthe-need-for-test-automation%2F";

        verifyTheText(actualUrl, expectedUrl);
        MyDriver.get().close();
    }

    @Then("The user clicks on the Read full blog link")
    public void theUserClicksOnTheReadFullBlogLink() {
        latest.blogLink.click();

          }

    @And("and lands on to Blog page and verifies the text on page and closes the page")
    public void andLandsOnToBlogPageAndVerifiesTheTextOnPageAndClosesThePage() {
        String actualTitle = MyDriver.get().getTitle();
        String expectedTitle = "Blog – proqa.dev";
        verifyTheText(actualTitle,expectedTitle);
    }

    @Then("The user checks {string},{string},{string}")
    public void theUserChecks(String MainText, String EinsteinText, String BottomText) {
        String expectedMainText = latest.mainText.getText();
        String expectedEinsteinText =latest.einsteinText.getText();
        String expectedBottomText = latest.bottomText.getText();

        Assert.assertEquals(MainText,expectedMainText);
        Assert.assertEquals(EinsteinText,expectedEinsteinText);
        Assert.assertEquals(BottomText,expectedBottomText);




    }
}
