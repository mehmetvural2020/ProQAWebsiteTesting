package proqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class LogosPage {

    public LogosPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "(//img[@class='image'])[1]")
    public WebElement seleniumLogo;

    @FindBy(xpath = "(//img[@class='image'])[2]")
    public WebElement bitbucketLogo;

    @FindBy(xpath = "(//img[@class='image'])[3]")
    public WebElement cucumberLogo;

    @FindBy(xpath = "(//img[@class='image'])[4]")
    public WebElement jiraSoftwareLogo;

    @FindBy(xpath = "(//img[@class='image'])[5]")
    public WebElement jenkinsLogo;

    @FindBy(xpath = "(//img[@class='image'])[6]")
    public WebElement appiumLogo;

    @FindBy(xpath = "(//img[@class='image'])[7]")
    public WebElement mavenLogo;

    @FindBy(xpath = "(//img[@class='image'])[8]")
    public WebElement azureLogo;

    @FindBy(xpath = "(//img[@class='image'])[9]")
    public WebElement javaLogo;

    @FindBy(xpath = "(//img[@class='image'])[10]")
    public WebElement restAssuredLogo;

    @FindBy(xpath = "(//img[@class='image'])[11]")
    public WebElement apacheJMeterLogo;

    @FindBy(xpath = "(//img[@class='image'])[12]")
    public WebElement testNGLogo;


}
