package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import utilities.pageMethods.BasePageMethods;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class ReusableMethods extends BasePageMethods {

    public static void wait(int secs) {

        try {
            Thread.sleep(1000 * secs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void moveToElement(WebElement dragElement,WebElement dropElement) {
        new Actions(DriverManager.getDriver()).dragAndDrop(dragElement,dropElement).perform();
    }
    public  WebElement fluentWait(final WebElement webElement, int timeout) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(DriverManager.getDriver())
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(1));
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }

    public  void waitUntilPresent(List<WebElement> webElements){
        int time = 0 ;
        while (webElements != null && time <=3 ){
            time+=1;
            wait(1);
        }
    }
    public  void waitUntilPresent(List<WebElement> webElements, int i ){
        int time = 0 ;
        while (webElements != null && time <= i ){
            time+=1;
            wait(1);
        }
    }






}