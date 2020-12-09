package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());
    @FindBy(xpath = "//button[2][contains(text(),'Deposit')]")
    WebElement _depositClick;
    @FindBy(xpath = "//div[@class='form-group']/input")
    WebElement _depositAmount;
    @FindBy(xpath = "//form[@name='myForm']/button")
    WebElement _depositFinalClick;
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement _getMessageDeposit;
    @FindBy(xpath = "//button[3][contains(text(),'Withdraw')]")
    WebElement _withdrawalBtn;
    @FindBy(xpath = "//div[@class='form-group']/input")
    WebElement _withdrawalAmount;
    @FindBy(xpath = "//form[@name='myForm']/button")
    WebElement _withdrawalFinalClick;
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement _getMessage;


    //This method will click to deposit Tab
    public void ClickOnDepositTab() {
        Reporter.log("clicking on deposit" + _depositClick.toString() + "<br>");
        clickOnElement(_depositClick);
        log.info("clicking on deposit" + _depositClick.toString());
    }

    //This method will deposit money
    public void depositMoney(String money) {
        Reporter.log("deposit money " + _depositAmount.toString() + "<br>");
        sendTextToElement(_depositAmount, money);
        log.info("deposit money " + _depositAmount.toString());
    }

    public void ClickOnDepositFinalTab() {
        Reporter.log("clicking on deposit" + _depositFinalClick.toString() + "<br>");
        clickOnElement(_depositFinalClick);
        log.info("clicking on deposit" + _depositFinalClick.toString());
    }

    public String getMessageToVerifyDeposit() {
        Reporter.log("get message to verify" + _getMessageDeposit.toString() + "<br>");
        String message = getTextFromElement(_getMessageDeposit);
        log.info("get message to verify" + _getMessageDeposit.toString());
        return message;
    }

    //This method will click on withdrawal btn
    public void clickToWithdrawalBtn() {
        Reporter.log("clicking on Withdrawal btn" + _withdrawalBtn.toString() + "<br>");
        clickOnElement(_withdrawalBtn);
        log.info("clicking on Withdrawal btn" + _withdrawalBtn.toString());
    }

    //This method will withdrawal amount
    public void enterWithdrawalAmount(String withdrawal) {
        Reporter.log("enter Withdrawal amount" + _withdrawalAmount.toString() + "<br>");
        sendTextToElement(_withdrawalAmount, withdrawal);
        log.info("enter Withdrawal amount" + _withdrawalAmount.toString());
    }

    public void ClickOnWithdrawalFinalTab() {
        Reporter.log("clicking on Withdrawal" + _withdrawalFinalClick.toString() + "<br>");
        clickOnElement(_withdrawalFinalClick);
        log.info("clicking on Withdrawal" + _withdrawalFinalClick.toString());
    }

    public String getMessageToVerify() {
        Reporter.log("get message to verify" + _getMessage.toString() + "<br>");
        String message= getTextFromElement(_getMessage);
        log.info("get message to verify" + _getMessage.toString());
        return message;
    }

}
