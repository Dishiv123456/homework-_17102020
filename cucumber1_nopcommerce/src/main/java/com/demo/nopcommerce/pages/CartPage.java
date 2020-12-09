package com.demo.nopcommerce.pages;


import com.cucumber.listener.Reporter;
import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage extends Utility {
    private static final Logger log = LogManager.getLogger(CartPage.class.getName());

    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement _ShoppingCart;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")
    WebElement _updateShoppingCartBtn;
    @FindBy(xpath = "//tbody/tr[1]/td[7]/span[1]")
    WebElement _updateCartMessage;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement _registrationSuccessfullyMessage;
    @FindBy(className = "ico-logout")
    WebElement _logOutBtn;


    //This method will clear default quantity and add 2
    public void clickToClearAddQtyBox() {
        Reporter.addStepLog("clear default quantity and add 2" + _ShoppingCart.toString() + "<br>");
        clearTextFromField((By) _ShoppingCart);

        log.info("clear default quantity and add 2  " + _ShoppingCart.toString());
    }
    public void clickToAddQtyBox() {
        Reporter.addStepLog("clear default quantity and add 2" + _ShoppingCart.toString() + "<br>");

        sendTextToElement(_ShoppingCart, "2");
        log.info("clear default quantity and add 2  " + _ShoppingCart.toString());
    }

    //this method will update shopping cart
    public void clickToUpdateShoppingCart() {
        Reporter.addStepLog("click to update shopping cart " + _updateShoppingCartBtn.toString() + "<br>");
        clickOnElement(_updateShoppingCartBtn);
        log.info("click to update shopping cart  " + _ShoppingCart.toString());
    }

    //This method will get text to verify
    public String getMessageToVerifyUpdateCart() {
        Reporter.addStepLog("get message to varify " + _updateCartMessage.toString() + "<br>");
        String getMessage = getTextFromElement(_updateCartMessage);
        log.info("get message to varify" + _updateCartMessage.toString());
        return getMessage;
    }
    //This method we return get message that registration successfully
    public String verifyRegistrationSuccessfullyMessage() {
        Reporter.addStepLog("verify message for registration successfully" + _registrationSuccessfullyMessage.toString()+ "<br>");
        String getMessage=getTextFromElement(_registrationSuccessfullyMessage);
        log.info("verify message for registration successfully" + _registrationSuccessfullyMessage.toString());
        return getMessage;
    }
    //This method will click on log out btn
    public void clickOnLogOut() {
        Reporter.addStepLog("click on logout button" + _logOutBtn.toString() + "<br>");
        clickOnElement(_logOutBtn);
        log.info("click on logout button" + _logOutBtn.toString());
    }


}
