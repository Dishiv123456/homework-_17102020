package nopcommerceselenium;

import basetest.BaseClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegistrationTest extends BaseClass {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void startUp() {
        openBrowser(baseUrl);
    }

    @After
    public void tearDown() {
        //  closeBrowser();
    }

    @Test
    public void verifyThatUserIsOnRegistrationPage() {
        clickOnElement(By.xpath("//a[@class='ico-register']"));
        clickOnElement(By.xpath("//label[contains(text(),'Male')]"));
        sendTextToElement(By.id("FirstName"), "ram");
        sendTextToElement(By.id("LastName"), "krishna");
        sendTextToElement(By.xpath("//form[1]//select[1]"), "10");
        sendTextToElement(By.xpath("//form[1]//select[2]"), "01");
        sendTextToElement(By.xpath("//form[1]//select[3]"), "2020");
        Random randomGenerator = new Random(); //random object
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(By.id("Email"), "ramkrishna" + randomInt+ "@yahoo.com");
        sendTextToElement(By.xpath("//input[@id='Company']"), "PrimeTesting");
        clickOnElement(By.xpath("//label[contains(text(),'Newsletter:')]"));
        sendTextToElement(By.id("Password"), "123456");
        sendTextToElement(By.id("ConfirmPassword"), "123456");
        clickOnElement(By.id("register-button"));
        String expected = "Your registration completed";
        String actualResult= getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        Assert.assertEquals(expected, actualResult);
    }

}
