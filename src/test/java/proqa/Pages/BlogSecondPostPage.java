package proqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class BlogSecondPostPage {

    public BlogSecondPostPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "(//img[@class='attachment-full size-full wp-post-image'])[2]")
    public WebElement secondPostImage;

    @FindBy(xpath = "(//div[@class=\"blog-readmore-wrap\"])[2]")
    public WebElement arrow2;

    @FindBy(xpath = "(//h1[@class='page_title'])[1]")
    public WebElement secondPostTitle;

    @FindBy(xpath = "(//div[@class='post-nav-link'])[1]")
    public WebElement previousPost;

    @FindBy(xpath = "//img[@alt='What is SDLC?']")
    public WebElement previousPostPhoto;

    @FindBy(xpath = "(//div[@class=\"post-nav-link\"])[1]")
    public WebElement previousPostArrow;

    @FindBy(xpath = "//img[@alt='The Need for Test Automation']")
    public WebElement nextPostPhoto;

    @FindBy(xpath = "(//div[@class=\"post-nav-link\"])[2]")
    public WebElement nextPostArrow;

    @FindBy(xpath = "(//a[@rel='bookmark'])[1]")
    public WebElement firstPost;

    @FindBy(xpath = "(//a[@rel='bookmark'])[2]")
    public WebElement thirdPost;

}
