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

    @FindBy(xpath = "(//nav[@class=\"bread-crumbs\"])[1]")
    public WebElement homeBlogText;

    @FindBy(xpath = "//nav[@class=\"bread-crumbs\"]/a[1]")
    public WebElement homeBlog;

     @FindBy(xpath = "//h3[@class=\"post-title\"]")
    public WebElement postLinks;

    @FindBy(xpath = "(//div[@class=\"social-share\"])[1]")
        public WebElement socialM1;

    @FindBy(xpath = "(//div[@class=\"social-share\"])[2]")
        public WebElement socialM2;

    @FindBy(xpath = "(//div[@class=\"social-share\"])[3]")
        public WebElement socialM3;
}
