package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManager;
import utilities.TestResultLogger;

public class BasePage extends TestResultLogger {

    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    @FindBy(xpath = "//button[@data-testid='audit-detail-close']")
    public WebElement firstSingInLetsStartButton;
    @FindBy(xpath = "//div[@data-testid='components-header-xghppvvpyb']")
    public WebElement profileBtn;
    @FindBy(xpath = "//li[@data-testid='avatar-logout']")
    public WebElement exitBtn;
    @FindBy(xpath = "//span[@data-testid='avatar-dropdown']/span")
    public WebElement userName;
    @FindBy(xpath = "//a[@data-testid='header-manager-logo']")
    public WebElement homeBtn;


}

