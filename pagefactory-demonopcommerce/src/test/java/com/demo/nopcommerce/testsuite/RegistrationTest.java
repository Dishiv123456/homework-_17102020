package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.CartPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegistrationPage registrationPage;
    CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registrationPage = new RegistrationPage();
        cartPage = new CartPage();
    }

    @Test(groups = {"smoke", "regression"})
    public void VerifyUserNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registrationPage.getRegistrationText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldAbleTORegisterSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        Thread.sleep(1000);
        registrationPage.selectRadioBtn();
        Thread.sleep(1000);
        registrationPage.enterFirstName("Ram");
        registrationPage.enterLastName("Krishna");
        registrationPage.selectDayFromDateOfBirthDropDown("10");
        registrationPage.selectMonthFromDateOfBirthDropDown("May");
        registrationPage.selectYearFromDateOfBirthDropDown("1985");
        int num = generateRandomNumber();
        registrationPage.enterEmailId("ramkrishna" + num + "@gmail.com");
        registrationPage.enterCompanyName("Prime Testing");
        registrationPage.enterPassword("123456");
        registrationPage.enterConfirmPassword("123456");
        registrationPage.clickOnRegisterButton();
        String expected = "Your registration completed";
        String actualResult= cartPage.verifyRegistrationSuccessfullyMessage();
        Assert.assertEquals(expected, actualResult);
    }
}