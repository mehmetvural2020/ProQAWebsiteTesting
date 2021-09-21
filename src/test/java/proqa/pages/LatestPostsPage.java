package proqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LatestPostsPage {

    @FindBy(xpath = "//div[@class='post-media-wrapper']//a[contains(text(),'January 25, 2021')]")
    public WebElement firstDateOfPost;

    @FindBy(xpath = "(//a[text()='January 21, 2021'])[1]" )
    public WebElement secondDateOfPost;
}
