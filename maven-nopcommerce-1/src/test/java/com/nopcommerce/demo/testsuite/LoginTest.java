package com.nopcommerce.demo.resources.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.resources.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyUserShouldNotLoginSuccessfullyWithInvalidCredentials() throws InterruptedException {
        homePage.clickOnLoginLink();
        Thread.sleep(5000);
        loginPage.loginToApplication("abcd@gmail.com","123456");
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualMessage);
    }
}
