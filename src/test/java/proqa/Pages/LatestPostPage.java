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

}