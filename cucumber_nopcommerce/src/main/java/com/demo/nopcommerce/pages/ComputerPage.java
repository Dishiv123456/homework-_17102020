package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());


    @FindBy(xpath = "//a[contains(text(),' Desktops')]")
    WebElement _desktopTab;

    //This method will click on desktop tab

    public void clickOnDesktopTab() {
        waitUntilElementToBeClickable(_desktopTab,5000);
        Reporter.log("Clicking on desktop page" + _desktopTab.toString() + "<br>");
        clickOnElement(_desktopTab);
        log.info("Clicking on desktop page" + _desktopTab.toString());
    }
}