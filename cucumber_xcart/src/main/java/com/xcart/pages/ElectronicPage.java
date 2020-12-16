package com.xcart.pages;

import com.xcart.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicPage extends Utility {
    private static final Logger log = LogManager.getLogger(ElectronicPage.class.getName());

    @FindBy(xpath = "//h1[@id='page-title']")
    WebElement _electronicButton;

    //This method will click on electronic button
    public String clickOnElectronicButton() {
        Reporter.log("Clicking on electronic button" + _electronicButton.toString() + "<br>");
        log.info("Clicking on electronic button" + _electronicButton.toString());
        return getTextFromElement(_electronicButton);
    }


}
