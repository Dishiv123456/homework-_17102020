package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(linkText = "Log in")
    WebElement _loginLink;
    @FindBy(linkText = "Register")
    WebElement _registerLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    WebElement _computerTab;
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement _welcomeToOurStoreMessage;

    //This method will click on Log in Link
    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link : " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on Login link : " + _loginLink.toString());
    }

    //This method will click on register link
    public void clickOnRegisterLink() {
        Reporter.log("Clicking on register link" + _registerLink.toString() + "<br>");
        clickOnElement(_registerLink);
        log.info("Clicking on register Link" + _registerLink.toString());
    }

    //This method will click on computers Tab
    public void clickOnComputersTab() {
        Reporter.log("Clicking on computers tab" + _computerTab.toString() + "<br>");
        clickOnElement(_computerTab);
        log.info("Clicking on computers tab" + _computerTab.toString());
    }
    public String VerifyLoginSuccessfully() {
        Reporter.log("login Successfully Text" + _welcomeToOurStoreMessage.toString() + "<br>");
       String getMessage =getTextFromElement(_welcomeToOurStoreMessage);
        log.info("login Successfully Text" + _welcomeToOurStoreMessage.toString());
        return getMessage;
    }


}
