package uk.co.southalltravel.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.southalltravel.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//body/form[@id='Form1']/div[4]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")
    WebElement _destinationtab;
    @FindBy(xpath = "//body/form[@id='Form1']/div[4]/div[1]/div[1]/div[1]/div[5]/ul[3]/li[1]/a[1]")
    WebElement _indiaTab;


    //click on destination
    public void  clickDestinationTab(){
        Reporter.log("Clicking on Destination Tab"+_destinationtab.toString()+"<br>");
        log.info("Clicking on Destination Tab"+_destinationtab.toString());
        clickOnElement(_destinationtab);

    }
    public void  clickOnIndiaTab(){
        Reporter.log("Clicking on india Tab"+_indiaTab.toString()+"<br>");
        log.info("Clicking on india Tab"+_indiaTab.toString());
        clickOnElement(_indiaTab);

    }

}
