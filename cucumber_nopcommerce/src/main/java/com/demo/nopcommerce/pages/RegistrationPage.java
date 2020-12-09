package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


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

    //This Method will get text once you click on registration link
    public String getRegistrationText() {
        Reporter.log("Landing on registration page " + _registrationText.toString() + "<br>");
        String getMessage = getTextFromElement(_registrationText);
        log.info("Landing on registration page" + _registrationText.toString());
        return getMessage;
    }

    //This method will select male radio button
    public void selectRadioBtn() {
        waitUntilElementToBeClickable(_maleRadioButton,5);
        Reporter.log("selected radio button" + _maleRadioButton.toString() + "<br>");
        clickOnElement(_maleRadioButton);
        log.info("selected radio button" + _maleRadioButton.toString());
    }

    //This method will enter first name on first name field
    public void enterFirstName(String firstName) {
        waitUntilElementToBeClickable(_firstNameField,5);
        Reporter.log("Entered first name" + firstName + _firstNameField.toString() + "<br>");
        sendTextToElement(_firstNameField, firstName);
        log.info("Entered first name" + firstName + _firstNameField.toString());
    }

    //This method will enter last name on last name field
    public void enterLastName(String lastName) {
        Reporter.log("Entered last name" + lastName + _lastNameField.toString() + "<br>");
        sendTextToElement(_lastNameField, lastName);
        log.info("Entered last name" + lastName + _lastNameField.toString());
    }

    //This method will select day from day drop down
    public void selectDayFromDateOfBirthDropDown(String day) {
        Reporter.log("selected day from drop down" + day + _dayFieldDropDown.toString() + "<br>");
        sendTextToElement(_dayFieldDropDown, day);
        log.info("selected day from drop down" + day + _dayFieldDropDown.toString());
    }

    //This method will select month from day drop down
    public void selectMonthFromDateOfBirthDropDown(String month) {
        Reporter.log("selected month from drop down" + month + _monthFieldDropDown.toString() + "<br>");
        sendTextToElement(_monthFieldDropDown, month);
        log.info("selected month from drop down" + month + _monthFieldDropDown.toString());
    }

    //This method will select month from day drop down
    public void selectYearFromDateOfBirthDropDown(String year) {
        Reporter.log("selected year from drop down" + year + _yearFieldDropDown.toString() + "<br>");
        sendTextToElement(_yearFieldDropDown, year);
        log.info("selected year from drop down" + year + _yearFieldDropDown.toString());
    }

    //This method will enter email Id on email Id field
    public String enterEmailId(String emailId) {
        Reporter.log("enter email Id on field " + emailId + _emailIdField.toString() + "<br>");
        sendTextToElement(_emailIdField, emailId);
        log.info("enter email Id on field " + emailId + _emailIdField.toString());
        return emailId;
    }

    //This method will enter company name to company name filed
    public void enterCompanyName(String companyName) {
        Reporter.log("Entered company name " + companyName+_companyNameField.toString() + "<br>");
        sendTextToElement(_companyNameField, companyName);
        log.info("Entered company name " + companyName+_companyNameField.toString());
    }

    //This method will enter password in password field
    public void enterPassword(String password) {
        Reporter.log("entered password" + password+_passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("entered password" + password+_passwordField.toString());

    }

    //This method will enter password in password field
    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log("entered confirm  password" + confirmPassword+_confirmPasswordField.toString() + "<br>");
        sendTextToElement(_confirmPasswordField, confirmPassword);
        log.info("entered confirm  password" + confirmPassword+_confirmPasswordField.toString());
    }

    //This method will click on register button
    public void clickOnRegisterButton() {
        Reporter.log("click on register button" + _registerBtn.toString() + "<br>");
        clickOnElement(_registerBtn);
        log.info("click on register button" + _registerBtn.toString());
    }
}
