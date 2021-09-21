package proqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class BlogFirstPostPage {

    public BlogFirstPostPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "//ul[@id='menu-main-1']//a[normalize-space()='Blog']")
    public WebElement blog;

    @FindBy(xpath = "(//img[@class='attachment-full size-full wp-post-image'])[1]")
    public WebElement firstPostImage;

    @FindBy(xpath = "(//div[@class=\"blog-readmore-wrap\"])[1]")
    public WebElement arrow1;

    @FindBy(xpath = "(//h1[@class='page_title'])[1]")
    public WebElement firstPostTitle;

    @FindBy(xpath = "(//div[@class='post-nav-link'])[1]")
    public WebElement previousPost;

    @FindBy(xpath = "//img[@alt='What is Software Testing?']")
    public WebElement previousPostImage;

    @FindBy(xpath = "(//div[@class=\"post-nav-link\"])[1]")
    public WebElement previousPostArrow;

    @FindBy(xpath = "(//div[@class='post-nav-link'])[2]")
    public WebElement nextPost;

    @FindBy(xpath = "//img[@alt='What is SDLC?']")
    public WebElement nextPostImage;

    @FindBy(xpath = "(//div[@class=\"post-nav-link\"])[2]")
    public WebElement nextPostArrow;

    @FindBy(xpath = "//h2[@class='single-content-title']")
    public WebElement relatedPosts;

    @FindBy(xpath = "(//a[@rel='bookmark'])[1]")
    public WebElement secondPost;

    @FindBy(xpath = "(//a[@rel='bookmark'])[2]")
    public WebElement thirdPost;

    @FindBy(xpath = "//input[@id='author']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//textarea[@id='comment']")
    public WebElement commentField;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement postButton;

    @FindBy(xpath = "//h2[@class='comments-title single-content-title']")
    public WebElement comments;

    @FindBy(xpath = "(//input[@type='search'])[3]")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='page_title_container scroll_anim']//h1[@class='page_title'][normalize-space()='Search']")
    public WebElement searchResultPage;

    @FindBy(xpath = "(//div[@class='widget-title h5'])[1]")
    public WebElement newsleter;

    @FindBy(xpath = "(//div[@class='widget-title h5'])[2]")
    public WebElement recentPosts;

    @FindBy(xpath = "(//div[@class='recent_post_content'])[1]")
    public WebElement recentPost_1;

    @FindBy(xpath = "(//div[@class='recent_post_content'])[2]")
    public WebElement recentPost_2;

    @FindBy(xpath = "(//div[@class='recent_post_content'])[3]")
    public WebElement recentPost_3;

    @FindBy(xpath = "(//div[@class='widget-title h5'])[3]")
    public WebElement tag;

    @FindBy(xpath = "//a[@class='tag-cloud-link tag-link-50 tag-link-position-1']")
    public WebElement tag_1;

    @FindBy(xpath = "//a[@class='tag-cloud-link tag-link-53 tag-link-position-2']")
    public WebElement tag_2;

}
