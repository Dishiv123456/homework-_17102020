package uk.co.southalltravel.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.southalltravel.pages.DestinationPage;
import uk.co.southalltravel.pages.HomePage;
import uk.co.southalltravel.testbase.TestBase;

public class EndToEndTest extends TestBase {
    HomePage homePage;
    DestinationPage destinationPage;

    @BeforeMethod
    public void setUP() {
        homePage = new HomePage();
        destinationPage=new DestinationPage();
    }

    @Test
    public void userShouldNavigateToDestinationPageSuccessFully() {
        homePage.clickDestinationTab();
        homePage.clickOnIndiaTab();
        String expectedMessage ="India Holidays";
      //  String actualMessage=destinationPage.verifyText();
        Assert.assertEquals(expectedMessage,destinationPage.verifyText());
        System.out.println(destinationPage.verifyText());
    }


}

