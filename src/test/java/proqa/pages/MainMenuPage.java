package proqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.stepDef.Base;
import proqa.utils.MyDriver;

public class MainMenuPage extends Base {

    public MainMenuPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }
    @FindBy(xpath = "(//img[@alt='proqa.dev'])[1]")
    public WebElement mainLogo;

    @FindBy(linkText = "Home")
    public WebElement homeText;

    @FindBy(linkText = "Services")
    public WebElement servicesText;

    @FindBy(xpath = "(//h3[@class='rb_textmodule_title has_divider'])[1]")
    public WebElement serviceDiv;

    @FindBy(xpath = "//ul[@id='menu-main-1']//a[text()='How We Do']")
    public WebElement howWeDo;

    @FindBy(xpath = " (//h3[@class='rb_textmodule_title has_divider'])[2]")
    public WebElement howWeDoText;

    @FindBy(linkText = "Principles")
    public WebElement principles;

    @FindBy(xpath = "//h3[text()='ProQA Principles']")
    public WebElement proqaPrinciplesText;

    @FindBy(linkText = "Blog")
    public WebElement blog;

    @FindBy(xpath = "(//h1[@class='page_title'])[1]")
    public WebElement blogText;

    @FindBy(linkText = "Contact")
    public WebElement contact;

    @FindBy(xpath = " //h3[text()='Free Consultation']")
    public WebElement freeConsultationText;






}
