package proqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class Footer {

    public Footer() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//h3[contains (text(),'About Us')]")
    public WebElement AboutUs;

    @FindBy(xpath = "//h3[contains (text(),'Subscribe')]")
    public WebElement Subscribe;


}

