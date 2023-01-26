package tests;

import org.testng.annotations.*;
import utils.Browser;
import utils.Drivers;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class BaseTest {
    String url;

    public BaseTest(String url) {
        this.url = url;
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp() {

        driver = Drivers.getDriver(Browser.CHROME);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().to(url);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void goToBegin() {
        driver.navigate().to(url);
    }

}
