package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @FindBy(xpath = "//div[@class='border box padT20 ng-scope']/div/button[3]")
    WebElement _customersBtn;
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement _homeBtn;
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement _logoutBtn;
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement _getMessage;

    //This method will click on open customers btn
    public void clickOnCustomerBtn() {
        Reporter.log("clicking on customers btn " + _customersBtn.toString() + "<br>");
        clickOnElement(_customersBtn);
        log.info("clicking on customers btn " + _customersBtn.toString());
    }

    //This method will click on open customers btn
    public void clickOnHomeBtn() {
        Reporter.log("clicking on home btn " + _homeBtn.toString() + "<br>");
        clickOnElement(_homeBtn);
        log.info("clicking on home btn " + _homeBtn.toString());
    }

    //This method will verify message

    public void verifyYourNameDisplay(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // String actualMessage =  "Your Name :";
        Assert.assertEquals(getTextFromElement(_getMessage),"Your Name :");
    }


    //This method will get text from logout
    public void clickOnLogoutBtn() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Reporter.log("clicking on logout btn " + _logoutBtn.toString() + "<br>");
        log.info("clicking on logout btn " + _logoutBtn.toString());
        clickOnElement(_logoutBtn);
    }

    //This method to verify logout btn

        public boolean isLogoutDisplayed() {
            Reporter.log("verification of logout btn " + _logoutBtn.toString() + "<br>");
            log.info("verification of logout btn " + _logoutBtn.toString());

            return verifyThatElementIsDisplayed(_logoutBtn);
    }
}




