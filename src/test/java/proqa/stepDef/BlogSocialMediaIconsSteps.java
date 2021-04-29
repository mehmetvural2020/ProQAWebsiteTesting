package proqa.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import proqa.Pages.BlogHomePage;
import proqa.utils.MyDriver;

public class BlogSocialMediaIconsSteps extends Base{
    BlogHomePage blogHomePage = new BlogHomePage();
    @And("user verifies facebook icon")
    public void userVerifiesFacebookIcon() {
        String actual = blogHomePage.facebook1.getAttribute("href");
        String expected = "https://www.facebook.com/sharer/sharer.php?u=https://www.proqa.dev/2021/01/25/the-need-for-test-automation/";
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(blogHomePage.facebook1.isDisplayed());
    }

    @And("user clicks on facebook post")
    public void userClicksOnFacebookPost() {
        setAttribute(blogHomePage.facebook1);
        click(blogHomePage.facebook1);
        waitSomeTime(3000L);
    }

    @Then("user verifies facebook page")
    public void userVerifiesFacebookPage() {
        String expected = "Facebook";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);
    }

    //Second facebook icon test
    @And("user verifies second facebook icon")
    public void userVerifiesSecondFacebookIcon() {
        String actual = blogHomePage.facebook2.getAttribute("href");
        String expected = "https://www.facebook.com/sharer/sharer.php?u=https://www.proqa.dev/2021/01/21/what-is-software-testing/";
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(blogHomePage.facebook2.isDisplayed());
    }

    @And("user clicks on second facebook post")
    public void userClicksOnSecondFacebookPost() {
        setAttribute(blogHomePage.facebook2);
        click(blogHomePage.facebook2);
        waitSomeTime(3000L);
    }

    @Then("user verifies second facebook page")
    public void userVerifiesSecondFacebookPage() {
        String expected = "Facebook";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);
    }

    //Third facebook icon test

    @And("user verifies third facebook icon")
    public void userVerifiesThirdFacebookIcon() {
        String actual = blogHomePage.facebook3.getAttribute("href");
        String expected = "https://www.facebook.com/sharer/sharer.php?u=https://www.proqa.dev/2021/01/21/what-is-sdlc/";
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(blogHomePage.facebook3.isDisplayed());
    }

    @And("user clicks on third facebook post")
    public void userClicksOnThirdFacebookPost() {
        setAttribute(blogHomePage.facebook3);
        click(blogHomePage.facebook3);
        waitSomeTime(3000L);
    }

    @Then("user verifies third facebook page")
    public void userVerifiesThirdFacebookPage() {
        String expected = "Facebook";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);
        MyDriver.get().close();
    }
}
