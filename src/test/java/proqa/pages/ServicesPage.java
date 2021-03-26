package proqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class ServicesPage {
    public ServicesPage() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath="//img[@src='https://www.proqa.dev/wp-content/uploads/2019/09/img_03-3.jpg']")
    public WebElement webTestingImage;

    @FindBy(xpath="(//div[@class='srv-container'])[1]")
    public WebElement webTestingText;

    @FindBy(xpath="//div[@class='vc_column-inner vc_custom_1610731348470']//img")
    public WebElement mobileTestingImage;

    @FindBy(xpath="(//div[@class='srv-container'])[2]")
    public WebElement mobileTestingText;

    @FindBy(xpath="//div[@class='vc_column-inner vc_custom_1610731358584']//img")
    public WebElement qaConsultingImage;

    @FindBy(xpath="(//div[@class='srv-container'])[3]")
    public WebElement qaConsultingText;

    @FindBy(xpath="//div[@class='vc_column-inner vc_custom_1610731373516']//img")
    public WebElement performanceTestingImage;

    @FindBy(xpath="(//div[@class='srv-container'])[4]")
    public WebElement performanceTestingText;

    @FindBy(xpath="//div[@class='vc_column-inner vc_custom_1610731382403']//img")
    public WebElement manualTestingImage;

    @FindBy(xpath="(//div[@class='srv-container'])[5]")
    public WebElement manualTestingText;

    @FindBy(xpath="//div[@class='vc_column-inner vc_custom_1610731391888']//img")
    public WebElement automatedTestingImage;

    @FindBy(xpath="(//div[@class='srv-container'])[6]")
    public WebElement automatedTestingText;
}
