package actionclass;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import sun.net.dns.ResolverConfiguration;

public class TestKeyBoardEvent extends BaseTest {
    private String baseUrl ="https://letskodeit.teachable.com/p/practice";

    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @After
    public void tearDown(){
        // closeBrowser();
    }
    @Test
public void keyBoardExample(){
    Actions actions=new Actions(driver);
    driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL+"a");
    actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

    driver.findElement(By.id("name")).click();

    actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

}

}
