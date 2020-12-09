package com.bank.pages;

import com.bank.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());
    @FindBy(xpath ="//select[@id='userSelect']")
    WebElement _selectCustomer;
    @FindBy(xpath ="//button[contains(text(),'Login')]")
    WebElement _loginBtn;

    //This method will will select customer name from drop down
    public void clickOnCustomerDropDown(String name, int index) {
        Reporter.log("clicking customer drop down " + _selectCustomer.toString() + "<br>");
        clickOnElement(_selectCustomer);
        selectByIndexFromDropDown(_selectCustomer, index);
        log.info("clicking customer drop down " + _selectCustomer.toString());
    }

    //This method will click on log in btn
    public void clickOnLoginBtn() {
        Reporter.log("clicking on login btn " + _loginBtn.toString() + "<br>");
        clickOnElement(_loginBtn);
        log.info("clicking on login btn " + _loginBtn.toString());
    }
}





