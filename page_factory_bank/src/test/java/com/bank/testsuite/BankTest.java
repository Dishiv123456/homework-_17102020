package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    Homepage homepage = new Homepage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customersPage = new CustomersPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homepage.clickOnManagerLoginLink();
        bankManagerLoginPage.clickOnAddCustomerLink();
        addCustomerPage.enterFirstName("Ram");
        addCustomerPage.enterLastName("Krishna");
        addCustomerPage.enterPostCode("NW1 5BW");
        addCustomerPage.clickToAddCustomerBtn();
        alertHandle();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homepage.clickOnManagerLoginLink();
        bankManagerLoginPage.clickOnAddCustomerLink();
        addCustomerPage.enterFirstName("Ram");
        addCustomerPage.enterLastName("Krishna");
        addCustomerPage.enterPostCode("NW1 5BW");
        addCustomerPage.clickToAddCustomerBtn();
        alertHandle();
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDown("Ram Krishna", 6);
        openAccountPage.clickOnPoundFromDropDown(2);
        openAccountPage.clickOnProcessBtn();
        alertHandle();
    }

    @Test
    public void customerShouldLoginAndLogoutSuceessfully() {
        homepage.clickOnManagerLoginLink();
        bankManagerLoginPage.clickOnAddCustomerLink();

        addCustomerPage.enterFirstName("Ram");
        addCustomerPage.enterLastName("Krishna");
        addCustomerPage.enterPostCode("NW1 5BW");
        addCustomerPage.clickToAddCustomerBtn();
        alertHandle();
        customersPage.clickOnHomeBtn();
        homepage.clickOnCustomerLoginLink();
        openAccountPage.clickOnCustomerDropDown("Ram Krishna", 6);
        customerLoginPage.clickOnLoginBtn();
        customersPage.isLogoutDisplayed();
        customersPage.clickOnLogoutBtn();
        String expectedMessage = "Your Name :";
        String actualMessage = customersPage.getMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homepage.clickOnManagerLoginLink();
        bankManagerLoginPage.clickOnAddCustomerLink();
        addCustomerPage.enterFirstName("Ram");
        addCustomerPage.enterLastName("Krishna");
        addCustomerPage.enterPostCode("NW1 5BW");
        addCustomerPage.clickToAddCustomerBtn();
        alertHandle();
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDown("Ram Krishna", 6);
        openAccountPage.clickOnPoundFromDropDown(2);
        openAccountPage.clickOnProcessBtn();
        alertHandle();
        customersPage.clickOnHomeBtn();
        homepage.clickOnCustomerLoginLink();
        openAccountPage.clickOnCustomerDropDown("Ram Krishna", 6);
        customerLoginPage.clickOnLoginBtn();
        accountPage.ClickOnDepositTab();
        accountPage.depositMoney("100");
        accountPage.ClickOnDepositFinalTab();
        String expectedMessage = "Deposit Successful";
        String actualMessage = accountPage.getMessageToVerifyDeposit();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        homepage.clickOnManagerLoginLink();
        bankManagerLoginPage.clickOnAddCustomerLink();
        addCustomerPage.enterFirstName("Ram");
        addCustomerPage.enterLastName("Krishna");
        addCustomerPage.enterPostCode("NW1 5BW");
        addCustomerPage.clickToAddCustomerBtn();
        alertHandle();
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickOnCustomerDropDown("Ram Krishna", 6);
        openAccountPage.clickOnPoundFromDropDown(2);
        openAccountPage.clickOnProcessBtn();
        alertHandle();
        customersPage.clickOnHomeBtn();
        homepage.clickOnCustomerLoginLink();
        openAccountPage.clickOnCustomerDropDown("Ram Krishna", 6);
        customerLoginPage.clickOnLoginBtn();
        accountPage.ClickOnDepositTab();
        accountPage.depositMoney("100");
        accountPage.ClickOnDepositFinalTab();
        String expectedMessage = "Deposit Successful";
        String actualMessage = accountPage.getMessageToVerifyDeposit();
        Assert.assertEquals(expectedMessage, actualMessage);
        customersPage.clickOnHomeBtn();
        homepage.clickOnCustomerLoginLink();
        openAccountPage.clickOnCustomerDropDown("Ram Krishna", 6);
        customerLoginPage.clickOnLoginBtn();
        accountPage.clickToWithdrawalBtn();
        accountPage.enterWithdrawalAmount("50");
        accountPage.ClickOnWithdrawalFinalTab();
         expectedMessage = "Transaction successful";
        actualMessage = accountPage.getMessageToVerify();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
}
