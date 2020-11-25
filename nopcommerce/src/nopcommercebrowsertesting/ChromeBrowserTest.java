package browsertesting;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {
    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://www.nopcommerce.com/demo"; //variable declare for URL
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //set property for driver path
        WebDriver driver = new ChromeDriver(); //object created for chrome driver
        driver.manage().window().setPosition(new Point(+2000, 0));//to open in 2nd screen
        driver.manage().window().maximize();//to maximize window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //waiting time
        driver.get(baseUrl);
        Thread.sleep(5000);
        driver.quit();


    }
}
