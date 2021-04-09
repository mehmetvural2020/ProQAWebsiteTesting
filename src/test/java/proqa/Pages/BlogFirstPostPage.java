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

    @FindBy(xpath = "//a[@class='blog-readmore small arrow_fade_out rb_button'])[1]")
    public WebElement firstArrow;

    @FindBy(xpath = "(//span[@class='post-title'])[1]")
    public WebElement softwareTesting;

    @FindBy(xpath = "//img[@alt='What is Software Testing?']")
    public WebElement softwareTestingIcon;

    @FindBy(linkText = "Previous Post")
    public WebElement previousPost;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div/nav/ul/li[1]/a")
    public WebElement leftArrow;



}
