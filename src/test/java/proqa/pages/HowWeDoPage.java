package proqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class HowWeDoPage {

    public HowWeDoPage(){
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "//i[@class='flaticon-layers']")
    public WebElement howWeDoIcon;

    @FindBy(xpath = "(//h3[@class='rb_textmodule_title has_divider'])[2]")
    public WebElement howWeDoHeading;

    @FindBy(xpath = "//i[@class='flaticon-project-1']")
    public WebElement fileIcon;

    @FindBy(xpath = "(//span[@class='number title_ff'])[1]")
    public WebElement firstNumber;

    @FindBy(xpath = "(//p[@class='h3 roadmap_title'])[1]")
    public WebElement scopeAnalysisHeading;

    @FindBy(xpath = "(//p[@class='roadmap_description'])[1]")
    public WebElement scopeAnalysisExplanation;

    @FindBy(xpath = "//i[@class='flaticon-clockwise-rotation']")
    public WebElement clockIcon;

    @FindBy(xpath = "(//span[@class='number title_ff'])[2]")
    public WebElement secondNumber;

    @FindBy(xpath = "(//p[@class='h3 roadmap_title'])[2]")
    public WebElement planHeading;

    @FindBy(xpath = "(//p[@class='roadmap_description'])[2]")
    public WebElement planExplanation;

    @FindBy(xpath = "//i[@class='flaticon-rocket']")
    public WebElement rocketIcon;

    @FindBy(xpath = "(//span[@class='number title_ff'])[3]")
    public WebElement thirdNumber;

    @FindBy(xpath = "(//p[@class='h3 roadmap_title'])[3]")
    public WebElement testHeading;

    @FindBy(xpath = "(//p[@class='roadmap_description'])[3]")
    public WebElement testExplanation;

    @FindBy(xpath = "//i[@class='flaticon-chart-1']")
    public WebElement chartIcon;

    @FindBy(xpath = "(//span[@class='number title_ff'])[4]")
    public WebElement forthNumber;

    @FindBy(xpath = "(//p[@class='h3 roadmap_title'])[4]")
    public WebElement reportHeading;

    @FindBy(xpath = "(//p[@class='roadmap_description'])[4]")
    public WebElement reportExplanation;

    @FindBy(xpath = "//p[contains(text(),'Improve time to market with continuous delivery and test ')]")
    public WebElement lastDescription;


}
