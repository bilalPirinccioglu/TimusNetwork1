package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.*;
import utilities.*;
import utilities.pageMethods.BasePageMethods;

public class Hooks extends BasePageMethods {
    static Log log = new Log();


    @BeforeAll
    public static void openMainPage(){
        DriverManager.getDriver().get(ConfigReader.getProperty("main_page"));
        log.info("Main Page opened successfully");
    }
    @Before
    public void redirect(){
        DriverManager.getDriver().get(ConfigReader.getProperty("main_page"));
        log.info("Main Page opened successfully");
    }


    @AfterAll
    public static void closeBrowser(){
        DriverManager.closeDriver();
    }

}
