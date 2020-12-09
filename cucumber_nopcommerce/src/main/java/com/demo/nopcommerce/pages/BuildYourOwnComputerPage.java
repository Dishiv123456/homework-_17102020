package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement _getBuildYourOwnComputerText;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement _ProcessordropDown;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement _RAMDropDown;
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']/ul/li[2]//label[contains(text(),'400 GB [+$100.00]')]")
    WebElement _HDDRadioButton;
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']//li[2]//label[contains(text(),'Vista Premium [+$60.00]')]")
    WebElement _OSRadioButton;
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//li[3]/input")
    WebElement _TotalCommanderCheckBox;
    @FindBy(xpath = "//span[contains(text(),'$1,475.00')]")
    WebElement _getTextPriceVerify;
    @FindBy(xpath = "//input[@id='add-to-cart-button-1']")
    WebElement _addToCartButton;
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement _getTextFromCart;
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement _closeXButton;
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement _shoppingCartTab;
    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/input[1]")
    WebElement _goToCartButton;


    //This method will get build your own computer text
    public String getBuildYourOwnComputerText() {
        Reporter.log("Get message build your own computer " + _getBuildYourOwnComputerText.toString() + "<br>");
        String getMessage = getTextFromElement(_getBuildYourOwnComputerText);
        log.info("Get message build your own computer" + _getBuildYourOwnComputerText.toString());
        return getMessage;
    }
    //This method will select processor from drop down
    public void selectProcessorFromField(int index) {
        Reporter.log("select 2.2 GHz Intel Pentium Dual-Core E2200 " + _ProcessordropDown.toString() + "<br>");
        clickOnElement(_ProcessordropDown);
        selectByIndexFromDropDown(_ProcessordropDown, index);
        log.info("select 2.2 GHz Intel Pentium Dual-Core E2200" + _getBuildYourOwnComputerText.toString());
    }

    //This method will select RAM from RAM field
    public void selectRAMFromField(int index) {
        Reporter.log("select 8GB RAM  " + _RAMDropDown.toString() + "<br>");
        selectByIndexFromDropDown(_RAMDropDown, index);
        log.info("select 8GB RAM " + _RAMDropDown.toString());
    }

    //This method will click on HDD radio button Vista Premium [+$60.00]
    public void clickOnHDDRadioBtn() {
        Reporter.log("click on HDD radio button  " + _HDDRadioButton.toString() + "<br>");
        clickOnElement(_HDDRadioButton);
        log.info("click on HDD radio button  " + _HDDRadioButton.toString());
    }

    //This method will click on HDD radio button Vista Premium [+$60.00]
    public void clickOnOSRadioBtn() {
        Reporter.log("click on OS radio button  " + _OSRadioButton + "<br>");
        clickOnElement(_OSRadioButton);
        log.info("click on OS radio button  " + _OSRadioButton.toString());
    }

    //This method will click on To0tal Commander [+$5.0]
    public void clickOnTotalCommanderCheckBox() {
        Reporter.log("click on Total Commander [+$5.0] " + _TotalCommanderCheckBox.toString() + "<br>");
        mouseHoverToElementAndClick(_TotalCommanderCheckBox);
        log.info("click on Total Commander [+$5.0]  " + _TotalCommanderCheckBox.toString());
    }

    //This method will Verify the price "$1,475.00
    public String VerifyPriceUpdatedSuccessfully() {
        Reporter.log("Verify the price $1,475.00  " + _getTextPriceVerify.toString() + "<br>");
       String getMessage = getTextFromElement(_getTextPriceVerify);
        log.info("Verify the price $1,475.00  " +_getTextPriceVerify.toString());
        return getMessage;
    }
    //This method will click on Add to cart btn
    public void VerifyAddToCartButton() {
        Reporter.log("click on add to cart btn" + _addToCartButton.toString()+ "<br>");
        clickOnElement(_addToCartButton);
        log.info("click on add to cart btn " +_addToCartButton.toString());
    }
    //This method will get text from add to cart button
    public String VerifyThatAddToCartButtonSuccessfully() {
        Reporter.log("get text from to verify " + _getTextFromCart.toString() + "<br>");
       String getMessage= getTextFromElement(_getTextFromCart);
        log.info("get text from to verify " + _getTextFromCart.toString());
        return getMessage;
    }
    //this method will click on cross button
    public void clickToCrossBtnToClose() {
        Reporter.log("clicking on close button  " + _closeXButton.toString()+ "<br>");
        mouseHoverToElementAndClick(_closeXButton);
        log.info("clicking on close button  " + _closeXButton.toString());
    }
    //This method will mouse hover to shopping cat btn
    public void mouseHoverToShoppingCart() {
        Reporter.log("clicking on shopping cart  " + _shoppingCartTab.toString() + "<br>");
        mouseHoverToElement(_shoppingCartTab);
        log.info("clicking on shopping cart  " + _shoppingCartTab.toString());
    }
    //This method will click go to cart
    public void clickOnGoToCart() {
        Reporter.log("clicking on shopping cart  " +_goToCartButton.toString() + "<br>");
        clickOnElement(_goToCartButton);
        log.info("licking on shopping cart  " +_goToCartButton.toString());
    }
}