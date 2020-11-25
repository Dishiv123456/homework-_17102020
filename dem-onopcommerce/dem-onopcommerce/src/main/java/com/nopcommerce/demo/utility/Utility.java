package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Utility {
    public WebDriver driver;

    /**
     * this method will click on element
     *
     * @param by
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    //this method will send text to element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);

    }

    public void sendTextToElement(WebElement element, String text) {
        element.sendKeys(text);

    }

    //this method will get text on element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    //this method is to select by value
    public void selectBYValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }

    public void selectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    //this method is to select by index

    public void selectByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public void selectByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    //this method is to select by String
    public void selectByString(By by, String string) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(string);
    }

    private void selectByString(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByValue(text);

    }

    //wait till click on element
    public void waitUntilElementToBeClickable(By by, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));

    }

    public void waitUntilElementToBeClickable(WebElement element, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    //click till element located
    public void waitUntilVisibilityOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitUntilVisibilityOfElementLocated(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
   //      wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    //fluent wait method


    //action mouse hover to element
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void mouseHoverToElemet(WebElement webElement) {
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).perform();
    }

    //action mouse hover to element and click;
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }

    public void mouseHoverToElementAndClick(WebElement webElement) {
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).click().perform();
    }

    //scroll down
    public void scrollDown(int x, int y) {
        JavascriptExecutor jse;
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(x,y)");

    }

    //random string
    public String getRandomString() {
        Random random = new Random();
        String randomString = random.toString();
        return randomString;
    }

    //random in numeric
    public int getRandomNumeric() {
        Random random = new Random();
        int number = random.nextInt();
        return number;
    }

}
