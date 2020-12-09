package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.CartPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegistrationPage registrationPage;
    CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registrationPage = new RegistrationPage();
        cartPage =new CartPage();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNotLoginSuccessfullyWithInvalidCredentials() throws InterruptedException {
        homePage.clickOnLoginLink();
        Thread.sleep(5000);
        loginPage.enterEmailId("ramkrishna@abc.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.VerifyErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test(groups = {"regression"})
    public void VerifyUserShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
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
        String email123 = registrationPage.enterEmailId("ramkrishna" + num + "@gmail.com");
        registrationPage.enterCompanyName("Prime Testing");
        registrationPage.enterPassword("123456");
        registrationPage.enterConfirmPassword("123456");
        registrationPage.clickOnRegisterButton();
        cartPage.clickOnLogOut();
        homePage.clickOnLoginLink();
        Thread.sleep(2000);
        loginPage.enterEmailId(email123);
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Welcome to our store";
        String actualMessage = homePage.VerifyLoginSuccessfully();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

}
