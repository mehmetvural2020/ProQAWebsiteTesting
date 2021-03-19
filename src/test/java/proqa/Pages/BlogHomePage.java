package proqa.Pages;

import org.openqa.selenium.support.PageFactory;
import proqa.utils.MyDriver;

public class BlogHomePage {
    public BlogHomePage() {
        PageFactory.initElements(MyDriver.get(), this);
    }


}
