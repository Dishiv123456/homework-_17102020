package com.xcart.pages;

import com.xcart.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class FitnessTrackerSmartWatchPage extends Utility {

    private static final Logger log = LogManager.getLogger(FitnessTrackerSmartWatchPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Fitness Tracker Smart Watch')]")
    WebElement _getTextFitnessTracker;

    //This method will get text from fitness tracker

    public String getTextFromFitnessTracker() {
        Reporter.log("get text from fitness tracker smart watch" + _getTextFitnessTracker + "<br>");
        log.info("get text from fitness tracker smart watch" + _getTextFitnessTracker);
        return getTextFromElement(_getTextFitnessTracker);
    }


}
