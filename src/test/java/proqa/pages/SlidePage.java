package proqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class SlidePage {
    public SlidePage() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//rs-slide[@data-key='rs-1']")
    public WebElement slideImage1;

    @FindBy(xpath = "//*[contains (text(), 'agile testing')]")
    public  WebElement slideTitle1;

    @FindBy(xpath = "//rs-arrow[@class='tp-rightarrow tparrows persephone']")
    public WebElement rightArrow;

    @FindBy(xpath = "//rs-slide[@data-key='rs-2']")
    public WebElement slideImage2;

    @FindBy(xpath = "//rs-layer[@id='slider-1-slide-2-layer-7']")
    public WebElement slideTitle2;

    @FindBy(xpath = "//rs-layer[@id=\"slider-1-slide-2-layer-56\"]")
    public WebElement contactNowBtn;

    @FindBy(xpath = "//h3[contains(text(), 'Free Consultation')]")
    public WebElement freeConsultation;

    @FindBy(xpath = "//rs-slide[@data-key='rs-3']")
    public WebElement slideImage3;

    @FindBy(xpath = "//rs-layer[@id='slider-1-slide-3-layer-7']")
    public WebElement slideTitle3;

    @FindBy(xpath = "//rs-arrow[@class='tp-leftarrow tparrows persephone']")
    public WebElement leftArrow;
}
