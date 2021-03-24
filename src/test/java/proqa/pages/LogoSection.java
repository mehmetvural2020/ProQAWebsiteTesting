package proqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class LogoSection {

    public LogoSection(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "//div[@id='rb_image_605986d609a37']//img[@class='image']")
    public WebElement seleniumLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d609f7d']//img[@class='image']")
    public WebElement bitbucketLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d60a3e4']//img[@class='image']")
    public WebElement cucumberLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d60a7a3']//img[@class='image']")
    public WebElement jiraSoftwareLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d60ae30']//img[@class='image']")
    public WebElement jenkinsLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d60b1b2']//img[@class='image']")
    public WebElement appiumLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d60b60a']//img[@class='image']")
    public WebElement mavenLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d60b98f']//img[@class='image']")
    public WebElement azureLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d60c028']//img[@class='image']")
    public WebElement javaLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d60c320']//img[@class='image']")
    public WebElement restAssuredLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d60c6c9']//img[@class='image']")
    public WebElement apacheJMeterLogo;

    @FindBy(xpath = "//div[@id='rb_image_605986d60c9a2']//img[@class='image']")
    public WebElement testNGLogo;
}
