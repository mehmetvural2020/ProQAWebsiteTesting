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




}
