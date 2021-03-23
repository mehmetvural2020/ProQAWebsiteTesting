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
}
