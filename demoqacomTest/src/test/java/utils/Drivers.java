package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Drivers {
    private static final String DRIVERPATH = "src/test/resources/";
    private static WebDriver driver;

    public static WebDriver getDriver (Browser browser) {
        File file;

        switch (browser) {
            case CHROME:
          //      file = new File(DRIVERPATH + "chromedriver.exe");
              //  System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                break;

           /* case SAFARI:
                SafariOptions options = new SafariOptions();
                driver = new SafariDriver(options);*/

            case FIREFOX:
            //    file = new File(DRIVERPATH + "geckodriver.exe");
            //    System.setProperty("webdriver.firefox.marionette", file.getAbsolutePath());
                driver = new FirefoxDriver();
                break;

        }return driver;

    }
}
