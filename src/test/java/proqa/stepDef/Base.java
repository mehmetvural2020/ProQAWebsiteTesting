package proqa.stepDef;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import proqa.utils.MyDriver;

public class Base {

    public Base() {
        PageFactory.initElements(MyDriver.get(), this);
    }
    Logger logger = LoggerFactory.getLogger(Base.class);


    public static void waitSomeTime(Long milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     *  this script must scroll, until link element is visible
     *  once link element visible, it will stop scrolling
     *  arguments[0] = means first webelement after comma (link)
     *  arguments it's an array of webelements after comma
     *  arguments[0] = link web element, it can be any web element
     */

    public void scrollDown(WebElement str) {
    /*
      If element is not visible, you have to find it
     */
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) MyDriver.get();

        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",str);
        //js.executeScript("window.scrollBy(0,50)");

    }

    protected void moveToElement(WebElement webElement) {
        Actions action = new Actions(MyDriver.get() );
        action.moveToElement(webElement).perform();
    }

    protected void moveAndClickToElement(WebElement webElement) {
        Actions action = new Actions(MyDriver.get());
        action.moveToElement(webElement).click().perform();
    }

    protected void verifyTheText(String expected, String actual) {
        Assert.assertEquals(expected, actual);
//        boolean verifyReturn;
//        boolean verifyText = expected.equalsIgnoreCase(actual);
//        if(verifyText){
//            logger.info("{} text is displayed.",actual);
//        }else logger.info("{} is not displayed.",expected);
    }

    protected void click(WebElement webElement) {
        webElement.click();
    }

    protected void textIsDisplayedAndEnabled(String expected, WebElement webElement) {
        String actual;
        actual = webElement.getText();
//        System.out.println(actual);
        if(expected.equalsIgnoreCase(actual)){
            Assert.assertEquals(expected, actual);
            logger.info("{} is displayed.", expected);
        }else logger.error("!!!Error...{} is not displayed.", expected);
    }

    protected void imageIsDisplayedAndEnabled(WebElement webElement) {
        if (webElement.isDisplayed() && webElement.isEnabled()) {
            logger.info("This picture is displayed and enabled.");
        }
    }
    protected void sendKeysValue(String value, WebElement webElement) {
        webElement.clear();
        webElement.sendKeys(value);
    }
     protected void setAttribute(WebElement webElement) {
         JavascriptExecutor js = (JavascriptExecutor) MyDriver.get();
         js.executeScript("arguments[0].setAttribute('target', '')", webElement );
    }


}
