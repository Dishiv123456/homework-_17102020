package wchtbrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowserTest {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = " https://www.wcht.org.uk/ ";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // driver.manage().window().setPosition(new Point(+2000,0));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        Thread.sleep(5000);
        driver.quit();
    }
}