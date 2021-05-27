package proqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class LatestPostPage {

    public LatestPostPage() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//div[@class='post-media-wrapper']//a[contains(text(),'January 25, 2021')]")
    public WebElement firstPostDate;

    @FindBy(xpath = "//div[@id='post-2111']//div[@class='post-media-wrapper']//a[contains(text(),'January 21, 2021')]")
    public WebElement secondDate;

    @FindBy(xpath = " //a[normalize-space()='The Need for Test Automation']")
    public WebElement firstPostText;

    @FindBy(xpath = "//a[normalize-space()='The Need for Test Automation']")
    public WebElement pageTitle;

    @FindBy(xpath = "(//i[@class = 'fab fa-facebook-square'])[1]")
    public WebElement firstFacebookIcon;

    @FindBy(xpath ="//h2[text()='Facebook']" )
    public WebElement facebookLogo;

    @FindBy(xpath = "(//i[@class='fab fa-linkedin'])[1]")
    public WebElement linkedinIcon;

    @FindBy(xpath = "//a[text()='Read Full Blog']")
    public WebElement blogLink;

    @FindBy(xpath ="//p[text()='Expand your knowledge in Software Testing with our latest content.']" )
    public WebElement mainText;

    @FindBy(xpath ="//strong[text()='The significant problems we face cannot be solved by the same level of thinking that created them.']" )
    public WebElement einsteinText;

    @FindBy(xpath ="//p[text()='Insights to help you do what you do better. Read our blog to enhance level of your thinking! ']" )
    public WebElement bottomText;





}