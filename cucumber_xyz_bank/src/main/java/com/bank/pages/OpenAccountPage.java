package com.bank.pages;

import com.bank.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @FindBy(xpath = "//div[@class='border box padT20 ng-scope']/div/button[2]")
    WebElement _openAccountBtn;
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement _selectCustomer;
    @FindBy(xpath = "//select[@id='currency']")
    WebElement _selectCurrency;
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement _processBtn;


    //This method will will select customer name from drop down
    public void clickOnCustomerDropDown(String name, int index) {
        Reporter.log("clicking customer drop down " + _selectCustomer.toString() + "<br>");
        clickOnElement(_selectCustomer);
        selectByIndexFromDropDown(_selectCustomer, index);
        log.info("clicking customer drop down " + _selectCustomer.toString());
    }

    //This method will will select currency pound from drop down
    public void clickOnPoundFromDropDown(int index) {
        Reporter.log("clicking Pound currency from drop down " + _selectCurrency.toString() + "<br>");
        clickOnElement(_selectCurrency);
        selectByIndexFromDropDown(_selectCurrency, index);
        log.info("clicking Pound currency from drop down " + _selectCurrency.toString());
    }

    //This method will click on process btn
    public void clickOnProcessBtn() {
        Reporter.log("clicking on process btn " + _processBtn.toString() + "<br>");
        log.info("clicking on process btn " + _processBtn.toString());
        clickOnElement(_processBtn);

    }

    public void verifyAccountCreatedSuccessfully() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertTrue(alertText.contains("Account created successfully"));
        alert.accept();
    }

}
