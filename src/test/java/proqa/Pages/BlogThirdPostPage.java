package proqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class BlogThirdPostPage {

    public BlogThirdPostPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "//ul[@id='menu-main-1']//a[normalize-space()='Blog']")
    public WebElement blog;

    @FindBy(xpath = "(//img[@class='attachment-full size-full wp-post-image'])[3]")
    public WebElement thirdPostImage;

    @FindBy(xpath = "(//div[@class=\"blog-readmore-wrap\"])[3]")
    public WebElement arrow3;

    @FindBy(xpath = "//div[@class='page_title_container scroll_anim']//h1[@class='page_title'][normalize-space()='What is SDLC?']")
    public WebElement thirdPostTitle;

    @FindBy(xpath = "//a[normalize-space()='Previous Post']")
    public WebElement previousPost;

    @FindBy(xpath = "//img[@alt='The Need for Test Automation']")
    public WebElement previousPostPhoto;

    @FindBy(xpath = "(//div[@class=\"post-nav-link\"])[1]")
    public WebElement previousPostArrow;

    @FindBy(xpath = "(//a[@rel='bookmark'])[1]")
    public WebElement firstPost;

    @FindBy(xpath = "(//span[@class='post-title'])[2]")
    public WebElement secondPost;




}
