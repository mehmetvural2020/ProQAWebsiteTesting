package proqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LatestPostsPage {

    @FindBy(xpath = "//div[@class='post-media-wrapper']//a[contains(text(),'January 25, 2021')]")
    public WebElement dateOfPost;

    @FindBy(xpath = "//div[@class='page_title_container scroll_anim']//h1[@class='page_title'][text()='January 25, 2021']" )
    public WebElement headerDate;
}
