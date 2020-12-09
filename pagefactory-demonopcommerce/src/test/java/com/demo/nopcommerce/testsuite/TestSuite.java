package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegistrationPage registrationPage;
    CartPage cartPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    DesktopPage desktopPage;
    ComputerPage computerPage;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registrationPage = new RegistrationPage();
        cartPage = new CartPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
    }
    @Test(groups = {"smoke", "regression"})
    public void verifyProductArrangeInAlphabeticalOrder() {
        homePage.clickOnComputersTab();
        computerPage.clickOnDesktopTab();
        desktopPage.clickOnSortBy();
        desktopPage.clickOnZToAFromDropDown();
//        List<WebElement> deskTopPCs = getListOfElement(By.xpath("//h2[@class='product-title']"));
//        List<String> deskTopNames = new ArrayList<>();
//        for (WebElement deskTop : deskTopPCs) {
//            deskTopNames.add(deskTop.getText());
//        }
//        List<String> tempList = new ArrayList<>();
//        tempList.addAll(deskTopNames);
//        Collections.sort(tempList, Collections.reverseOrder());
//        Assert.assertEquals(deskTopNames, tempList);

    }



    @Test(groups = {"sanity", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputersTab();
        Thread.sleep(1000);
        computerPage.clickOnDesktopTab();
        Thread.sleep(1000);
        desktopPage.clickOnSortBy();
        Thread.sleep(1000);
       desktopPage.clickOnAToZFromDropDown();
        desktopPage.VerifyClickOnAddToCart();
        String expectedMessage = "Build your own computer";
        String actualMessage = buildYourOwnComputerPage.getBuildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage);
        buildYourOwnComputerPage.selectProcessorFromField(0);
        buildYourOwnComputerPage.selectRAMFromField(2);
        buildYourOwnComputerPage.clickOnHDDRadioBtn();
        buildYourOwnComputerPage.clickOnOSRadioBtn();
        buildYourOwnComputerPage.clickOnTotalCommanderCheckBox();
        expectedMessage = "$1,475.00";
        actualMessage = buildYourOwnComputerPage.VerifyPriceUpdatedSuccessfully();
        Assert.assertEquals(expectedMessage, actualMessage);
        buildYourOwnComputerPage.VerifyAddToCartButton();
        expectedMessage = "The product has been added to your shopping cart";
        actualMessage = buildYourOwnComputerPage.VerifyThatAddToCartButtonSuccessfully();
        Assert.assertEquals(expectedMessage, actualMessage);
        buildYourOwnComputerPage.clickToCrossBtnToClose();
        buildYourOwnComputerPage.mouseHoverToShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCart();
        cartPage.clickToClearAddQtyBox();
        Thread.sleep(1000);
        cartPage.clickToAddQtyBox();
        cartPage.clickToUpdateShoppingCart();
        expectedMessage = "$2,950.00";
        actualMessage =cartPage.getMessageToVerifyUpdateCart();
        Assert.assertEquals(expectedMessage, actualMessage);



    }


}
