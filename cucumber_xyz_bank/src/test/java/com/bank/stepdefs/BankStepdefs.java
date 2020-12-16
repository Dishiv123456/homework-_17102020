package com.bank.stepdefs;

import com.bank.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankStepdefs {
    @Given("^i enter URL and i am on home page$")
    public void iEnterURLAndIAmOnHomePage() {
    }

    @When("^i click on manager login link$")
    public void iClickOnManagerLoginLink() {
        new HomePage().clickOnManagerLoginLink();
    }

    @And("^i click on add customer link$")
    public void iClickOnAddCustomerLink() {
        new BankManagerLoginPage().clickOnAddCustomerLink();
    }

    @And("^i enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
       new AddCustomerPage().enterFirstName(firstName);
    }

    @And("^i enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
       new AddCustomerPage().enterLastName(lastName);
    }

    @And("^i enret post code \"([^\"]*)\"$")
    public void iEnretPostCode(String postCode)  {
        new AddCustomerPage().enterPostCode(postCode);
    }

    @And("^i click on add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickToAddCustomerBtn();
    }

    @Then("^pop up window should open ans verify text and click on$")
    public void popUpWindowShouldOpenAnsVerifyTextAndClickOn() {
        new AddCustomerPage().verifyPopUpMessage();
    }

    @And("^i click on open account button$")
    public void iClickOnOpenAccountButton() {
        new BankManagerLoginPage().clickOnOpenAccountBtn();
    }

    @And("^i click on customer dropdown \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iClickOnCustomerDropdownAnd(String name, int index){
        new OpenAccountPage().clickOnCustomerDropDown(name,index);
    }

    @And("^i click on dropdoen and select pound \"([^\"]*)\"$")
    public void iClickOnDropdoenAndSelectPound(int index)  {
        new OpenAccountPage().clickOnPoundFromDropDown(index);

    }

    @And("^i click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessBtn();
    }

    @Then("^i should be able to open created account successfully$")
    public void iShouldBeAbleToOpenCreatedAccountSuccessfully() {
        new OpenAccountPage().verifyAccountCreatedSuccessfully();
    }

    @And("^i click on home page$")
    public void iClickOnHomePage() {
        new CustomersPage().clickOnHomeBtn();
    }

    @And("^i click on customer login link$")
    public void iClickOnCustomerLoginLink() {
        new HomePage().clickOnCustomerLoginLink();
    }

    @And("^i click on login button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginBtn();
    }

    @And("^i verify that log out button is displayed$")
    public void iVerifyThatLogOutButtonIsDisplayed() {
        new CustomersPage().isLogoutDisplayed();
    }

    @And("^i click on log out button$")
    public void iClickOnLogOutButton() {
        new CustomersPage().clickOnLogoutBtn();
    }

    @Then("^user should be able to see YourName is display$")
    public void userShouldBeAbleToSeeYourNameIsDisplay() {
    new CustomersPage().verifyYourNameDisplay();
    }

    @And("^i click on deposit tab$")
    public void iClickOnDepositTab() {
        new AccountPage().ClickOnDepositTab();
    }

    @And("^i enter deposit money \"([^\"]*)\"$")
    public void iEnterDepositMoney(String money)  {
       new AccountPage().depositMoney(money);
    }

    @And("^i click on deposit final tab$")
    public void iClickOnDepositFinalTab() {
        new AccountPage().ClickOnDepositFinalTab();
    }

    @Then("^deposit should be added successfully verification message$")
    public void depositShouldBeAddedSuccessfullyVerificationMessage() {
        new AccountPage().getMessageToVerifyDeposit();
    }

    @And("^i click on withdrawal button$")
    public void iClickOnWithdrawalButton() {
        new AccountPage().clickToWithdrawalBtn();
    }


    @And("^i enter withdrawal amount \"([^\"]*)\"$")
    public void iEnterWithdrawalAmount(String amount) {
        new AccountPage().enterWithdrawalAmount(amount);
    }

    @And("^i click on withdrawal final tab$")
    public void iClickOnWithdrawalFinalTab() {
        new AccountPage().ClickOnWithdrawalFinalTab();
    }

    @Then("^i should get message that transaction successful$")
    public void iShouldGetMessageThatTransactionSuccessful() {
        new AccountPage().getMessageToVerify();
    }
}
