package proqa.pages;

import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class SecondaryMenu {

    public SecondaryMenu() {
        PageFactory.initElements(MyDriver.get(), this);
    }


}


