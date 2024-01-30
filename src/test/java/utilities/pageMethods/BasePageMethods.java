package utilities.pageMethods;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import utilities.DriverManager;

import java.io.File;
import java.time.Duration;
import java.util.List;


public class BasePageMethods extends BasePage {
    private File file = new File("src/test/ScreenShots");
    public Logger logger = LogManager.getLogger(BasePageMethods.class.getName());
    public boolean frameFlag;

    public BasePageMethods logOut() {
        click(profileBtn);
        click(exitBtn);
        return new BasePageMethods();
    }

    public String getUserName() {
        return userName.getText();
    }

    public void sendESC() {
        Actions action = new Actions(DriverManager.getDriver());
        action.sendKeys(Keys.ESCAPE).build().perform();
        logger.info("Send ESC");
    }

    public void sendEnter() {
        Actions action = new Actions(DriverManager.getDriver());
        action.sendKeys(Keys.ENTER).build().perform();
        logger.info("Send ENTER");
    }

    public BasePageMethods clickHomePage() {
        click(homeBtn);
        return this;
    }


    public WebDriver.Timeouts implicitlyWait(int waitTime) {
        return DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
    }

    public void click(WebElement webElement) {

        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.click();
            implicitlyWait(3);
            logger.info("Clicked element is " + webElement);
        } catch (Exception e) {
            clickByJS(webElement);
            logger.info(e + "--------- clicked by js ");
        }
    }

    public void click(WebElement webElement, int i) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(i));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
        implicitlyWait(i);
        logger.info("Clicked element is " + webElement);
    }

    public void rightClick(WebElement webElement) {
        Actions actions = new Actions(DriverManager.getDriver());
        actions.contextClick(webElement).perform();
    }

    public void waitUntilVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilVisible(WebElement webElement, int i) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(i));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilVisible(List<WebElement> webElement) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
    }

    public void waitUntilInvisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void waitUntilInvisible(WebElement webElement, int i) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(i));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void waitUntilClickable(WebElement webElement, int time) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void switchFrame(int i) {
        implicitlyWait(2);
        DriverManager.getDriver().switchTo().frame(i);
        logger.info("Switched " + i + ". frame");
        frameFlag = true;
    }


    public void refreshPage() {
        DriverManager.getDriver().navigate().refresh();
        implicitlyWait(10);
        logger.info("Driver navigate to refresh page.");
    }

    public void pageDown() {
        new Actions(DriverManager.getDriver()).sendKeys(Keys.END).perform();
        logger.info("Sent key PageDown");
    }

    public void pageUp() {
        new Actions(DriverManager.getDriver()).sendKeys(Keys.ARROW_UP).perform();
        logger.info("Sent key PageUP");
    }

    public void waitUntilPresence(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.presenceOfElementLocated((By) webElement));
    }

    public void clickByJS(WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) DriverManager.getDriver());
        js.executeScript("arguments[0].click();", element);
        logger.info("Clicked By JS to " + element);
    }

    public void doubleClick(WebElement element) {
        Actions actions = new Actions(DriverManager.getDriver());
        actions.doubleClick(element).perform();
    }

    public void sendKeys(WebElement webElement, String string) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.sendKeys(string);
        implicitlyWait(5);
        logger.info("Sent text is " + string + " to " + webElement);
    }

    public void sendKeysPresence(WebElement webElement, String string) {
        waitUntilPresence(webElement);
        webElement.sendKeys(string);
        logger.info("Sent text is " + string + " to " + webElement);
    }


    public boolean isClickable(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            click(element);
            logger.info(element + " is clickable");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void hoverOver(WebElement element) {
        Actions act = new Actions(DriverManager.getDriver());
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOf(element));
        act.moveToElement(element).build().perform();
        logger.info("element is " + element);

    }

    public void arrowDown() {
        new Actions(DriverManager.getDriver()).sendKeys(Keys.ARROW_DOWN).perform();
        logger.info("Sent key ArrowDown");
    }

    public void arrowUp() {
        new Actions(DriverManager.getDriver()).sendKeys(Keys.ARROW_UP).perform();
        logger.info("Sent key Arrow Up");
    }

    public void pageAllDown() {
        new Actions(DriverManager.getDriver()).sendKeys(Keys.END).perform();
        logger.info("Sent key ArrowDown");
    }

    public void moveToElementByJS(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) DriverManager.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", element);
    }

    public void waitUntilTextVisible(WebElement element) {
        (new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return element.getText().length() != 0;
            }
        });
    }

    public void scrollSpecificElement(WebElement element) {
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        logger.info("scrolled By JS to " + element);
    }


}