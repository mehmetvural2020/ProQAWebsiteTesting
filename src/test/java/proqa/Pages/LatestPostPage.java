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



}