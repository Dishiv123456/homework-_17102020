package com.xcart.pages;

import com.xcart.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(xpath = "//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[2]/div[3]/button[1]/span[1]")
    WebElement _signUpLink;
    @FindBy(xpath = "//tbody/tr[4]/td[1]/a[1]")
    WebElement _createNewAccountTab;
    @FindBy(xpath = "//input[@id='login']")
    WebElement _emailField;
    @FindBy(xpath = "//input[@id='password']")
    WebElement _passwordField;
    @FindBy(xpath = "//input[@id='password-conf']")
    WebElement _ConfirmPasswordField;
    @FindBy(xpath = "//span[contains(text(),'Create')]")
    WebElement _createButton;
    @FindBy(xpath = "//h1[@id='page-title']")
    WebElement _myAccountText;
    @FindBy(xpath = "//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[1]/a/span")
    WebElement _homeTab;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[2]/h1")
    WebElement _HomePageText;
    @FindBy(xpath = "//span[contains(text(),'Electronics')]")
    WebElement _electronicButton;
    @FindBy(xpath = "//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[4]/a/span")
    WebElement _newTab;


    //This method will click on sign up link
    public void clickSignUpLink() {
        waitUntilElementToBeClickable(_signUpLink, 30);
        Reporter.log("Clicking on sign up link" + _signUpLink.toString() + "<br>");
        log.info("Clicking on sign up link" + _signUpLink.toString());
        clickOnElement(_signUpLink);
    }

    //This methos will click on new account tab
    public void clickOnNewAccountTab() {
        Reporter.log("Clicking on new Account tab" + _createNewAccountTab.toString() + "<br>");
        log.info("Clicking on new Account tab" + _createNewAccountTab.toString());
        clickOnElement(_createNewAccountTab);
    }

    //This method will send text to email address field
    public void enterEmailAddressToEmailField() {
        String num = getRandomString(8);
        Reporter.log("enter email address" + _emailField.toString() + "<br>");
        log.info("enter email address" + _emailField.toString());
        sendTextToElement(_emailField, num + "123@gmail.com");
    }


    //This method will send password to password field
    public void enterPasswordToPasswordField(String password) {
        Reporter.log("enter password" + _passwordField.toString() + "<br>");
        log.info("enter password" + _passwordField.toString());
        sendTextToElement(_passwordField, password);
    }

    //This method will send confirm password to confirm password field
    public void enterPasswordToConfirmPasswordField(String confirmPassword) {
        Reporter.log("enter confirm password" + _ConfirmPasswordField.toString() + "<br>");
        log.info("enter confirm password" + _ConfirmPasswordField.toString());
        sendTextToElement(_ConfirmPasswordField, confirmPassword);
    }

    //This method will click on create button
    public void clickOnCreateButton() {
        //  waitUntilElementToBeClickable(_signUpLink, 50);
        Reporter.log("clicking on create button" + _createButton.toString() + "<br>");
        log.info("clicking on create button" + _createButton.toString());
        clickOnElement(_createButton);
    }

    //This method will get text to verity that user is on account page
    public String VerifyUserShouldNavigateToMyAccountPage() {
        Reporter.log("get text from account successfully" + _myAccountText.toString() + "<br>");
        log.info("\"get text from account successfully\"+_myAccountText.toString()");
        return getTextFromElement(_myAccountText);

    }

    //This method will click on home page tab
    public void clickOnHomePageTab() {
        Reporter.log("Clicking on homePage tab" + _homeTab.toString() + "<br>");
        log.info("Clicking on homePage tab" + _homeTab.toString());
        clickOnElement(_homeTab);

    }

    //this method willl verify that user is on home page
    public String VerifyUserShouldNavigateToHomePage() {
        Reporter.log("get text from home page successfully" + _HomePageText.toString() + "<br>");
        log.info("get text from home page successfully" + _HomePageText.toString());
        return getTextFromElement(_HomePageText);
    }

    //This method will click on electronic button
    public void clickOnElectronicButton() {
        Reporter.log("Clicking on electronicButton" + _electronicButton.toString() + "<br>");
        log.info("Clicking on electronicButton" + _electronicButton.toString());
        clickOnElement(_electronicButton);

    }

    //This method will click on new tab
    public void clickOnNewTab() {
        Reporter.log("Clicking on new tab" + _newTab.toString() + "<br>");
        log.info("Clicking on new tab" + _newTab.toString());
        clickOnElement(_newTab);

    }
}
