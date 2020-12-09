package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @FindBy(xpath ="//select[@id='products-orderby']")
         //   By.xpath("//select[@id='products-orderby']");
    WebElement _sortByDropDown;
    @FindBy(xpath = "//option[contains(text(),'Name: Z to A')]")
    WebElement _selectZToAFromDropDown;
    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement _selectAToZFromDropDown;
    @FindBy(xpath = "//body/div[6]//div[1]/div/div[2]/div[3]/div[2]/input[1]")
    WebElement _addToCartButton;
    @FindBy(xpath = "//h2[@class='product-title']")
    List<WebElement> _productTitle;

    //This method will click on sort by mouse hover
    public void clickOnSortBy() {
        waitUntilElementToBeClickable(_sortByDropDown,5);
        Reporter.log("mouse hover to sort by  and click  " + _sortByDropDown.toString() + "<br>");
      mouseHoverToElementAndClick(_sortByDropDown);
       log.info("mouse hover to sort by  and click" + _sortByDropDown.toString());
    }
    //This method will click on Z to A from drop down
    public void clickOnZToAFromDropDown() {
        Reporter.log("Clicking on z to a from Drop Down " +_selectZToAFromDropDown.toString() + "<br>");
      clickOnElement(_selectZToAFromDropDown);
        log.info("Clicking on z to a from Drop Down" + _selectZToAFromDropDown.toString());
    }
    //This method will click on A to Z from drop down
    public void clickOnAToZFromDropDown() {
        Reporter.log("Clicking on A to Z from Drop Down " + _selectAToZFromDropDown.toString() + "<br>");
        clickOnElement(_selectAToZFromDropDown);
        log.info("Clicking on A to Z from Drop Down" + _selectAToZFromDropDown.toString());
    }

    //This method will click on add to cart button
    public void VerifyClickOnAddToCart() {
        Reporter.log("clicking on add to cart btn  " + _addToCartButton.toString() + "<br>");
        clickOnElement(_addToCartButton);
        log.info("clicking on add to cart btn" + _addToCartButton.toString());
    }
     //This method will verify get text in reverse

    public void setProductTitleByReverseOrder(){
Reporter.log("Products title in reverse order "+_productTitle.toString()+"<br>");
        List<String> deskTopNames = new ArrayList<>();
        for (WebElement deskTop : _productTitle) {
            deskTopNames.add(deskTop.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(deskTopNames);
        Collections.sort(tempList, Collections.reverseOrder());
        Assert.assertEquals(deskTopNames, tempList);
        log.info("Products title in reverse order "+_productTitle.toString());
    }
}




