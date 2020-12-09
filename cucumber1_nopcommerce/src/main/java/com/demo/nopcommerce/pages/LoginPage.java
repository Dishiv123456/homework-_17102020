package com.demo.nopcommerce.pages;

import com.cucumber.listener.Reporter;
import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static Logger log =LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//input[@id='Email']")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;

    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement _welcomeText;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement _errorMessage;

    public void enterEmailId(String email) {
waitFor(2);
        Reporter.addStepLog("Entering email address : " + email + " to email field : " + _emailField.toString() + "<br>");
       sendTextToElement(_emailField, email);
        log.info("Entering email address : " + email + " to email field : " + _emailField.toString());
    }

    public void enterPassword(String password) {
        waitFor(2);
        Reporter.addStepLog("Entering password : " + password + " to password field : " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Entering password : " + password + " to password field : " + _passwordField.toString());
    }

    public void clickOnLoginButton() {
        waitFor(2);
        Reporter.addStepLog("Clicking on login button : " + _loginBtn.toString() + "<br>");
        clickOnElement(_loginBtn);
        log.info("Clicking on login button : " + _loginBtn.toString());
    }

    public String getWelcomeText() {
        waitFor(2);
        Reporter.addStepLog("Getting text from : " + _welcomeText.toString() + "<br>");
        String getMessage= getTextFromElement(_welcomeText);
        log.info("Getting text from : " + _welcomeText.toString());
        return getMessage;
    }
    public String VerifyErrorMessage(){
        waitFor(2);
        Reporter.addStepLog("get error message "+_errorMessage.toString()+"<br>");
       String errorMessage= getTextFromElement(_errorMessage);
        log.info("get error message "+_errorMessage.toString());
        return errorMessage;
    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }
}
