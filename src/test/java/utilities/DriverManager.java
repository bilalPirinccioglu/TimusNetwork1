package utilities;

import io.cucumber.java.an.E;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
    private static WebDriver driver;
    private DriverManager() {
    }
    static Logger logger = LogManager.getLogger(DriverManager.class.getName());



    public static WebDriver getDriver() {
        ChromeOptions options = new ChromeOptions();
        try {
            if (driver == null) {
                String browser = ConfigReader.getProperty("browser");
                if ("chrome".equals(browser)) {
                    //options.addArguments("--headless");
                    //options.addArguments("--window-size=1920,1080");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    options.addArguments("--disk-cache-size=0");
                    System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win64\\chromedriver.exe");
                    driver = new ChromeDriver(options);
//                } else if ("firefox".equals(browser)) {
//                    FirefoxOptions optionsFirefox = new FirefoxOptions();
//                    optionsFirefox.addArguments("--headless");
//                    WebdriverM.firefoxdriver().setup();
//                    driver = new FirefoxDriver(optionsFirefox);
//                } else if ("ie".equals(browser)) {
//                    WebDriverManager.iedriver().setup();
//                    driver = new InternetExplorerDriver();
//                } else if ("safari".equals(browser)) {
//                    WebDriverManager.getInstance(SafariDriver.class).setup();
//                    driver = new SafariDriver();
//                } else if ("chrome-headless".equals(browser)) {
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                }
            }
            driver.manage().window().maximize();
            return driver;
        }
        catch (Exception e ){
            closeDriver();
            //options.addArguments("--headless");
            //options.addArguments("--window-size=1920,1080");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disk-cache-size=0");
            System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

            driver = new ChromeDriver(options);

            return driver;
        }


    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            logger.info("Driver Closed......");

        }
    }
}