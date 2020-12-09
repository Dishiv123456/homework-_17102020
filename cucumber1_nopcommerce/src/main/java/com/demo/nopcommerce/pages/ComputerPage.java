package com.demo.nopcommerce.pages;

import com.cucumber.listener.Reporter;
import com.demo.nopcommerce.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());


    @FindBy(xpath = "//a[contains(text(),' Desktops')]")
    WebElement _desktopTab;

    //This method will click on desktop tab

    public void clickOnDesktopTab() throws InterruptedException {
//waitUntilElementToBeClickable(_desktopTab,10);
      waitFor(5);
        Reporter.addStepLog("Clicking on desktop page" + _desktopTab.toString() + "<br>");
        clickOnElement(_desktopTab);
        log.info("Clicking on desktop page" + _desktopTab.toString());
    }
}