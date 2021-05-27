package proqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class FooterPage {

    public FooterPage() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//h3[contains (text(),'About Us')]")
    public WebElement AboutUs;

    @FindBy(xpath = "(//div[@class='rb_textmodule_content_wrapper'])[11]")
    public WebElement Subtitle;

    @FindBy(xpath = "//h3[contains (text(),'Subscribe')]")
    public WebElement Subscribe;

    @FindBy(xpath = "//input[@id='wpforms-1842-field_2']")
    public WebElement EnterEmail;

    @FindBy(xpath = "//button[@id='wpforms-submit-1842']")
    public WebElement Arrow;

    @FindBy(xpath = "//p[contains(text(),'Thanks for contacting us! We will be in touch with')]")
    public WebElement Message;

    @FindBy(xpath = "(//i[@class='flaticon-twitter'])[2]")
    public WebElement Twitter;

    @FindBy(xpath = "(//i[@class='flaticon-linked-in'])[2]")
    public WebElement Linkedin;

    @FindBy(xpath = "(//span[contains (text(),'Chicago, IL')])[2]")
    public WebElement Address;


}

