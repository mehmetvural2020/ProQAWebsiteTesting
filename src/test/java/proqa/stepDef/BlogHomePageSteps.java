package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import proqa.Pages.BlogHomePage;
import proqa.utils.MyDriver;

import java.util.List;

public class BlogHomePageSteps extends Base{
    BlogHomePage blogHomePage = new BlogHomePage();

    @Given("user is in landing page")
    public void userIsInLandingPage() {
        click(blogHomePage.blog);
        waitSomeTime(1000L);
    }

    @When("user verifies Home link")
    public void userVerifiesHomeLink() {
        verifyTheText("HomeBlog", blogHomePage.homeBlogText.getText());
    }

    @And("user clicks on Home")
    public void userClicksOnHome() {
        waitSomeTime(1000L);
        click(blogHomePage.homeBlog);
    }

    @Then("user verifies Homepage url")
    public void userVerifiesHomepageUrl() {
        waitSomeTime(1000L);
        String expected = "https://www.proqa.dev/";
        String actual =  MyDriver.get().getCurrentUrl();

        verifyTheText(expected, actual);
        waitSomeTime(1000L);
    }


    @And("user clicks on {int}")
    public void userClicksOn(int postLink) {
        List<WebElement> socialMedia = blogHomePage.postLinks.findElements(By.xpath("(//h3[@class='post-title']/a)[" + postLink + "]"));
        click(socialMedia.iterator().next());
    }

    @Then("user verifies  {string}")
    public void userVerifies(String postTitle) {
        waitSomeTime(2000L);
        String expected = postTitle;
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);
    }


    @And("user verifies {int} and {string} and click on it")
    public void userVerifiesPostOrderAndAndClickOnIt(int postOrder, String sMAttribute) {

        List<WebElement> socialMedia = blogHomePage.socialM1.findElements(By.tagName("a"));
        List<WebElement> socialMedia2 = blogHomePage.socialM2.findElements(By.tagName("a"));
        List<WebElement> socialMedia3 = blogHomePage.socialM3.findElements(By.tagName("a"));

        if (postOrder == 2) socialMedia = socialMedia2;
        else if (postOrder == 3 ) socialMedia = socialMedia3;

        for(WebElement link : socialMedia) {
            waitSomeTime(1L);
            if (link.getAttribute("href").equals(sMAttribute)){
                Assert.assertTrue(link.isDisplayed());
                setAttribute(link);
                click(link);
                break;
            }

        }
    }

    @Then("user verifies SM {string}")
    public void userVerifiesSM(String sMTitle) {
        waitSomeTime(1000L);
        String expected = sMTitle;
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);
    }
}
