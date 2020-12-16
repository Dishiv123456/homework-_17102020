package uk.co.xart.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.xcart.propertyreader.PropertyReader;
import uk.co.xcart.utility.Utility;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void openBrowser() {
        selectBrowser(browser);
    }

    @AfterMethod(groups = {"sanity","smoke","regression"})
    public void tearDown() {
        closeBrowser();
    }

}
