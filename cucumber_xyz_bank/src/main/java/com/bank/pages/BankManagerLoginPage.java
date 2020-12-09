package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());
    @FindBy(xpath ="//div[@class='border box padT20 ng-scope']/div/button[1]")
    WebElement _addCustomerLink;
    @FindBy(xpath ="//div[@class='border box padT20 ng-scope']/div/button[2]")
    WebElement _openAccountBtn;

    //This method will click on add customer link
    public void clickOnAddCustomerLink() {
        Reporter.log("clicking on add customer link " + _addCustomerLink.toString() + "<br>");
       log.info("clicking on add customer link " + _addCustomerLink.toString());
        clickOnElement(_addCustomerLink);

    }
    //This method will click on open account btn
    public void clickOnOpenAccountBtn() {
        Reporter.log("clicking on open account btn " + _openAccountBtn.toString() + "<br>");log.info("clicking on open account btn " + _openAccountBtn.toString());
        clickOnElement(_openAccountBtn);

    }
}
