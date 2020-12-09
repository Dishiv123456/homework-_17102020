package com.demo.nopcommerce.stepdefs;

import com.demo.nopcommerce.pages.CartPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegistrationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        new RegistrationPage().getRegistrationText();
    }

    @And("^I select male radio button$")
    public void iSelectMaleRadioButton() {
        new RegistrationPage().selectRadioBtn();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) {
        new RegistrationPage().enterFirstName(firstName);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        new RegistrationPage().enterLastName(lastName);
    }

    @And("^I enter day \"([^\"]*)\"$")
    public void iEnterDay(String day) {
        new RegistrationPage().selectDayFromDateOfBirthDropDown(day);

    }

    @And("^I enter month \"([^\"]*)\"$")
    public void iEnterMonth(String month) {
        new RegistrationPage().selectMonthFromDateOfBirthDropDown(month);
    }

    @And("^I enter year \"([^\"]*)\"$")
    public void iEnterYear(String year) {
        new RegistrationPage().selectYearFromDateOfBirthDropDown(year);
    }


    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String companyName) {
        new RegistrationPage().enterCompanyName(companyName);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new RegistrationPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegistrationPage().enterConfirmPassword(confirmPassword);

    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegistrationPage().clickOnRegisterButton();
    }

    @Then("^I should be able to register and create account successfully$")
    public void iShouldBeAbleToRegisterAndCreateAccountSuccessfully() {
        Assert.assertEquals("Your registration completed", new CartPage().verifyRegistrationSuccessfullyMessage());
    }

    @And("^I enter random email address \"([^\"]*)\"$")
    public void iEnterRandomEmailAddress(String email)  {
        new RegistrationPage().enterEmailId(email);

    }
}