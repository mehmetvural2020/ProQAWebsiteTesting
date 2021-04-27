package proqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class BlogHomePage {
    public BlogHomePage() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(linkText = "Blog")
    public WebElement blog;

    @FindBy(xpath = "(//div[@class=\"blog-readmore-wrap\"])[1]")
    public WebElement arrow1;

    @FindBy(xpath = "(//div[@class=\"post-nav-link\"])[1]")
    public WebElement previous1;

    @FindBy(xpath = "(//nav[@class=\"bread-crumbs\"])[1]")
    public WebElement homeBlogText;

    @FindBy(xpath = "//nav[@class=\"bread-crumbs\"]/a[1]")
    public WebElement homeBlog;

    @FindBy(xpath = "//*[contains(text(),'The Need for Test Automation')]")
    public WebElement firstPost;

    @FindBy(xpath = "//*[contains(text(),'What is Software Testing?')]")
    public WebElement secondPost;

    @FindBy(xpath = "//*[contains(text(),'What is SDLC?')]")
    public WebElement thirdPost;















}
