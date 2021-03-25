package proqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class SecondaryMenu {

    public SecondaryMenu() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy (xpath = "(//a[@class=\"custom_url\"])[1]")
    public WebElement email;

    @FindBy (xpath = "//span[normalize-space()='info@proqa.dev']")
    public WebElement emailtext;

    @FindBy (xpath = "(//a[@class = \"custom_url\"])[1]")
    public WebElement address;

    @FindBy (xpath = "(//i[@class=\"flaticon-twitter\"])[1]")
    public WebElement twitter;

    @FindBy (xpath = "(//span[normalize-space()='ProQA'])[1]")
    public WebElement twittertext;

    @FindBy (xpath = "(//i[@class=\"flaticon-linked-in\"])[1]")
    public WebElement linkedin;



}


