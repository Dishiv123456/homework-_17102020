package com.demo.nopcommerce.pages;

import com.cucumber.listener.Reporter;
import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement _registrationText;
    @FindBy(xpath = "//span[@class='male']")
    WebElement _maleRadioButton;
    @FindBy(id = "FirstName")
    WebElement _firstNameField;
    @FindBy(id = "LastName")
    WebElement _lastNameField;
    @FindBy(xpath = "//form[1]//select[1]")
    WebElement _dayFieldDropDown;
    @FindBy(xpath = "//form[1]//select[2]")
    WebElement _monthFieldDropDown;
    @FindBy(xpath = "//form[1]//select[3]")
    WebElement _yearFieldDropDown;
    @FindBy(id = "Email")
    WebElement _emailIdField;
    @FindBy(xpath = "//input[@id='Company']")
    WebElement _companyNameField;
    @FindBy(id = "Password")
    WebElement _passwordField;
    @FindBy(id = "ConfirmPassword")
    WebElement _confirmPasswordField;
    @FindBy(id = "register-button")
    WebElement _registerBtn;
    @FindBy(xpath = "//span[contains(text(),'error')]")
    WebElement _requiredFieldErrorText;

    //This Method will get text once you click on registration link
    public String getRegistrationText() {
        Reporter.addStepLog("Landing on registration page " + _registrationText.toString() + "<br>");
        String getMessage = getTextFromElement(_registrationText);
        log.info("Landing on registration page" + _registrationText.toString());
        return getMessage;
    }

    //This method will select male radio button
    public void selectRadioBtn() {
        waitUntilElementToBeClickable(_maleRadioButton,20);
        Reporter.addStepLog("selected radio button" + _maleRadioButton.toString() + "<br>");
        clickOnElement(_maleRadioButton);
        log.info("selected radio button" + _maleRadioButton.toString());
    }

    //This method will enter first name on first name field
    public void enterFirstName(String firstName) {
        waitUntilElementToBeClickable(_firstNameField,20);
        Reporter.addStepLog("Entered first name" + firstName + _firstNameField.toString() + "<br>");
        sendTextToElement(_firstNameField, firstName);
        log.info("Entered first name" + firstName + _firstNameField.toString());
    }

    //This method will enter last name on last name field
    public void enterLastName(String lastName) {
        waitUntilElementToBeClickable(_lastNameField,20);
        Reporter.addStepLog("Entered last name" + lastName + _lastNameField.toString() + "<br>");
        sendTextToElement(_lastNameField, lastName);
        log.info("Entered last name" + lastName + _lastNameField.toString());
    }

    //This method will select day from day drop down
    public void selectDayFromDateOfBirthDropDown(String day) {
        Reporter.addStepLog("selected day from drop down" + day + _dayFieldDropDown.toString() + "<br>");
        sendTextToElement(_dayFieldDropDown, day);
        log.info("selected day from drop down" + day + _dayFieldDropDown.toString());
    }

    //This method will select month from day drop down
    public void selectMonthFromDateOfBirthDropDown(String month) {
        Reporter.addStepLog("selected month from drop down" + month + _monthFieldDropDown.toString() + "<br>");
        sendTextToElement(_monthFieldDropDown, month);
        log.info("selected month from drop down" + month + _monthFieldDropDown.toString());
    }

    //This method will select month from day drop down
    public void selectYearFromDateOfBirthDropDown(String year) {
        Reporter.addStepLog("selected year from drop down" + year + _yearFieldDropDown.toString() + "<br>");
        sendTextToElement(_yearFieldDropDown, year);
        log.info("selected year from drop down" + year + _yearFieldDropDown.toString());
    }

    //This method will enter email Id on email Id field
    public String enterEmailId(String emailId) {
        waitUntilElementToBeClickable(_emailIdField,20);
       int num= generateRandomNumber();
        emailId = "abc" + num + "@gmail.com";
        Reporter.addStepLog("enter email Id on field " + emailId + _emailIdField.toString() + "<br>");
        sendTextToElement(_emailIdField, emailId);
        log.info("enter email Id on field " + emailId + _emailIdField.toString());
        return emailId;


    }

    //This method will enter company name to company name filed
    public void enterCompanyName(String companyName) {
        Reporter.addStepLog("Entered company name " + companyName + _companyNameField.toString() + "<br>");
        sendTextToElement(_companyNameField, companyName);
        log.info("Entered company name " + companyName + _companyNameField.toString());
    }

    //This method will enter password in password field
    public void enterPassword(String password) {
        Reporter.addStepLog("entered password" + password + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("entered password" + password + _passwordField.toString());

    }

    //This method will enter password in password field
    public void enterConfirmPassword(String confirmPassword) {
        Reporter.addStepLog("entered confirm  password" + confirmPassword + _confirmPasswordField.toString() + "<br>");
        sendTextToElement(_confirmPasswordField, confirmPassword);
        log.info("entered confirm  password" + confirmPassword + _confirmPasswordField.toString());
    }

    //This method will click on register button
    public void clickOnRegisterButton() {
        Reporter.addStepLog("click on register button" + _registerBtn.toString() + "<br>");
        clickOnElement(_registerBtn);
        log.info("click on register button" + _registerBtn.toString());
    }

    public String verifyRequiredFieldErrorText() {
        Reporter.addStepLog(" when * marked mandatory fields are left empty " + _requiredFieldErrorText.toString());
        String message = getTextFromElement(_requiredFieldErrorText);

        log.info(" when * marked mandatory fields are left empty " + _requiredFieldErrorText.toString());
        return message;
    }

}
